 package ru.stqa.Atest.sandbox;

public class MyFirstProgram {
  public static void main(String[] agrs) {

    hello("world!");
    hello("Ivan");
    hello("MOON");
    Squere s = new Squere(5);

    Rectangle r = new Rectangle(4,6);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));
    System.out.println("Площадь треугольника со сторонаями "+ r.a + " И " + r.b + " = " + area(r));
  }

  public static void hello (String somebody) {
    System.out.println("Hello " + somebody + "!");
  }
  public static double area(Squere s) {
    return s.l * s.l;
  }
  public  static double area(Rectangle r)
  {
    return  r.a *  r.b;
  }
}