package com.slenderman.scenes;

import com.slenderman.music.Music;
import com.slenderman.tools.Sound;

import java.io.File;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Introduction {

  // For Resource Bundle //
  static final String FILE_BASE_NAME = "storyIntroNoColor";
  static final String PATH = "com.slenderman.scenes.files.";

  static ResourceBundle.Control rbc = ResourceBundle.Control.getControl(ResourceBundle.Control.FORMAT_DEFAULT);
  static ResourceBundle bundle = ResourceBundle.getBundle(PATH + FILE_BASE_NAME, Locale.US, rbc);
  public static String playerName;

  public static void playIntro() throws Exception {
    Scanner scanner = new Scanner(System.in);
    long introDelaySlow = 2500;
    long introDelayQuick = 1750;

    Thread.sleep(introDelaySlow);
    System.out.println(textPainter(bundle.getString("intro_0")));
    System.out.println(
      "\n" +
        "  __        __        __   __   __        __      \n" +
        " /    /    /    /| ||/  | /    /  | /|/| /  | /| |\n" +
        "(___ (    (___ ( | ||   |(___ (___|( / |(___|( | |\n" +
        "    )|   )|    | | )|   )|    |\\   |   )|   )| | )\n" +
        " __/ |__/ |__  | |/ |__/ |__  | \\  |  / |  / | |/ \n" +
        "                                                  \n");

    System.out.println("Please enter your name to start your journey...");
    setPlayerName(scanner.nextLine());
    System.out.println("Your name has been set to " + getPlayerName() + " ... good luck.");
    Music.gameSingleMusic(new File("gameIntro.wav"));

    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_1")));
    Sound.play(new File("./Speech/Introduction/I_intro1.mp3"));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_2")));
    Sound.play(new File("./Speech/Introduction/I_intro2.mp3"));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_3")));
    Sound.play(new File("./Speech/Introduction/I_intro3.mp3"));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_4")));
    Sound.play(new File("./Speech/Introduction/I_intro4.mp3"));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_5")));
    Sound.play(new File("./Speech/Introduction/I_intro5.mp3"));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_6")));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_7")));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_8")));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_9")));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_10")));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_11")));
    Sound.play(new File("./Speech/Introduction/I_note.mp3"));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_12")));
    Sound.play(new File("./Speech/Introduction/I_intro12.mp3"));
//    Thread.sleep(introDelayQuick);
    System.out.println(textPainter(bundle.getString("intro_13")));
    Sound.play(new File("./Speech/Introduction/I_intro13.mp3"));

    Thread.sleep(introDelayQuick);

  }
  /**
   * Coloring the fonts
   *
   * <p>{0} : Scene.ANSI_GREEN {1} : Scene.ANSI_BLUE {2} : Scene.ANSI_RED {3} : Scene.ANSI_BLACK {4}
   * : Scene.ANSI_WHITE
   */
  private static String textPainter(String text) {
    return MessageFormat.format(
      text,
      Scene.ANSI_GREEN,
      Scene.ANSI_BLUE,
      Scene.ANSI_RED,
      Scene.ANSI_BLACK,
      Scene.ANSI_WHITE);
  }

  public static String getPlayerName() {
    return playerName;
  }

  public static void setPlayerName(String playerName) {
    Introduction.playerName = playerName;
  }
}
