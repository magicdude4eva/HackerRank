package practice.java.introduction.javastaticinitializerblock;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Introduction > Java Static Initializer Block
 *       Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
  private static int B = 0;
  private static int H = 0;
  private static boolean flag = true;

  static {
      Scanner input = new Scanner(System.in);
      B = input.nextInt();
      H = input.nextInt();
      input.close();
      if (B <= 0 || H <= 0) {
          System.out.println("java.lang.Exception: Breadth and height must be positive");
          flag = false;
      }
  
  }
  public static void main(String[] args){
    if(flag){
      int area=B*H;
      System.out.print(area);
    }
    
  }//end of main

}
