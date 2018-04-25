 package ru.stqa.Atest.test.sandbox;

public class MyFirstProgram {
  public static void main(String[] agrs) {

    hello("world!");
    hello("Ivan");
    hello("MOON");
    Squere s = new Squere(5);

    Rectangle r = new Rectangle(3,5);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
    System.out.println("Площадь треугольника со сторонаями "+ r.a + " И " + r.b + " = " + r.area());
  }

  public static void hello (String somebody) {
    System.out.println("Hello " + somebody + "!");
  }

}