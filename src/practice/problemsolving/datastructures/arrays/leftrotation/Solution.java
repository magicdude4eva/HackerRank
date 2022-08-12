package practice.problemsolving.datastructures.arrays.leftrotation;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Data Structures > Arrays > Left Rotation
 *       Link: https://www.hackerrank.com/challenges/array-left-rotation/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

  // Rotate the array "d" positions to the left and print it out
  // We use a simple array copy and then loop over it
  static void rotateLeft (int[] aArray, int aNumberRotations) {

    int[] temp = new int[aNumberRotations];

    System.arraycopy(aArray, 0, temp, 0, aNumberRotations);
    System.arraycopy(aArray, aNumberRotations, aArray, 0, aArray.length - aNumberRotations);
    System.arraycopy(temp, 0, aArray, aArray.length - aNumberRotations, temp.length);
    
    for  (int i = 0; i < aArray.length; i++) {
      System.out.printf("%d%s", aArray[i], (i < aArray.length ? " " : ""));
    }
    
    return ;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main (String[] args) {

    String[] nd = scanner.nextLine().split(" ");

    int n = Integer.parseInt(nd[0]);

    int d = Integer.parseInt(nd[1]);

    int[] a = new int[n];

    String[] aItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int aItem = Integer.parseInt(aItems[i]);
      a[i] = aItem;
    }
    
    // lets rotate the array and print
    rotateLeft(a, d);

    scanner.close();
  }
}
