package practice.problemsolving.datastructures.arrays.arraysds;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Data Structures > Arrays > Arrays - DS
 *       Link: https://www.hackerrank.com/challenges/arrays-ds/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

  // Complete the reverseArray function below.
  static int[] reverseArray(int[] a) {
    
    // This is  fairly simple in Java 8 using streams
    return IntStream.rangeClosed(1, a.length)
        .map(i -> a[a.length - i])
        .toArray();
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int arrCount = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int[] arr = new int[arrCount];

      String[] arrItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < arrCount; i++) {
          int arrItem = Integer.parseInt(arrItems[i]);
          arr[i] = arrItem;
      }

      int[] res = reverseArray(arr);

      for (int i = 0; i < res.length; i++) {
          bufferedWriter.write(String.valueOf(res[i]));

          if (i != res.length - 1) {
              bufferedWriter.write(" ");
          }
      }

      bufferedWriter.newLine();

      bufferedWriter.close();

      scanner.close();
  }
}
