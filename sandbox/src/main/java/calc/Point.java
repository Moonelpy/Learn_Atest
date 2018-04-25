package calc;

public class Point {

  public double x;
  public  double y;


  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void distance(Point p1, Point p2) {
    double x = p2.x - p1.x;
    double y = p2.y - p1.y;

  }

}