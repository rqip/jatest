package ru.sbox;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP" };
/*    List<String> langs1 = new ArrayList<String>();
    langs1.add("Java");
    langs1.add("C#"); */

    List<String> langs1 = Arrays.asList("Java", "C#", "Python", "PHP");

/*  for (int i = 0; i < langs.length; i++) {
      System.out.println("Text " + langs[i]);
    } */

    for (String s : langs1) {
      System.out.println("Text " + s);
    }

/*  for (int i = 0; i < langs1.size(); i++) {
      System.out.println("Text " + langs1.get(i));
    } */
  }

}
