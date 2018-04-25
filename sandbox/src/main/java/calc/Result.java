package calc;

public class Result {

  public static void main(String[] args) {

  Point d = new Point(5.2,2.5);


  System.out.println("Расстояние между точками A и B с координатами " + d.x +  " и " + d.y + " = " +
          Math.sqrt(d.x * d.x + d.y * d.y));
  }
}