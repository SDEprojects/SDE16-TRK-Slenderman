package com.slenderman.tools;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class SoundTest {


  public void playPositive()  {
    File file= new File("oneMinute.wav");
    Sound.play(file);
  }

  @Test
  public void playNegative()  {
    File file= new File("cave.wav");
    Sound.play(file);
  }
}
