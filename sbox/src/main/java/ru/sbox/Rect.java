package ru.sbox;

/**
 * Created by Dmi on 12.05.2017.
 */
public class Rect {
  public double a;
  public double b;

  public Rect(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }
}
