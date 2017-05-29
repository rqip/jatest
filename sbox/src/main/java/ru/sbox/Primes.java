package ru.sbox;

import static java.lang.Math.sqrt;

public class Primes {

  public static boolean isPrime(int n) {
    int imax = (int) sqrt(n);

    for (int i= 2; i <= imax; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPrimeWhile(int n) {
    int imax = (int) sqrt(n);
    int i = 2;
    while (i <= imax && (n % i != 0)) {
      i++;
    }
    return (i == imax);
  }

  public static boolean isPrime(long n) {
    int imax = (int) sqrt(n);

    for (long i= 2; i <= imax; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

}
