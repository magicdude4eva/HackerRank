package practice.java.introduction.javadateandtime;

import java.util.*;
import java.time.LocalDate;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Introduction > Java Date and Time
 *       Link: https://www.hackerrank.com/challenges/java-date-and-time/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
  
public static String getDay(String aDay, String aMonth, String aYear) {
    LocalDate date = LocalDate.of(Integer.parseInt(aYear), Integer.parseInt(aMonth), Integer.parseInt(aDay));
    
    return date.getDayOfWeek().toString();
}    
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String month = in.next();
  String day = in.next();
  String year = in.next();
  in.close();
  
  System.out.println(getDay(day, month, year));
}
}
