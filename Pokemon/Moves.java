public class Moves extends Pokemon{
   
   public Moves(){
      super();
   }
   
   public Moves(boolean fire2, boolean water2, boolean grass2, boolean electric2, boolean ground2, boolean fight2, boolean flying2, boolean psychic2, boolean dark2, boolean dragon2, boolean ghost2, boolean rock2, boolean bug2, boolean poison2, boolean ice2, boolean steel2, boolean normal2){
      super(fire2, water2, grass2, electric2, ground2, fight2, flying2, psychic2, dark2, dragon2, ghost2, rock2, bug2, poison2, ice2, steel2, normal2);   
   }
   
   // Methods
   
   public int heal(){
      int newHp = (int) (Math.random() * 20) + 1;
      return newHp; 
   }
   
   public int flameThrower(){
      boolean water2 = this.getWater();
      boolean grass2 = this.getGrass();
      boolean bug2 = this.getBug();
      boolean steel2 = this.getSteel();
      boolean ice2 = this.getIce();
      int newAtk = this.getAtk();
      if(water2){
         newAtk = this.getAtk() / 2;
      }
            
      if(grass2){
         newAtk = this.getAtk() * 2;
      }
      
      if(bug2){
         newAtk = this.getAtk() * 2;
      }
      
      if(steel2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ice2){
         newAtk = this.getAtk() * 2;
      }



      return newAtk;
   }
   
   public String getFlameThrower(){
      return "Flamethrower";
   }
   
   public int flameCharge(){
      boolean water2 = this.getWater();
      boolean grass2 = this.getGrass();
      boolean bug2 = this.getBug();
      boolean steel2 = this.getSteel();
      boolean ice2 = this.getIce();
      int newAtk = this.getAtk();
      if(water2){
         newAtk = this.getAtk() / 2;
      }
            
      if(grass2){
         newAtk = this.getAtk() * 2;
      }
      
      if(bug2){
         newAtk = this.getAtk() * 2;
      }
      
      if(steel2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ice2){
         newAtk = this.getAtk() * 2;
      }

      return newAtk;
   }
   
   public String getFlameCharge(){
      return "Flame Charge";
   }   
   
   public int tackle(){
      boolean ghost2 = this.getGhost();
      int newAtk = this.getAtk();
      if(ghost2){
         newAtk = this.getAtk() * 0;
      }
                  
      return newAtk;
   }
   
   public String getTackle(){
      return "Tackle";
   }   
   
   public int brickBreak(){
      boolean flying2 = this.getFlying();
      boolean ice2 = this.getIce();
      boolean rock2 = this.getRock();
      boolean steel2 = this.getSteel();
      boolean dark2 = this.getDark();
      boolean normal2 = this.getNormal();
      int newAtk = this.getAtk();
      if(flying2){
         newAtk = this.getAtk() / 2;
      }
            
      if(normal2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ice2){
         newAtk = this.getAtk() * 2;
      }
   
      if(rock2){
         newAtk = this.getAtk() * 2;
      }
      
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      if(steel2){
         newAtk = this.getAtk() * 2;
      }

      return newAtk;
   }
   
   public String getBrickBreak(){
      return "Brick Break";
   }   
   
   // Torterra Moves
   public int razorLeaf(){
      boolean water2 = this.getWater();
      boolean fire2 = this.getFire();
      boolean rock2 = this.getRock();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(fire2){
         newAtk = this.getAtk() / 2;
      }
            
      if(water2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ground2){
         newAtk = this.getAtk() * 2;
      }
      
      if(rock2){
         newAtk = this.getAtk() * 2;
      }

      return newAtk;
   }            
   
   public String getRazorLeaf(){
      return "Razor Leaf";
   }   
   
   public int woodHammer(){
      boolean water2 = this.getWater();
      boolean fire2 = this.getFire();
      boolean rock2 = this.getRock();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(fire2){
         newAtk = this.getAtk() / 2;
      }
            
      if(water2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ground2){
         newAtk = this.getAtk() * 2;
      }
      
      if(rock2){
         newAtk = this.getAtk() * 2;
      }

            return newAtk;
   }
   
   public String getWoodHammer(){
      return "Wood Hammer";
   }   
   
   public int swordsDance(){
      int newAtk = this.getAtk(); 
      return newAtk + 10;
   }
   
   public String getSwordsDance(){
      return "Swords Dance";
   }   
   
   public int energyBall(){
      boolean water2 = this.getWater();
      boolean fire2 = this.getFire();
      boolean rock2 = this.getRock();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(fire2){
         newAtk = this.getAtk() / 2;
      }
            
      if(water2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ground2){
         newAtk = this.getAtk() * 2;
      }
      
      if(rock2){
         newAtk = this.getAtk() * 2;
      }

      return newAtk;
   }
   
   public String getEnergyBall(){
      return "Energy Ball";
   }
   
   // Piplup Moves
   public int bubbleBeam(){
      boolean grass2 = this.getGrass();
      boolean fire2 = this.getFire();
      boolean rock2 = this.getRock();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(grass2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fire2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ground2){
         newAtk = this.getAtk() * 2;
      }
      
      if(rock2){
         newAtk = this.getAtk() * 2;
      }  
          
      return newAtk;
   }      
   
   public String getBubbleBeam(){
      return "Bubble Beam";
   }
   
   public int hydroPump(){
      boolean grass2 = this.getGrass();
      boolean fire2 = this.getFire();
      boolean rock2 = this.getRock();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(grass2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fire2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ground2){
         newAtk = this.getAtk() * 2;
      }
      
      if(rock2){
         newAtk = this.getAtk() * 2;
      }  
      
      return newAtk;
   }      
   
   public String getHydroPump(){
      return "Hydro Pump";
   }   
   
   public int waterPulse(){
      boolean grass2 = this.getGrass();
      boolean fire2 = this.getFire();
      boolean rock2 = this.getRock();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(grass2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fire2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ground2){
         newAtk = this.getAtk() * 2;
      }
      
      if(rock2){
         newAtk = this.getAtk() * 2;
      }  
      
      return newAtk;
   }      
   
   public String getWaterPulse(){
      return "Water Pulse";
   }   
   
   public int workUp(){
      int newAtk = this.getAtk();      
      return newAtk + 8;
   }      
   
   public String getWorkUp(){
      return "Work Up";
   }   
   
   // Luxray Moves
   public int thunderFang(){
      boolean water2 = this.getWater();
      boolean ground2 = this.getGround();
      boolean flying2 = this.getFlying();
      int newAtk = this.getAtk();
      if(ground2){
         newAtk = 0;
      }
            
      if(water2){
         newAtk = this.getAtk() * 2;
      }
      
      if(flying2){
         newAtk = this.getAtk() * 2;
      }

      return newAtk;
   }      
   
   public String getThunderFang(){
      return "Thunder Fang";
   }   
   
   public int thunderBolt(){
      boolean water2 = this.getWater();
      boolean ground2 = this.getGround();
      boolean flying2 = this.getFlying();
      int newAtk = this.getAtk();
       if(ground2){
         newAtk = 0;
      }
            
      if(water2){
         newAtk = this.getAtk() * 2;
      }
      
      if(flying2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getThunderBolt(){
      return "Thunder Bolt";
   }   
   
   public int voltTackle(){
      boolean water2 = this.getWater();
      boolean ground2 = this.getGround();
      boolean flying2 = this.getFlying();
      int newAtk = this.getAtk();
      if(ground2){
         newAtk = 0;
      }
            
      if(water2){
         newAtk = this.getAtk() * 2;
      }
      
      if(flying2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk + 5;
   }      
   
   public String getVoltTackle(){
      return "Volt Tackle";
   }   
   
   public int faintAttack(){
      boolean psychic2 = this.getPsychic();
      boolean ghost2 = this.getGhost();
      int newAtk = this.getAtk();            
      if(psychic2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ghost2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getFaintAttack(){
      return "Faint Attack";
   }
   
   // Diglett Moves
   public int Earthquake(){
      boolean fire2 = this.getFire();
      boolean electric2 = this.getElectric();
      boolean poison2 = this.getPoison();
      boolean rock2 = this.getRock();
      boolean steel2 = this.getSteel();
      boolean flying2 = this.getFlying();
      int newAtk = this.getAtk();
      if(flying2){
         newAtk = this.getAtk() * 0;
      }            
      if(fire2){
         newAtk = this.getAtk() * 2;
      }
      
      if(electric2){
         newAtk = this.getAtk() * 2;
      }
          
      if(poison2){
         newAtk = this.getAtk() * 2;
      }
      
      if(rock2){
         newAtk = this.getAtk() * 2;
      }
      
      if(steel2){
         newAtk = this.getAtk() * 2;
      }

      return newAtk;
   }      
   
   public String getEarthquake(){
      return "Earthquake";
   }      
   
   public int rockSlide(){
      boolean fire2 = this.getFire();
      boolean ice2 = this.getIce();
      boolean bug2 = this.getBug();
      boolean flying2 = this.getFlying();
      boolean grass2 = this.getGrass();
      int newAtk = this.getAtk();
      if(grass2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fire2){
         newAtk = this.getAtk() * 2;
      }
      if(ice2){
         newAtk = this.getAtk() * 2;
      }
      
      if(bug2){
         newAtk = this.getAtk() * 2;
      }
      
      if(flying2){
         newAtk = this.getAtk() * 2;
      }

      
      return newAtk;
   }      
   
   public String getRockSlide(){
      return "Rock Slide";
   }
   
   public int Dig(){
      boolean fire2 = this.getFire();
      boolean electric2 = this.getElectric();
      boolean poison2 = this.getPoison();
      boolean rock2 = this.getRock();
      boolean steel2 = this.getSteel();
      boolean flying2 = this.getFlying();
      boolean grass2 = this.getGrass();
      int newAtk = this.getAtk();
      if(grass2){
         newAtk = this.getAtk() / 2;
      }
      if(fire2){
         newAtk = this.getAtk() * 2;
      }
      
      if(electric2){
         newAtk = this.getAtk() * 2;
      }
          
      if(poison2){
         newAtk = this.getAtk() * 2;
      }
      
      if(rock2){
         newAtk = this.getAtk() * 2;
      }
      
      if(steel2){
         newAtk = this.getAtk() * 2;
      }    
            return newAtk;
   }      
   
   public String getDig(){
      return "Dig";
   }
   
   public int suckerPunch(){
      boolean psychic2 = this.getPsychic();
      boolean dark2 = this.getDark();
      int newAtk = this.getAtk();
      if(psychic2){
         newAtk = this.getAtk() / 2;
      }
            
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getSuckerPunch(){
      return "Sucker Punch";
   }
   
   // Lucario Moves
   public int auraSphere(){
      boolean flying2 = this.getFlying();
      boolean ice2 = this.getIce();
      boolean rock2 = this.getRock();
      boolean steel2 = this.getSteel();
      boolean dark2 = this.getDark();
      boolean normal2 = this.getNormal();
      int newAtk = this.getAtk();
      if(flying2){
         newAtk = this.getAtk() / 2;
      }
            
      if(normal2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ice2){
         newAtk = this.getAtk() * 2;
      }
   
      if(rock2){
         newAtk = this.getAtk() * 2;
      }
      
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      if(steel2){
         newAtk = this.getAtk() * 2;
      }      
      return newAtk;
   }      
   
   public String getAuraSphere(){
      return "Aura Sphere";
   }
   
   public int dragonPulse(){
      boolean dragon2 = this.getDragon();
      boolean ice2 = this.getIce();
      int newAtk = this.getAtk();
      if(ice2){
         newAtk = this.getAtk() / 2;
      }
            
      if(dragon2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getDragonPulse(){
      return "Dragon Pulse";
   }               
   
   public int closeCombat(){
      boolean flying2 = this.getFlying();
      boolean ice2 = this.getIce();
      boolean rock2 = this.getRock();
      boolean steel2 = this.getSteel();
      boolean dark2 = this.getDark();
      boolean normal2 = this.getNormal();
      int newAtk = this.getAtk();
      if(flying2){
         newAtk = this.getAtk() / 2;
      }
            
      if(normal2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ice2){
         newAtk = this.getAtk() * 2;
      }
   
      if(rock2){
         newAtk = this.getAtk() * 2;
      }
      
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      if(steel2){
         newAtk = this.getAtk() * 2;
      }      
      return newAtk;
   }      
   
   public String getCloseCombat(){
      return "Close Combat";
   }
   
   public int lowSweep(){
      boolean flying2 = this.getFlying();
      boolean ice2 = this.getIce();
      boolean rock2 = this.getRock();
      boolean steel2 = this.getSteel();
      boolean dark2 = this.getDark();
      boolean normal2 = this.getNormal();
      int newAtk = this.getAtk();
      if(flying2){
         newAtk = this.getAtk() / 2;
      }
            
      if(normal2){
         newAtk = this.getAtk() * 2;
      }
      
      if(ice2){
         newAtk = this.getAtk() * 2;
      }
   
      if(rock2){
         newAtk = this.getAtk() * 2;
      }
      
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      if(steel2){
         newAtk = this.getAtk() * 2;
      }      
      return newAtk ;
   }      
   
   public String getLowSweep(){
      return "Low Sweep";
   }

   
   // Gyrados Moves
   public int Surf(){
      boolean fire2 = this.getFire();
      boolean grass2 = this.getGrass();
      boolean electric2 = this.getElectric();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(grass2 || electric2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fire2 || ground2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getSurf(){
      return "Surf";
   }
   
   public int dragonTail(){
      int newAtk = this.getAtk();
      return newAtk;
   }      
   
   public String getDragonTail(){
      return "Dragon Tail";
   }            
   
   public int iceBeam(){
      boolean fire2 = this.getFire();
      boolean fight2 = this.getFighting();
      boolean grass2 = this.getGrass();
      boolean ground2 = this.getGround();
      boolean flying2 = this.getFlying();
      int newAtk = this.getAtk();
      if(fire2 || fight2){
         newAtk = this.getAtk() / 2;
      }
            
      if(grass2 || ground2 || flying2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getIceBeam(){
      return "Ice Beam";
   }
   
   public int Waterfall(){
      boolean fire2 = this.getFire();
      boolean grass2 = this.getGrass();
      boolean electric2 = this.getElectric();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(grass2 || electric2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fire2 || ground2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getWaterfall(){
      return "Waterfall";
   }
   
   // Machamp Moves   
   public int karateChop(){
      boolean dark2 = this.getDark();
      boolean flying2 = this.getFlying();
      boolean psychic2 = this.getPsychic();
      int newAtk = this.getAtk();
      if(flying2 || psychic2){
         newAtk = this.getAtk() / 2;
      }
            
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getKarateChop(){
      return "Karate Chop";
   }         
   
   public int superPower(){
      boolean dark2 = this.getDark();
      boolean flying2 = this.getFlying();
      boolean psychic2 = this.getPsychic();
      int newAtk = this.getAtk();
      if(flying2 || psychic2){
         newAtk = this.getAtk() / 2;
      }
            
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getSuperPower(){
      return "Superpower";
   }
   
   public int lowKick(){
      boolean dark2 = this.getFire();
      boolean flying2 = this.getFlying();
      boolean psychic2 = this.getPsychic();
      int newAtk = this.getAtk();
      if(flying2 || psychic2){
         newAtk = this.getAtk() / 2;
      }
            
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getLowKick(){
      return "Low Kick";
   }
   
   public int firePunch(){
      boolean grass2 = this.getGrass();
      boolean ground2 = this.getGround();
      boolean water2 = this.getWater();
      int newAtk = this.getAtk();
      if(water2 || ground2){
         newAtk = this.getAtk() / 2;
      }
            
      if(grass2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getFirePunch(){
      return "Fire Punch";
   }
   // Staraptor Moves
   public int aerialAce(){
      boolean fight2 = this.getFighting();
      boolean grass2 = this.getGrass();
      boolean electric2 = this.getElectric();
      int newAtk = this.getAtk();
      if(electric2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fight2 || grass2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getAerialAce(){
      return "Aerial Ace";
   }
   
   public int braveBird(){
      boolean fight2 = this.getFighting();
      boolean grass2 = this.getGrass();
      boolean electric2 = this.getElectric();
      int newAtk = this.getAtk();
      if(electric2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fight2 || grass2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getBraveBird(){
      return "Brave Bird";
   }               
   
   public int wingAttack(){
      boolean fight2 = this.getFighting();
      boolean grass2 = this.getGrass();
      boolean electric2 = this.getElectric();
      int newAtk = this.getAtk();
      if(electric2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fight2 || grass2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getWingAttack(){
      return "Wing Attack";
   }
   
   public int steelWing(){
      boolean fire2 = this.getFire();
      boolean fight2 = this.getFighting();
      boolean ground2 = this.getGround();
      int newAtk = this.getAtk();
      if(fire2 || fight2 || ground2){
         newAtk = this.getAtk() / 2;
      }
      return newAtk;
   }      
   
   public String getSteelWing(){
      return "Steel Wing";
   }
   
   // Scraggy Moves
   public int crunch(){
      boolean fight2 = this.getFighting();
      boolean psychic2 = this.getPsychic();
      int newAtk = this.getAtk();
      if(fight2){
         newAtk = this.getAtk() / 2;
      }
            
      if(psychic2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getCrunch(){
      return "Crunch";
   }
   
   public int highJumpKick(){
      boolean dark2 = this.getFire();
      boolean flying2 = this.getFlying();
      boolean psychic2 = this.getPsychic();
      int newAtk = this.getAtk();
      if(flying2 || psychic2){
         newAtk = this.getAtk() / 2;
      }
            
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getHighJumpKick(){
      return "High Jump Kick";
   }            
   
   public int Facade(){
      boolean fight2 = this.getFighting();
      int newAtk = this.getAtk();
      if(fight2){
         newAtk = this.getAtk() / 2;
      }
      
      return newAtk;
   }      
   
   public String getFacade(){
      return "Facade";
   }
   
   public int sludgeBomb(){
      boolean ground2 = this.getGround();
      boolean psychic2 = this.getPsychic();
      boolean grass2 = this.getGrass();
      int newAtk = this.getAtk();
      if(ground2 || psychic2){
         newAtk = this.getAtk() / 2;
      }
            
      if(grass2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      

   public String getSludgeBomb(){
      return "Sludge Bomb";
   }
   
   // Darmanitan Moves
   public int hammerArm(){
      boolean dark2 = this.getFire();
      boolean flying2 = this.getFlying();
      boolean psychic2 = this.getPsychic();
      int newAtk = this.getAtk();
      if(flying2 || psychic2){
         newAtk = this.getAtk() / 2;
      }
            
      if(dark2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getHammerArm(){
      return "Hammer Arm";
   }         
   
   public int Overheat(){
      boolean grass2 = this.getGrass();
      boolean ground2 = this.getGround();
      boolean water2 = this.getWater();
      int newAtk = this.getAtk();
      if(water2 || ground2){
         newAtk = this.getAtk() / 2;
      }
            
      if(grass2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getOverheat(){
      return "Overheat";
   }   
   
   public int flareBlitz(){
      boolean grass2 = this.getGrass();
      boolean ground2 = this.getGround();
      boolean water2 = this.getWater();
      int newAtk = this.getAtk();
      if(water2 || ground2){
         newAtk = this.getAtk() / 2;
      }
            
      if(grass2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getFlareBlitz(){
      return "Flare Blitz";
   }
   
   public int flameWheel(){
      boolean grass2 = this.getGrass();
      boolean ground2 = this.getGround();
      boolean water2 = this.getWater();
      int newAtk = this.getAtk();
      if(water2 || ground2){
         newAtk = this.getAtk() / 2;
      }
            
      if(grass2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getFlameWheel(){
      return "Flame Wheel";
   }
   
   // Kadabra Moves
   public int Psychic(){
      boolean dark2 = this.getDark();
      boolean fight2 = this.getFighting();
      int newAtk = this.getAtk();
      if(dark2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fight2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getpsychic(){
      return "Psychic";
   }
   
   public int Psybeam(){
      boolean dark2 = this.getDark();
      boolean fight2 = this.getFighting();
      int newAtk = this.getAtk();
      if(dark2){
         newAtk = this.getAtk() / 2;
      }
            
      if(fight2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getPsybeam(){
      return "Psybeam";
   }            
   
   public int nightShade(){
      boolean dark2 = this.getDark();
      boolean psychic2 = this.getPsychic();
      int newAtk = this.getAtk();
      if(dark2){
         newAtk = this.getAtk() / 2;
      }
            
      if(psychic2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getNightShade(){
      return "Night Shade";
   }
   
   public int shadowBall(){
      boolean dark2 = this.getDark();
      boolean psychic2 = this.getPsychic();
      int newAtk = this.getAtk();
      if(dark2){
         newAtk = this.getAtk() / 2;
      }
            
      if(psychic2){
         newAtk = this.getAtk() * 2;
      }
      
      return newAtk;
   }      
   
   public String getShadowBall(){
      return "Shadow Ball";
   }        
   
   public String toString(){
      return "Hp: " + this.getHp() + "\nAtk: " + this.getAtk() + "\nDef: " + this.getDef() + "\nSpd: " + this.getSpd() + "\nAcc: " + this.getAcc();
   }
     
}