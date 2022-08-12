package practice.java.advanced.javalambdaexpressions;

import java.io.*;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Java Lambda Expressions
 *       Link: https://www.hackerrank.com/challenges/java-lambda-expressions/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */
interface PerformOperation {
  boolean check(int a);
 }
 class MyMath {
  public boolean checker(PerformOperation p, int num) {
   return p.check(num);
  }
  
  // Write your code here
  // check if the value is odd
  public PerformOperation isOdd () {
    return n -> (n & 1) == 1;
  }
  
  // check if the value is prime
  public PerformOperation isPrime () {
    return n -> {
      if (n < 2) {
        return false;
      } else if (n == 2) {
        return true;
      } else if (n % 2 == 0) {
        return false;
      }
    
      for (int divisor = 2; divisor <= n / 2; divisor++) {
        if (n % divisor == 0) {
            return false;
        }
      }      
      return true;
    };
  }
  
  // check if palindrome
  public PerformOperation isPalindrome() {
    return n -> {
      String original = Integer.toString(n);
      String backsie  = new StringBuilder(original).reverse().toString();
      return original.equals(backsie);
    };
  }
  
 }

  
  public class Solution {

    public static void main(String[] args) throws IOException {
     MyMath ob = new MyMath();
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int T = Integer.parseInt(br.readLine());
     PerformOperation op;
     boolean ret = false;
     String ans = null;
     while (T--> 0) {
      String s = br.readLine().trim();
      StringTokenizer st = new StringTokenizer(s);
      int ch = Integer.parseInt(st.nextToken());
      int num = Integer.parseInt(st.nextToken());
      if (ch == 1) {
       op = ob.isOdd();
       ret = ob.checker(op, num);
       ans = (ret) ? "ODD" : "EVEN";
      } else if (ch == 2) {
       op = ob.isPrime();
       ret = ob.checker(op, num);
       ans = (ret) ? "PRIME" : "COMPOSITE";
      } else if (ch == 3) {
       op = ob.isPalindrome();
       ret = ob.checker(op, num);
       ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

      }
      System.out.println(ans);
     }
    }
   }
  