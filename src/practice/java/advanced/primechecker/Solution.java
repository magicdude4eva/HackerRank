package practice.java.advanced.primechecker;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Prime Checker
 *       Link: https://www.hackerrank.com/challenges/prime-checker/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Prime {
  void checkPrime(int... numbers) {
      for (int num : numbers) {
          if (isPrime(num)) {
              System.out.print(num + " ");
          }
      }
      System.out.println();
  }
  
  /*
   * checks whether an int is prime or not.
   * 
   */
  boolean isPrime(int n) {
      if (n < 2) {
          return false;
      } else if (n == 2) {
          return true;
      } else if (n % 2 == 0) {
          return false;
      }
      
      for(int divisor = 2; divisor <= n / 2; divisor++) {
          if (n % divisor == 0) {
              return false;
          }
      }      
    return true;
  }

}

public class Solution {

  public static void main(String[] args) {
    try{
    BufferedReader br=new BufferedReader(new InputStreamReader(in));
    int n1=Integer.parseInt(br.readLine());
    int n2=Integer.parseInt(br.readLine());
    int n3=Integer.parseInt(br.readLine());
    int n4=Integer.parseInt(br.readLine());
    int n5=Integer.parseInt(br.readLine());
    Prime ob=new Prime();
    ob.checkPrime(n1);
    ob.checkPrime(n1,n2);
    ob.checkPrime(n1,n2,n3);
    ob.checkPrime(n1,n2,n3,n4,n5);  
    Method[] methods=Prime.class.getDeclaredMethods();
    Set<String> set=new HashSet<>();
    boolean overload=false;
    for(int i=0;i<methods.length;i++)
    {
      if(set.contains(methods[i].getName()))
      {
        overload=true;
        break;
      }
      set.add(methods[i].getName());
      
    }
    if(overload)
    {
      throw new Exception("Overloading not allowed");
    }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
  
}
