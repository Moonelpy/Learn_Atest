package calc;

public class Result {

  public static void main(String[] args) {


    Point p1 = new Point();
    Point p2 = new Point();
    p1.x = 1;
    p2.x = 5;
    p1.y = 2;
    p2.y = 3;

    System.out.println("Расстояние между точками A и B с координатами " + "A=" + p1.x +","+ p1.y + " И "+ "B=" + p1.y + "," + p2.y + " = "
            + Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));

}
}