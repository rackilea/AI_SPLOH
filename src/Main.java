import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Map;

public class Main {

    /*
    def random_game(playerId):
      global _game, _gameId, _playerIndex
      res = get(url + '/train/random?playerId=' + str(playerId))
      _game = res['result']
      _gameId = _game['id']
      print("Game id: " + str(_gameId))
      _playerIndex = res['playerIndex']
      return res
     */

    public static void main(String[] args){
        String res = HttpHelper.GET("http://localhost:9080/train/random?playerId=1");
        System.out.println(res);

        try {
            JSONArray tiles = new JSONObject(res).getJSONObject("result").getJSONObject("map").getJSONArray("tiles");
            for(int i = 0; i < 20; ++i) {
                JSONArray row = tiles.getJSONArray(i);
                for(int j = 0; j < 20; ++j) {
                    JSONObject column = row.getJSONObject(j);
                    System.out.println(column.get("item") + " " + column.get("type"));
                }
            }
            /*machine.setId(jsonObject.getInt(Machine.ID));
            machine.setName(jsonObject.getString(Machine.NAME));
            machine.setDescription(jsonObject.getString(Machine.DESCRIPTION));
            machine.setActivePower(jsonObject.getDouble(Machine.ACTIVE_POWER));
            machine.setReactivePower(jsonObject.getDouble(Machine.REACTIVE_POWER));
            machine.setApparentPower(jsonObject.getDouble(Machine.APPARENT_POWER));*/

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
