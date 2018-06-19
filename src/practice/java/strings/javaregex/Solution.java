package practice.java.strings.javaregex;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Strings > Java Regex
 *       Link: https://www.hackerrank.com/challenges/java-regex/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Solution {

  public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      while(in.hasNext()){
          String IP = in.next();
          System.out.println(IP.matches(new MyRegex().pattern));
      }
      in.close();

  }
}

class MyRegex {

  public static String pattern = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
   
}
