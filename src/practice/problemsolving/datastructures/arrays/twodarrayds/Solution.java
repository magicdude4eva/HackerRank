package practice.problemsolving.datastructures.arrays.twodarrayds;

import java.io.*;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Data Structures > Arrays > 2D Array - DS
 *       Link: https://www.hackerrank.com/challenges/2d-array/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
      // Hourglass problem - work out the hourglass in an int -array 
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
      
      return largesthourglass;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
