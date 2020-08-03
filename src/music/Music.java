package music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.net.URL;

public class Music {


  // variable
  private boolean isForestMusic = false;
//  Constructor

  public Music(boolean isForestMusic) {
    this.isForestMusic = isForestMusic;
  }

  public Music() {

  }


  public static void forestMusic(File file) throws Exception {
//    gardenMusic =true;
    //when user/Gamer enter in Forestmusic will play
//    Clip clip = AudioSystem.getClip();
//    AudioInputStream ais = AudioSystem.getAudioInputStream(file);
//    clip.open(AudioSystem.getAudioInputStream(file));
//    clip.loop(Clip.LOOP_CONTINUOUSLY-1);
    Clip clip = AudioSystem.getClip();
    clip.open(AudioSystem.getAudioInputStream(file));
    clip.start();

    Thread.sleep(clip.getMicrosecondLength()/1000);



//    clip.open(ais);



  }
  public static void gameStartMusic() throws Exception {
    //when user/Gamer enter in garden relex music will play
    URL url = new URL("https://www.videomaker.com/sites/videomaker.com/files/downloads/free-sound-effects/Free_Timpani_6027_73_1.wav");
    Clip clip = AudioSystem.getClip();

    AudioInputStream ais = AudioSystem.getAudioInputStream(url);
    clip.open(ais);
    clip.loop(Clip.LOOP_CONTINUOUSLY);


  }
  //getter and setter

  public boolean isForestMusic() {
    return isForestMusic;
  }

  public void setForestMusic(boolean forestMusic) {
    isForestMusic = forestMusic;
  }


}
