package practice.tutorials.thirtydaysofcode.day26nestedlogic;

import java.time.*;
import java.time.format.*;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 26: Nested Logic
 *       Link: https://www.hackerrank.com/challenges/30-nested-logic/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner input = new Scanner(System.in);
      
      // Get the dates
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d M y");      
      LocalDate dateReturned = LocalDate.parse(input.nextLine(), dateTimeFormatter);
      LocalDate dateExpected = LocalDate.parse(input.nextLine(), dateTimeFormatter);
      input.close();
      
      // Whack'em with the maximum fine
      int fine = 10000;
      
      if (dateReturned.isEqual(dateExpected) || dateReturned.isBefore(dateExpected)) {
        fine = 0;
      } else if (dateReturned.getMonth() == dateExpected.getMonth() && dateReturned.getYear() == dateExpected.getYear()) {
        fine = 15 * (dateReturned.getDayOfMonth() - dateExpected.getDayOfMonth());
      } else if (dateReturned.getYear() == dateExpected.getYear()) {
        fine = 500 * (dateReturned.getMonthValue() - dateExpected.getMonthValue());
      }
      
      System.out.println(fine);
    }
    
}

