package practice.java.advanced.javamd5;

import java.security.*;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Java MD5
 *       Link: https://www.hackerrank.com/challenges/java-md5/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner input = new Scanner(System.in);
      String s = input.next();
      input.close();
      
      // Create the MD5 and print it out
      try {
        MessageDigest md = MessageDigest.getInstance("MD5");
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