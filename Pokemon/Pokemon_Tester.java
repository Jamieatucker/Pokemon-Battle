import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import sun.audio.*;

public class Pokemon_Tester{

   public static void main(String args[]){
      
      // variables
      String p1 = "";
      String p2 = "";
      boolean player1Turn = true;
      boolean player2Turn = false;
      boolean notDead = true;
      boolean notDead2 = true;
      
      int playerAtk = 1;
      int player2Atk = 1;
      int psw = 0;
      int psw2 = 0;
      int a = 0;
      int mon = 0;
      int p1ch = 0;
      int p2ch = 0;

      
      boolean[] Poke_Control = new boolean[12];
      boolean[] P2_Poke_Control = new boolean[12];
      
      int[] Poke_hp1 = new int [6];
      int[] Poke_hp2 = new int [6];
      int[] P1_Position = new int[6];
      int[] P2_Position = new int[6];
      
      String[] Player_Pokemon = new String [6];
      String[] Player2_Pokemon = new String [6];
      
      Arrays.fill(Poke_Control, Boolean.FALSE);
      
      // Poke_Control array Pokemon to array location Key
      
      // Value 0 is Charizard  Value 3 is Luxray   Value 6 is Gyrados   Value 9 is Scraggy    
      // Value 1 is Torterra   Value 4 is Diglett  Value 7 is Machamp   Value 10 is Darmanitan
      // Value 2 is Piplup     Value 5 is Lucario  Value 8 is Staraptor Value 11 is Kadabra

      
      // Pokemon object Creation
      Moves Charizard = new Moves(true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);//Fire
      Moves Torterra = new Moves(false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false);//Grass
      Moves Piplup = new Moves(false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);//Water
      
      Moves Luxray = new Moves(false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false);//Electric
      Moves Diglett = new Moves(false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false);//Ground
      Moves Lucario = new Moves(false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false);//Fighting
      
      Moves Gyrados = new Moves(false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);//Water
      Moves Machamp = new Moves(false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false);//Fighting
      Moves Staraptor = new Moves(false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false);//Flying
      
      Moves Scraggy = new Moves(false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false);//Dark
      Moves Darmanitan = new Moves(true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);//Fire
      Moves Kadabra = new Moves(false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false);//Psychic

      Scanner poke = new Scanner(System.in);
   
    // Player 1   
   for(int i = 0; i < 6; i++)
     {      
      System.out.println("Please choose your Pokemon, you still have to choose " +(6-i) +" Pokemon \n1. Charizard 2. Torterra 3. Piplup 4. Luxray 5. Diglett 6. Lucario \n7. Gyrados 8. Machamp 9. Staraptor 10. Scraggy 11. Darmanitan 12. Kadabra");
      
      int choice = poke.nextInt();
      
      switch(choice){
      
         case 1:
         if(!Poke_Control[0])
            {
               System.out.println("You Chose Charizard \n" + "------------------- \n" + Charizard.toString());
               Player_Pokemon[i] = "Charizard";
               Poke_hp1[i] = Charizard.getHp();
               Poke_Control[0] = true;
               P1_Position[i] = 0;
              if(i == 0)
                  {
                     psw = 0;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
               break; //Case 1 end
            
         case 2:
         if(!Poke_Control[1])
            {
               System.out.println("You Chose Torterra \n" + "------------------- \n" + Torterra.toString());
               Player_Pokemon[i] = "Torterra";
               Poke_hp1[i] = Torterra.getHp();
               Poke_Control[1] = true;
               P1_Position[i] = 1;
              if(i == 0)
                  {
                     psw = 1;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 2 end

         case 3:
         if(!Poke_Control[2])
            {
               System.out.println("You Chose Piplup \n" + "------------------- \n" + Piplup.toString());
               Player_Pokemon[i] = "Piplup";
               Poke_hp1[i] = Piplup.getHp();
               Poke_Control[2] = true;
               P1_Position[i] = 2;
               int newAtk = Piplup.getAtk();
              if(i == 0)
                  {
                     psw = 2;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 3 end
               
      
         case 4:
         if(!Poke_Control[3])
            {
               System.out.println("You Chose Luxray \n" + "------------------- \n" + Luxray.toString());
               Player_Pokemon[i] = "Luxray";
               Poke_hp1[i] = Luxray.getHp();
               Poke_Control[3] = true;
               P1_Position[i] = 3;
              if(i == 0)
                  {
                     psw = 3;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
               break; //Case 4 end
            
         case 5:
         if(!Poke_Control[4])
            {
               System.out.println("You Chose Diglett \n" + "------------------- \n" + Diglett.toString());
               Player_Pokemon[i] = "Diglett";
               Poke_hp1[i] = Diglett.getHp();
               Poke_Control[4] = true;
               P1_Position[i] = 4;
              if(i == 0)
                  {
                     psw = 4;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 5 end

         case 6:
         if(!Poke_Control[5])
            {
               System.out.println("You Chose Lucario \n" + "------------------- \n" + Lucario.toString());
               Player_Pokemon[i] = "Lucario";
               Poke_hp1[i] = Lucario.getHp();
               Poke_Control[5] = true;
               P1_Position[i] = 5;
              if(i == 0)
                  {
                     psw = 5;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 6 end
 
          case 7:
         if(!Poke_Control[6])
            {
               System.out.println("You Chose Gyrados \n" + "------------------- \n" + Gyrados.toString());
               Player_Pokemon[i] = "Gyrados";
               Poke_hp1[i] = Gyrados.getHp();
               Poke_Control[6] = true;
               P1_Position[i] = 6;
              if(i == 0)
                  {
                     psw = 6;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
               break; //Case 7 end
            
         case 8:
         if(!Poke_Control[7])
            {
               System.out.println("You Chose Machamp \n" + "------------------- \n" + Machamp.toString());
               Player_Pokemon[i] = "Machamp";
               Poke_hp1[i] = Machamp.getHp();
               Poke_Control[7] = true;
               P1_Position[i] = 7;
              if(i == 0)
                  {
                     psw = 7;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 8 end

         case 9:
         if(!Poke_Control[8])
            {
               System.out.println("You Chose Staraptor \n" + "------------------- \n" + Staraptor.toString());
               Player_Pokemon[i] = "Staraptor";
               Poke_hp1[i] = Staraptor.getHp();
               Poke_Control[8] = true;
               P1_Position[i] = 8;
              if(i == 0)
                  {
                     psw = 8;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 9 end
               
      
         case 10:
         if(!Poke_Control[9])
            {
               System.out.println("You Chose Scraggy \n" + "------------------- \n" + Scraggy.toString());
               Player_Pokemon[i] = "Scraggy";
               Poke_hp1[i] = Scraggy.getHp();
               Poke_Control[9] = true;
               P1_Position[i] = 9;
              if(i == 0)
                  {
                     psw = 9;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
               break; //Case 10 end
            
         case 11:
         if(!Poke_Control[10])
            {
               System.out.println("You Chose Darmanitan \n" + "------------------- \n" + Darmanitan.toString());
               Player_Pokemon[i] = "Darmanitan";
               Poke_hp1[i] = Darmanitan.getHp();
               Poke_Control[10] = true;
               P1_Position[i] = 10;
              if(i == 0)
                  {
                     psw = 10;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 11 end

         case 12:
         if(!Poke_Control[11])
            {
               System.out.println("You Chose Kadabra \n" + "------------------- \n" + Kadabra.toString());
               Player_Pokemon[i] = "Kadabra";
               Poke_hp1[i] = Kadabra.getHp();
               Poke_Control[11] = true;
               P1_Position[i] = 11;
              if(i == 0)
                  {
                     psw = 11;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 12 end
      }
   }  
   
   System.out.println("Here is Player 1's Team:");
   
   for(int i = 0; i < 6; i++)
      {
         System.out.print(Player_Pokemon[i] + " ");
      }
   try{
       Thread.sleep(2000);
   }
   catch(InterruptedException ex){
   }

   // Player 2
   for(int i = 0; i < 6; i++)
   {      
      System.out.println("\nPlease choose your Pokemon, you still have to choose " + (6-i) +" Pokemon \n1. Charizard 2. Torterra 3. Piplup 4. Luxray 5. Diglett 6. Lucario \n7. Gyrados 8. Machamp 9. Staraptor 10. Scraggy 11. Darmanitan 12. Kadabra");
      
      int choice2 = poke.nextInt();
      
      switch(choice2){
      
         case 1:
         if(!P2_Poke_Control[0])
            {
               System.out.println("You Chose Charizard \n" + "------------------- \n" + Charizard.toString());
               Player2_Pokemon[i] = "Charizard";
               P2_Poke_Control[0] = true;
               Poke_hp2[i] = Charizard.getHp();
               P2_Position[i] = 0;
              if(i == 0)
                  {
                     psw2 = 0;
                  }
 
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
               break; //Case 1 end
            
         case 2:
         if(!P2_Poke_Control[1])
            {
               System.out.println("You Chose Torterra \n" + "------------------- \n" + Torterra.toString());
               Player2_Pokemon[i] = "Torterra";
               P2_Poke_Control[1] = true;
               Poke_hp2[i] = Torterra.getHp();
               P2_Position[i] = 1;
              if(i == 0)
                  {
                     psw2 = 1;
                     mon = 1;
                  }
                  System.out.println(psw2);
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 2 end

         case 3:
         if(!P2_Poke_Control[2])
            {
               System.out.println("You Chose Piplup \n" + "------------------- \n" + Piplup.toString());
               Player2_Pokemon[i] = "Piplup";
               P2_Poke_Control[2] = true;
               Poke_hp2[i] = Piplup.getHp();
               P2_Position[i] = 2;
               int newAtk2 = Piplup.getAtk();
              if(i == 0)
                  {
                     psw2 = 2;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 3 end
               
      
         case 4:
         if(!P2_Poke_Control[3])
            {
               System.out.println("You Chose Luxray \n" + "------------------- \n" + Luxray.toString());
               Player2_Pokemon[i] = "Luxray";
               P2_Poke_Control[3] = true;
               Poke_hp2[i] = Luxray.getHp();
               P2_Position[i] = 3;
              if(i == 0)
                  {
                     psw2 = 3;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
               break; //Case 4 end
            
         case 5:
         if(!P2_Poke_Control[4])
            {
               System.out.println("You Chose Diglett \n" + "------------------- \n" + Diglett.toString());
               Player2_Pokemon[i] = "Diglett";
               P2_Poke_Control[4] = true;
               Poke_hp2[i] = Diglett.getHp();
               P2_Position[i] = 4;
              if(i == 0)
                  {
                     psw2 = 4;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 5 end

         case 6:
         if(!P2_Poke_Control[5])
            {
               System.out.println("You Chose Lucario \n" + "------------------- \n" + Lucario.toString());
               Player2_Pokemon[i] = "Lucario";
               P2_Poke_Control[5] = true;
               Poke_hp2[i] = Lucario.getHp();
               P2_Position[i] = 5;
              if(i == 0)
                  {
                     psw2 = 5;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 6 end
 
          case 7:
         if(!P2_Poke_Control[6])
            {
               System.out.println("You Chose Gyrados \n" + "------------------- \n" + Gyrados.toString());
               Player2_Pokemon[i] = "Gyrados";
               P2_Poke_Control[6] = true;
               Poke_hp2[i] = Gyrados.getHp();
               P2_Position[i] = 6;
              if(i == 0)
                  {
                     psw2 = 6;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
               break; //Case 7 end
            
         case 8:
         if(!P2_Poke_Control[7])
            {
               System.out.println("You Chose Machamp \n" + "------------------- \n" + Machamp.toString());
               Player2_Pokemon[i] = "Machamp";
               P2_Poke_Control[7] = true;
               Poke_hp2[i] = Machamp.getHp();
               P2_Position[i] = 7;
              if(i == 0)
                  {
                     psw2 = 7;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 8 end

         case 9:
         if(!P2_Poke_Control[8])
            {
               System.out.println("You Chose Staraptor \n" + "------------------- \n" + Staraptor.toString());
               Player2_Pokemon[i] = "Staraptor";
               P2_Poke_Control[8] = true;
               Poke_hp2[i] = Staraptor.getHp();
               P2_Position[i] = 8;
              if(i == 0)
                  {
                     psw2 = 8;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 9 end
               
      
         case 10:
         if(!P2_Poke_Control[9])
            {
               System.out.println("You Chose Scraggy \n" + "------------------- \n" + Scraggy.toString());
               Player2_Pokemon[i] = "Scraggy";
               P2_Poke_Control[9] = true;
               Poke_hp2[i] = Scraggy.getHp();
               P2_Position[i] = 9;
              if(i == 0)
                  {
                     psw2 = 9;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
               break; //Case 10 end
            
         case 11:
         if(!P2_Poke_Control[10])
            {
               System.out.println("You Chose Darmanitan \n" + "------------------- \n" + Darmanitan.toString());
               Player2_Pokemon[i] = "Darmanitan";
               P2_Poke_Control[10] = true;
               Poke_hp2[i] = Darmanitan.getHp();
               P2_Position[i] = 10;
              if(i == 0)
                  {
                     psw2 = 10;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 11 end

         case 12:
         if(!P2_Poke_Control[11])
            {
               System.out.println("You Chose Kadabra \n" + "------------------- \n" + Kadabra.toString());
               Player2_Pokemon[i] = "Kadabra";
               P2_Poke_Control[11] = true;
               Poke_hp2[i] = Kadabra.getHp();
               P2_Position[i] = 11;
              if(i == 0)
                  {
                     psw2 = 11;
                  }
            }
         else{
               System.out.println("You've Already Chosen This Pokemon, Please select another...");
               i--;
            }
                break; // Case 12 end
      }
   }  
   
   System.out.println("Here is Player 2's Team:");
   
   for(int i = 0; i < 6; i++)
      {
         System.out.print(Player2_Pokemon[i] + " ");
      }
      
      try{
         Thread.sleep(2000);
      }
      catch(InterruptedException ex){
      }
      
         
      System.out.println(" \nIt's time to battle!");
            
      // Waits 2000 milliseconds
      try{
         Thread.sleep(2000);
      }
      catch(InterruptedException ex){
      }
      
      System.out.println("P1: " + Player_Pokemon[0] + ", I choose you!");
      
      // Waits 2000 milliseconds
      try{
         Thread.sleep(2000);
      }
      catch(InterruptedException ex){
      }
      
      System.out.println("P2: " + Player2_Pokemon[0] + ", I choose you!");
      
      // Waits 2000 milliseconds
      try{
         Thread.sleep(2000);
      }
      catch(InterruptedException ex){
      }
      
       while(notDead == true && notDead2 == true)
    {//while loop     
       // Player 1's turn
      while(player1Turn && Poke_hp1[p1ch] > 0){  
          
         if(Poke_Control[0] && psw == 0){
            System.out.println("What will you do? 1. " + Charizard.getFlameThrower() + " 2. " + Charizard.getFlameCharge() + " 3. " + Charizard.getTackle() + " 4. " + Charizard.getBrickBreak() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Charizard.flameThrower();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Charizard.flameCharge();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");              
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Charizard.tackle();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                  
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Charizard.brickBreak();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Charizard.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");               
                  break;
            }
           }
        if(Poke_Control[1] && psw == 1){
            System.out.println("What will you do? 1. " + Torterra.getRazorLeaf() + " 2. " + Torterra.getWoodHammer() + " 3. " + Torterra.getSwordsDance() + " 4. " + Torterra.getEnergyBall() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Torterra.razorLeaf();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Torterra.woodHammer();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                  
                  break;
               
               case 3:
                  playerAtk = Torterra.getAtk() + Torterra.swordsDance();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " now has " + playerAtk + " attack.");                 
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Torterra.energyBall();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
            
               case 5:
                 Poke_hp1[p1ch] = Poke_hp1[p1ch] + Torterra.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                  
                  break;
            }
           }
          if(Poke_Control[2] && psw == 2){
            System.out.println("What will you do? 1. " + Piplup.getBubbleBeam() + " 2. " + Piplup.getHydroPump() + " 3. " + Piplup.getWaterPulse() + " 4. " + Piplup.getWorkUp() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Piplup.bubbleBeam();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Piplup.hydroPump();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Piplup.waterPulse();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
            
               case 4:
                  playerAtk = Piplup.getAtk() + Piplup.workUp();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " now has " + playerAtk + " attack.");                  
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Piplup.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                      
                  break;
            }
           }
           if(Poke_Control[3] && psw == 3){
            System.out.println("What will you do? 1. " + Luxray.getThunderFang() + " 2. " + Luxray.getThunderBolt() + " 3. " + Luxray.getVoltTackle() + " 4. " + Luxray.getFaintAttack() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Luxray.thunderFang();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Luxray.thunderBolt();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Luxray.voltTackle();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Luxray.faintAttack();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] +  + Luxray.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                     
                  break;
            }
           }
           if(Poke_Control[4] && psw == 4){
            System.out.println("What will you do? 1. " + Diglett.getEarthquake() + " 2. " + Diglett.getRockSlide() + " 3. " + Diglett.getDig() + " 4. " + Diglett.getSuckerPunch() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Diglett.Earthquake();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Diglett.rockSlide();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Diglett.Dig();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                  
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Diglett.suckerPunch();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");               
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Diglett.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                   
                  break;
            }
           }
           if(Poke_Control[5] && psw == 5){
            System.out.println("What will you do? 1. " + Lucario.getAuraSphere() + " 2. " + Lucario.getDragonPulse() + " 3. " + Lucario.getCloseCombat() + " 4. " + Lucario.getLowSweep() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Lucario.auraSphere();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Lucario.dragonPulse();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Lucario.closeCombat();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                  
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Lucario.lowSweep();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Lucario.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                     
                  break;
            }
           }
           if(Poke_Control[6] && psw == 6){
            System.out.println("What will you do? 1. " + Gyrados.getSurf() + " 2. " + Gyrados.getDragonTail() + " 3. " + Gyrados.getIceBeam() + " 4. " + Gyrados.getWaterfall() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Gyrados.Surf();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Gyrados.dragonTail();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Gyrados.iceBeam();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Gyrados.Waterfall();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Gyrados.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                     
                  break;
            }
           }
           if(Poke_Control[7] && psw == 7){
            System.out.println("What will you do? 1. " + Machamp.getKarateChop() + " 2. " + Machamp.getSuperPower() + " 3. " + Machamp.getLowKick() + " 4. " + Machamp.getFirePunch() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Machamp.karateChop();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Machamp.superPower();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");               
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Machamp.lowKick();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Machamp.firePunch();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Machamp.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                    
                  break;
            }
           }
           if(Poke_Control[8] && psw == 8){
            System.out.println("What will you do? 1. " + Staraptor.getAerialAce() + " 2. " + Staraptor.getBraveBird() + " 3. " + Staraptor.getWingAttack() + " 4. " + Staraptor.getSteelWing() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Staraptor.aerialAce();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");               
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Staraptor.braveBird();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                  
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Staraptor.wingAttack();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Staraptor.steelWing();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                  
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Staraptor.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                      
                  break;
            }
           }
           if(Poke_Control[9] && psw == 9){
            System.out.println("What will you do? 1. " + Scraggy.getCrunch() + " 2. " + Scraggy.getHighJumpKick() + " 3. " + Scraggy.getFacade() + " 4. " + Scraggy.getSludgeBomb() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Scraggy.crunch();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");             
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Scraggy.highJumpKick();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Scraggy.Facade();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                 
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Scraggy.sludgeBomb();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Scraggy.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                     
                  break;
            }
           }
           if(Poke_Control[10]  && psw == 10){
            System.out.println("What will you do? 1. " + Darmanitan.getHammerArm() + " 2. " + Darmanitan.getOverheat() + " 3. " + Darmanitan.getFlareBlitz() + " 4. " + Darmanitan.getFlameWheel() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Darmanitan.hammerArm();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");               
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Darmanitan.Overheat();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Darmanitan.flareBlitz();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                  
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Darmanitan.flameWheel();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Darmanitan.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");                     
                  break;
            }
           }
           if(Poke_Control[11] && psw == 11){
            System.out.println("What will you do? 1. " + Kadabra.getpsychic() + " 2. " + Kadabra.getPsybeam() + " 3. " + Kadabra.getNightShade() + " 4. " + Kadabra.getShadowBall() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Kadabra.Psychic();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");               
                  break;
               case 2:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Kadabra.Psybeam();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");               
                  break;
               
               case 3:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Kadabra.nightShade();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");
                  break;
            
               case 4:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] - Kadabra.shadowBall();
                  System.out.println("The " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp remaining.");
                  break;
            
               case 5:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] + Kadabra.heal();
                  System.out.println("Your " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp now.");     
                  break;
            }
           } 
             
//Need to set pokemon control boolean to false after Hp reaches 0 for this methood to work
            for(int i = 0; i < 11; i++){
                  if(Poke_Control[i]){
                         i = 11;
                         a = 0;  
                      } 
                  if(!Poke_Control[i]){
                        a++;  
                     }     
               }
               
               if (a >= 11){
                     notDead = false;
                     player1Turn = false;
                     player2Turn = false;
                  }
                  
               else{
                     player1Turn = false;
                     player2Turn = true;                        
                   }                                                                                       
   }// End of Player 1 turn
   
while(player2Turn && Poke_hp2[p2ch] > 0){  
System.out.println("Player 2 it's your turn");
          
         if(P2_Poke_Control[0] && psw2 == 0){
            System.out.println("What will you do? 1. " + Charizard.getFlameThrower() + " 2. " + Charizard.getFlameCharge() + " 3. " + Charizard.getTackle() + " 4. " + Charizard.getBrickBreak() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                  Poke_hp1[p1ch] = Poke_hp1[p1ch] - Charizard.flameThrower();
                  System.out.println("The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Charizard.flameCharge();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");              
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Charizard.tackle();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                  
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Charizard.brickBreak();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp1[p2ch] + Charizard.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");               
                  break;
            }
           }
        if(P2_Poke_Control[1] && psw2 == 1){
            System.out.println("What will you do? 1. " + Torterra.getRazorLeaf() + " 2. " + Torterra.getWoodHammer() + " 3. " + Torterra.getSwordsDance() + " 4. " + Torterra.getEnergyBall() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Torterra.razorLeaf();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Torterra.woodHammer();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                  
                  break;
               
               case 3:
                   player2Atk = Torterra.getAtk() + Torterra.swordsDance();
                  System.out.println( "Your " + Player2_Pokemon[p2ch] + " now has " + player2Atk + " attack.");                 
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Torterra.energyBall();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Torterra.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");              
                  break;
            }
           }
          if(P2_Poke_Control[2] && psw2 == 2){
            System.out.println("What will you do? 1. " + Piplup.getBubbleBeam() + " 2. " + Piplup.getHydroPump() + " 3. " + Piplup.getWaterPulse() + " 4. " + Piplup.getWorkUp() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Piplup.bubbleBeam();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Piplup.hydroPump();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Piplup.waterPulse();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
            
               case 4:
                  int newAtk = Piplup.getAtk();
                  player2Atk = Piplup.getAtk() + Piplup.workUp();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " now has " + player2Atk + " attack.");                  
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Piplup.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");                 
                  break;
            }
           }
           if(P2_Poke_Control[3] && psw2 == 3){
            System.out.println("What will you do? 1. " + Luxray.getThunderFang() + " 2. " + Luxray.getThunderBolt() + " 3. " + Luxray.getVoltTackle() + " 4. " + Luxray.getFaintAttack() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Luxray.thunderFang();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Luxray.thunderBolt();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Luxray.voltTackle();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Luxray.faintAttack();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Luxray.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");                  
                  break;
            }
           }
           if(P2_Poke_Control[4] && psw2 == 4){
            System.out.println("What will you do? 1. " + Diglett.getEarthquake() + " 2. " + Diglett.getRockSlide() + " 3. " + Diglett.getDig() + " 4. " + Diglett.getSuckerPunch() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Diglett.Earthquake();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Diglett.rockSlide();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Diglett.Dig();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                  
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Diglett.suckerPunch();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");               
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Diglett.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");                 
                  break;
            }
           }
           if(P2_Poke_Control[5] && psw2 == 5){
            System.out.println("What will you do? 1. " + Lucario.getAuraSphere() + " 2. " + Lucario.getDragonPulse() + " 3. " + Lucario.getCloseCombat() + " 4. " + Lucario.getLowSweep() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Lucario.auraSphere();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Lucario.dragonPulse();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Lucario.closeCombat();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                  
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Lucario.lowSweep();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Lucario.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");                
                  break;
            }
           }
           if(P2_Poke_Control[6] && psw2 == 6){
            System.out.println("What will you do? 1. " + Gyrados.getSurf() + " 2. " + Gyrados.getDragonTail() + " 3. " + Gyrados.getIceBeam() + " 4. " + Gyrados.getWaterfall() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Gyrados.Surf();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Gyrados.dragonTail();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Gyrados.iceBeam();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Gyrados.Waterfall();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Gyrados.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");               
                  break;
            }
           }
           if(P2_Poke_Control[7] && psw2 == 7){
            System.out.println("What will you do? 1. " + Machamp.getKarateChop() + " 2. " + Machamp.getSuperPower() + " 3. " + Machamp.getLowKick() + " 4. " + Machamp.getFirePunch() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Machamp.karateChop();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Machamp.superPower();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");               
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Machamp.lowKick();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Machamp.firePunch();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Machamp.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");                
                  break;
            }
           }
           if(P2_Poke_Control[8] && psw2 == 8){
            System.out.println("What will you do? 1. " + Staraptor.getAerialAce() + " 2. " + Staraptor.getBraveBird() + " 3. " + Staraptor.getWingAttack() + " 4. " + Staraptor.getSteelWing() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Staraptor.aerialAce();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");               
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Staraptor.braveBird();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                  
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Staraptor.wingAttack();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Staraptor.steelWing();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                  
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Staraptor.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");                  
                  break;
            }
           }
           if(P2_Poke_Control[9] && psw2 == 9){
            System.out.println("What will you do? 1. " + Scraggy.getCrunch() + " 2. " + Scraggy.getHighJumpKick() + " 3. " + Scraggy.getFacade() + " 4. " + Scraggy.getSludgeBomb() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Scraggy.crunch();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");             
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Scraggy.highJumpKick();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Scraggy.Facade();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                 
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Scraggy.sludgeBomb();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Scraggy.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");                 
                  break;
            }
           }
           if(P2_Poke_Control[10]  && psw2 == 10){
            System.out.println("What will you do? 1. " + Darmanitan.getHammerArm() + " 2. " + Darmanitan.getOverheat() + " 3. " + Darmanitan.getFlareBlitz() + " 4. " + Darmanitan.getFlameWheel() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Darmanitan.hammerArm();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");               
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Darmanitan.Overheat();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Darmanitan.flareBlitz();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                  
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Darmanitan.flameWheel();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");                
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Darmanitan.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now.");                
                  break;
            }
           }
           if(P2_Poke_Control[11] && psw2 == 11){
            System.out.println("What will you do? 1. " + Kadabra.getpsychic() + " 2. " + Kadabra.getPsybeam() + " 3. " + Kadabra.getNightShade() + " 4. " + Kadabra.getShadowBall() + " 5. Heal");
            int decision = poke.nextInt();
            switch(decision){
               case 1:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Kadabra.Psychic();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");               
                  break;
               case 2:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Kadabra.Psybeam();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");               
                  break;
               
               case 3:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Kadabra.nightShade();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");
                  break;
            
               case 4:
                   Poke_hp1[p1ch] = Poke_hp1[p1ch] - Kadabra.shadowBall();
                  System.out.println( "The " + Player_Pokemon[p1ch] + " has " + Poke_hp1[p1ch] + " hp remaining.");
                  break;
            
               case 5:
                  Poke_hp2[p2ch] = Poke_hp2[p2ch] + Kadabra.heal();
                  System.out.println("Your " + Player2_Pokemon[p2ch] + " has " + Poke_hp2[p2ch] + " hp now."); 
                  break;
            }
           } 
             
//Need to set pokemon control boolean to false after Hp reaches 0 for this methood to work
            for(int i = 0; i < 11; i++){
                  if(Poke_Control[i]){
                         i = 11;
                         a = 0;  
                      } 
                  if(!Poke_Control[i]){
                        a++;  
                     }     
               }
               
               if (a >= 11){
                     notDead = false;
                     player1Turn = false;
                     player2Turn = false;
                  }
                  
               else{
                     player1Turn = true;
                     player2Turn = false;                        
                   }                                                                                       
   }// End of Player 2 turn
   
   if(Poke_hp2[p2ch] <= 0){
         System.out.println(Player2_Pokemon[p2ch] + " has fainted...");
         // Waits 2000 milliseconds
         try{
            Thread.sleep(2000);
         }
         catch(InterruptedException ex){
         }
         if(Poke_hp2[0] <= 0 && Poke_hp2[1] <= 0 && Poke_hp2[2] <= 0 && Poke_hp2[3] <= 0 && Poke_hp2[4] <= 0 && Poke_hp2[5] <= 0){
            notDead2 = false;
            System.out.println("Player 2 has no usable pokemon remaining... Player 1 Wins!");
         }
         else{
            System.out.println("Which Pokemon would you like to play next? (0-5)");
            for(int i = 0; i < 6; i++){
               System.out.print(Player2_Pokemon[i] + " ");
            }
            int choice4 = poke.nextInt();
            psw2 = P2_Position[choice4];
            p2ch = choice4;
         }         
      }
      if(Poke_hp1[p1ch] <= 0){
         System.out.println(Player_Pokemon[p1ch] + " has fainted...");
         
         // Waits 2000 milliseconds
         try{
            Thread.sleep(2000);
         }
         catch(InterruptedException ex){
         }
         
         if(Poke_hp1[0] <= 0 && Poke_hp1[1] <= 0 && Poke_hp1[2] <= 0 && Poke_hp1[3] <= 0 && Poke_hp1[4] <= 0 && Poke_hp1[5] <= 0){
            notDead = false;
            System.out.println("Player 1 has no usable pokemon remaining... Player 2 Wins!");
         }         
         else{
            System.out.println("Which Pokemon would you like to play next? (0-5)");
            for(int i = 0; i < 6; i++){
               System.out.print(Player_Pokemon[i] + " ");
            }   
            int choice3 = poke.nextInt();
            psw = P1_Position[choice3];
            p1ch = choice3;       
   }
   
  }
}       
              
   
   // Music Player
   try{
         FileInputStream fileInputStream = new FileInputStream("pokewinmusic.mp3");
         Player player = new Player(fileInputStream);
         player.play();
         System.out.println("Song is playing!");
      }
      catch(FileNotFoundException e){
         e.printStackTrace();
      }
      catch(JavaLayerException e){
         e.printStackTrace();
      }
  }
  
 }
