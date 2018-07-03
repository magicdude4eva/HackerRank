package practice.tutorials.thirtydaysofcode.day27testing;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 27: Testing
 *       Link: https://www.hackerrank.com/challenges/30-testing/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

  public static int minimum_index (int[] seq) {

    if (seq.length == 0) {
      throw new IllegalArgumentException(
          "Cannot get the minimum value index from an empty sequence");
    }
    int min_idx = 0;
    for (int i = 1; i < seq.length; ++i) {
      if (seq[i] < seq[min_idx]) {
        min_idx = i;
      }
    }
    return min_idx;
  }

  // ===== CODE HERE
  static class TestDataEmptyArray {

    public static int[] get_array () {

      // complete this function
      int testdata[] = {};
      return testdata;
    }
  }

  static class TestDataUniqueValues {

    public static int[] get_array () {

      // complete this function
      int testdata[] = { 2, 3, 4, 5, 2 };
      return testdata;
    }

    public static int get_expected_result () {

      // complete this function
      return 1;
    }
  }

  static class TestDataExactlyTwoDifferentMinimums {

    public static int[] get_array () {

      // complete this function
      int testdata[] = { 1, 2, 3, 4, 5, 2 };
      return testdata;
    }

    public static int get_expected_result () {

      // complete this function
      return 0;
    }
  }
  // ===== CODE HERE

  public static void TestWithEmptyArray () {

    try {
      int[] seq = TestDataEmptyArray.get_array();
      int result = minimum_index(seq);
    } catch (IllegalArgumentException e) {
      return;
    }
    throw new AssertionError("Exception wasn't thrown as expected");
  }

  public static void TestWithUniqueValues () {

    int[] seq = TestDataUniqueValues.get_array();
    if (seq.length < 2) {
      throw new AssertionError("less than 2 elements in the array");
    }

    Integer[] tmp = new Integer[seq.length];
    for (int i = 0; i < seq.length; ++i) {
      tmp[i] = Integer.valueOf(seq[i]);
    }
    if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp)))
        .size() == seq.length)) {
      throw new AssertionError("not all values are unique");
    }

    int expected_result = TestDataUniqueValues.get_expected_result();
    int result = minimum_index(seq);
    if (result != expected_result) {
      throw new AssertionError("result is different than the expected result");
    }
  }

  public static void TestWithExactlyTwoDifferentMinimums () {

    int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
    if (seq.length < 2) {
      throw new AssertionError("less than 2 elements in the array");
    }

    int[] tmp = seq.clone();
    Arrays.sort(tmp);
    if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
      throw new AssertionError(
          "there are not exactly two minimums in the array");
    }

    int expected_result = TestDataExactlyTwoDifferentMinimums
        .get_expected_result();
    int result = minimum_index(seq);
    if (result != expected_result) {
      throw new AssertionError("result is different than the expected result");
    }
  }

  public static void main (String[] args) {

    TestWithEmptyArray();
    TestWithUniqueValues();
    TestWithExactlyTwoDifferentMinimums();
    System.out.println("OK");
  }
}
