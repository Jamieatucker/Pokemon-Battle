import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.*;
import java.util.*;

public class musicPlayer{
            
   public static void main(String args[]){
      try{
         FileInputStream fileInputStream = new FileInputStream("pokebattlemusic.mp3");
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
