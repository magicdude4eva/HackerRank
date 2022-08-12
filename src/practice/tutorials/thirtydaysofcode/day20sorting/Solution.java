package practice.tutorials.thirtydaysofcode.day20sorting;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 20: Sorting
 *       Link: https://www.hackerrank.com/challenges/30-sorting/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        // Write Your Code Here
        in.close(); // filthy newbs don't close the scanner
        
        boolean bUnsorted = true;
        int iSortedOffset = 0, numSwops = 0;
        
        // we use Bubblesort and assume that the array is generally unsorted
        // we loop through the array, and if the 1st element is greater than the 2nd, we swop them.
        // we then "bubble" all the way through to the end
        // we use iSortedOffset to reduce the scan-depth as we bubble backwards.
        while (bUnsorted) {
          bUnsorted = false;
          
          for (int i = 1; i < a.length - iSortedOffset; i++) {
            // check if we need to swop integers
            if (a[i-1] > a[i]) {
              int temp = a[i - 1];
              a[i - 1] = a[i];
              a[i]     = temp;
              
              bUnsorted = true;
              ++numSwops;
            }
          }
          ++iSortedOffset;
          
        }
        
        System.out.println("Array is sorted in " + numSwops + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}