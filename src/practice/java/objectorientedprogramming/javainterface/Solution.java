package practice.java.objectorientedprogramming.javainterface;

import java.util.Scanner;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Object Oriented Programming > Java Interface
 *       Link: https://www.hackerrank.com/challenges/java-interface/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

interface AdvancedArithmetic{
  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
  public int divisor_sum(int n) {
      
      // each divisor can be divided by itself and/or "1" - start ofnf filthy
      int iDivisorSum = n > 1 ? (n + 1) : 1;
      
      // n's largest factor before itself possible is n / 2 - cut down on the loop
      for (int i = 2; i <= (n / 2); i++) {
          if (n % i == 0) {
              iDivisorSum += i;
          }
      }
      
      return iDivisorSum;
  }
}

class Solution{
  public static void main(String []args){
      MyCalculator my_calculator = new MyCalculator();
      System.out.print("I implemented: ");
      ImplementedInterfaceNames(my_calculator);
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.print(my_calculator.divisor_sum(n) + "\n");
      sc.close();
  }
  /*
   *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
   */
  static void ImplementedInterfaceNames(Object o){
      Class[] theInterfaces = o.getClass().getInterfaces();
      for (int i = 0; i < theInterfaces.length; i++){
          String interfaceName = theInterfaces[i].getName();
          System.out.println(interfaceName);
      }
  }
}

