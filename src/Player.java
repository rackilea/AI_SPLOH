public  class Player {

        int x;
        int y;
        
        Avatar type;
        int grassDiamonds;
        int fireDiamonds;
        int waterDiamonds;
        
        int health;
        int lives;
        int kills;
        int healthChange;

        public Player(int x, int y, Avatar type, int grassDiamonds, int fireDiamonds, int waterDiamonds, int health,
                int lives, int kills, int healthChange) {
            this.x = x;
            this.y = y;
            this.type = type;
            this.grassDiamonds = grassDiamonds;
            this.fireDiamonds = fireDiamonds;
            this.waterDiamonds = waterDiamonds;
            this.health = health;
            this.lives = lives;
            this.kills = kills;
            this.healthChange = healthChange;
        }
    }