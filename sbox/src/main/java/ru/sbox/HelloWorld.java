package ru.sbox;

public class HelloWorld {

	public static void main(String[] args) {
		hello("World");

    Square s = new Square(5);
    System.out.println("area for " + s.len + " = " + s.area());

    Rect s1 = new Rect(4, 6);
    System.out.println("area for " + s1.a + " " + s1.b + " = " + s1.area());

    Point p1 = new Point(1., 2.);
    Point p2 = new Point(5., 6.);
    System.out.println("distance = " + distance(p1, p2));
	}

  public static void hello(String str) {
    System.out.println("Hello," + str + "!");
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
  }

}
