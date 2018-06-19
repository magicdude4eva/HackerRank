package practice.java.datastructures.javamap;

import java.util.*;
import java.io.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Map
 *       Link: https://www.hackerrank.com/challenges/phone-book/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

//Complete this code or write your own from scratch

class Solution {
public static void main(String []args) {
      
      try {
          // Fucking Scanner class times out on HackerRank - let's do this oldschool
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          int n = Integer.parseInt(br.readLine());
          HashMap<String,Integer> phoneBook = new HashMap<>();
          while (n-- > 0) {
              String name = br.readLine();
              int phone   = Integer.parseInt(br.readLine());
              phoneBook.put(name, phone);
          }

          String searchName = null;
          while((searchName = br.readLine()) != null) {
              if (phoneBook.containsKey(searchName)) {
                  System.out.printf("%s=%d\n", searchName, phoneBook.get(searchName));
              } else {
                  System.out.println("Not found");
              }
          }
          br.close();
      } catch (IOException ioex) { 
          System.out.println ("Shit really just happened = " + ioex);
      }
}
}



