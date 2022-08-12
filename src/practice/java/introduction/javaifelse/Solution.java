package practice.java.introduction.javaifelse;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Introduction > Java If-Else
 *       Link: https://www.hackerrank.com/challenges/java-if-else/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (N % 2 == 0) {
          if ((N >= 2 && N <= 5) || N > 20)  {
              System.out.println("Not Weird");
          } if (N >= 6 && N <= 20) {
              System.out.println("Weird");
          }
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
