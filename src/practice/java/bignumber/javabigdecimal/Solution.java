package practice.java.bignumber.javabigdecimal;

import java.util.*;
import java.math.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > BigNumber > Java BigDecimal
 *       Link: https://www.hackerrank.com/challenges/java-bigdecimal/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Solution{
  public static void main(String []args){
      //Input
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      String []s=new String[n+2];
      for(int i=0;i<n;i++){
          s[i]=sc.next();
      }
      sc.close();
      
      //Write your code here
      // Add a comparator which will sort the array of strings based on the converted decimals
      // so that we can then print them out in descending order
      Arrays.sort (s, new Comparator<String>() {
        @Override
        public int compare (String A, String B) {
            if (A == null || B == null) {
                return 0;
            }
            
            BigDecimal bdA = new BigDecimal(A);
            BigDecimal bdB = new BigDecimal(B);
            
            return bdB.compareTo(bdA);
        }
      } );
      //Output
      for(int i=0;i<n;i++)
      {
          System.out.println(s[i]);
      }
  }
}      