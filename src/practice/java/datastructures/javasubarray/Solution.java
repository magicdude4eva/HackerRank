package practice.java.datastructures.javasubarray;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Subarray
 *       Link: https://www.hackerrank.com/challenges/java-negative-subarray/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int arraysize = input.nextInt();
        int[] array   = new int[arraysize];
        
        // Fill the array with the inputs
        for (int i = 0; i < arraysize; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        
        // Work out the negative array
        int negativesubarraycount = 0;
        
        for (int i = 0; i < arraysize; i++) {
            int subarraysum = 0;
            
            for (int j = i; j < arraysize; j++) {
                subarraysum += array[j];
                
                if (subarraysum < 0) {
                    ++negativesubarraycount;
                }
            }
        }
        
        System.out.println(negativesubarraycount);
            
    }
}