package practice.tutorials.thirtydaysofcode.day112darrays;

import java.util.Scanner;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 11: 2D Arrays
 *       Link: https://www.hackerrank.com/challenges/30-2d-arrays/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        // Work out the hourglass
        int largesthourglass = -9 * 7; // Min result is -9 times the 7 positions of the hourglass
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglass = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                    arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                if (hourglass > largesthourglass) {
                    largesthourglass = hourglass;
                }
            }
        }
        
        System.out.println(largesthourglass);
        
        scanner.close();
    }
}
