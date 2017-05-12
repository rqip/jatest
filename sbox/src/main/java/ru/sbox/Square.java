package ru.sbox;

/**
 * Created by Dmi on 12.05.2017.
 */
public class Square {
  public double len;

  public Square(double len) {
    this.len = len;
  }

  public double area() {
    return this.len * this.len;
  }
}
