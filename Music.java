import java.io.File;
import javax.sound.sampled.*;

public class Music {
  public static void main(String[] args){

    try{
      File file = new File("--file location--");
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);

      clip.start();

      Thread.sleep(/*time in seconds*/*1000);

    }catch(Exception e){
      System.out.println(e);
      System.out.println("File Not Supported");

      }

  }

}