package ru.stqa.Atest.test.sandbox;

public class SquereTest {
    public void testarea() {
      Squere s = new Squere(5);
      assert s.area() == 25;
    }
  }
}
