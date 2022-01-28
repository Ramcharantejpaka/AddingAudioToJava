//importing sound packages;
import java.io.File;
import javax.sound.sampled.*;

public class Music {
  public static void main(String[] args){
    // i am using " try catch method "
    //" throws " method can also be used !
    try{
      File file = new File("file location");
      //to import the audio file from the location
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      //to get audio file into 'clip'
      Clip clip = AudioSystem.getClip();
      // to open the audio file
      clip.open(audioStream);
      
      //to play the audio file
      clip.start();

      Thread.sleep(s*1000);// s = time in seconds 
      // the time in sleep should be microseconds
      //Thread can only be used in exception hanlding

    }catch(Exception e){
      System.out.println(e);
      System.out.println("File Not Supported");

      }

  }

}
