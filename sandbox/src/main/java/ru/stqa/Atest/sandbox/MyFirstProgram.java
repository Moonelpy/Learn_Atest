 package ru.stqa.Atest.sandbox;

public class MyFirstProgram {
  public static void main(String[] agrs) {

    hello("world!");
    hello("Ivan");
    hello("MOON");
    double l = 5;
    double a = 4;
    double b = 6;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
    System.out.println("Площадь треугольника со сторонаями "+ a  + " И " + b + " = " + area(a, b));
  }

  public static void hello (String somebody) {
    System.out.println("Hello " + somebody + "!");
  }
  public static double area(double len){
    return len * len;
  }
  public  static double area(double b, double a)
  {
    return  a *  b;
  }
}