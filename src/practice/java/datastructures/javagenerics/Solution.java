package practice.java.datastructures.javagenerics;

import java.lang.reflect.Method;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Generics
 *       Link: https://www.hackerrank.com/challenges/java-generics/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Printer {
  //Write your code here
   public <T> void printArray(T[] aArray) {
       for (T arrayItem : aArray) {
           System.out.println(arrayItem);
       }
   }

}

public class Solution {


  public static void main( String args[] ) {
      Printer myPrinter = new Printer();
      Integer[] intArray = { 1, 2, 3 };
      String[] stringArray = {"Hello", "World"};
      myPrinter.printArray(intArray);
      myPrinter.printArray(stringArray);
      int count = 0;

      for (Method method : Printer.class.getDeclaredMethods()) {
          String name = method.getName();

          if(name.equals("printArray"))
              count++;
      }

      if(count > 1)System.out.println("Method overloading is not allowed!");
    
  }
}
