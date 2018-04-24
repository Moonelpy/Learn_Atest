package calc;

public class Result {
  public static void main(String[] args ) {

    Tocka p1 = new Tocka();
    Tocka p2 = new Tocka();

    System.out.println("Расстояние между точками " + p1 + " И "+ p2 + " = " +
            Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2)));


  }
}