public abstract class Pokemon{

   // Variables
   private int hp = 0;
   private int atk = 0;
   private int def = 0;
   private int spd = 0;
   private int acc = 0;
   private boolean fire = false;
   private boolean water = false;
   private boolean grass = false;
   private boolean electric = false;
   private boolean ground = false;
   private boolean fight = false;
   private boolean flying = false;
   private boolean psychic = false;
   private boolean dark = false;
   private boolean dragon = false;
   private boolean ghost = false;
   private boolean rock = false;
   private boolean bug = false;
   private boolean poison = false;
   private boolean ice = false;
   private boolean steel = false;
   private boolean normal = false;
   
   public Pokemon(){
      this.hp = (int)(Math.random() * 200) + 100;
      this.atk = (int)(Math.random() * 24) + 1;
      this.def = (int)(Math.random() * 100) + 1;
      this.spd = (int)(Math.random() * 100) + 1;
      this.acc = (int)(Math.random() * 100) + 1;
   }
   
   public Pokemon(boolean fire2, boolean water2, boolean grass2, boolean electric2, boolean ground2, boolean fight2, boolean flying2, boolean psychic2, boolean dark2, boolean dragon2, boolean ghost2, boolean rock2, boolean bug2, boolean poison2, boolean ice2, boolean steel2, boolean normal2){
      this.hp = (int)(Math.random() * 50) + 100;
      this.atk = (int)(Math.random() * 24) + 1;
      this.def = (int)(Math.random() * 100) + 1;
      this.spd = (int)(Math.random() * 100) + 1;
      this.acc = (int)(Math.random() * 100) + 1;
      this.fire = fire2;
      this.water = water2;
      this.grass = grass2;
      this.electric = electric2;
      this.ground = ground2;
      this.fight = fight2;
      this.flying = flying2;
      this.psychic = psychic2;
      this.dark = dark2;
      this.dragon = dragon2;
      this.ghost = ghost2;
      this.rock = rock2;
      this.bug = bug2;
      this.steel = steel2;
      this.normal = normal2;
   }
   
   public Pokemon(int hp2, int atk2, int def2, int spd2, int acc2, boolean fire2, boolean water2, boolean grass2, boolean electric2, boolean ground2, boolean fight2, boolean flying2, boolean psychic2, boolean dark2){
      this.hp = hp2;
      this.atk = atk2;
      this.def = def2;
      this.spd = spd2;
      this.acc = acc2;
      this.fire = fire2;
      this.water = water2;
      this.grass = grass2;
      this.electric = electric2;
      this.ground = ground2;
      this.fight = fight2;
      this.flying = flying2;
      this.psychic = psychic2;
      this.dark = dark2;
   }
   
   // Methods
   
   public int getHp(){
      return hp;
   }
   
   public int getAtk(){
      return atk;
   }
   
   public int getDef(){
      return def;
   }
   
   public int getSpd(){
      return atk;
   }

   public int getAcc(){
      return acc;
   }
   
   public boolean getFire(){
      return fire;
   }       

   public boolean getWater(){
      return water;
   }  

   public boolean getGrass(){
      return grass;
   }  
   
   public boolean getElectric(){
      return electric;
   }          

   public boolean getGround(){
      return ground;
   }
   
   public boolean getFighting(){
      return fight;
   }
   
   public boolean getFlying(){
      return flying;
   }
   
   public boolean getPsychic(){
      return psychic;
   }
   
   public boolean getDark(){
      return dark;
   }
   public boolean getDragon(){
      return dragon;
   }
   public boolean getGhost(){
      return ghost;
   }
   public boolean getRock(){
      return rock;
   }
   public boolean getBug(){
      return bug;
   }
   public boolean getPoison(){
      return poison;
   }
   public boolean getIce(){
      return ice;
   }
   public boolean getSteel(){
      return steel;
   }
   public boolean getNormal(){
      return normal;
   }     

   public abstract int heal();

}