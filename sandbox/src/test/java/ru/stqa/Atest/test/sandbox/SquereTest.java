package ru.stqa.Atest.test.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquereTest {

  @Test
    public void testarea() {
        Squere s = new Squere(5);
        Assert.assertEquals(s.area(), 25.0);
    }
  }



