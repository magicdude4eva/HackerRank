package practice.tutorials.thirtydaysofcode.day08dictionariesandmaps;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > 30 Days of Code > Day 8: Dictionaries and Maps
 *       Link: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

//Complete this code or write your own from scratch

class Solution{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Map<String, Integer> phonebook = new HashMap<>();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          phonebook.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
          // Write code here
          Integer number = phonebook.get(s);
          if (number == null) {
              System.out.println("Not found");
          } else {
              System.out.println(s + "=" + number);
          }
      }
      in.close();
  }
}
