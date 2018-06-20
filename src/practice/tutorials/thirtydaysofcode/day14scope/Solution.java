package practice.tutorials.thirtydaysofcode.day14scope;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 14: Scope
 *       Link: https://www.hackerrank.com/challenges/30-scope/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Difference {
  private int[] elements;
  public int maximumDifference;
  
  // Add your code here
  public Difference(int[] aElements) {
      this.elements = Arrays.copyOf(aElements, aElements.length);
      Arrays.sort(this.elements);
  }

  // Find the absolute difference - since we already sorted the array, we literally pick up
  // the difference between first (lowest) and last (highest) element
  public void computeDifference() {
      maximumDifference = elements[elements.length-1] - elements[0];
  }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
