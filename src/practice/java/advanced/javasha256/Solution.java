package practice.java.advanced.javasha256;

import java.util.*;
import java.security.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Java SHA-256
 *       Link: https://www.hackerrank.com/challenges/sha-256/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */


public class Solution {

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      // Easy-peasy - it's the same solution as the MD5 one, except we use SHA-256
      Scanner input = new Scanner(System.in);
      String s = input.next();
      input.close();
      
      // Create the MD5 and print it out
      try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] password  = md.digest(s.getBytes());
        
        for (byte bChar : password){
          System.out.printf("%02x", bChar);
        }
      } catch (NoSuchAlgorithmException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
}
