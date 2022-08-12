package practice.tutorials.thirtydaysofcode.day28regexpatterns;

import java.util.*;
import java.util.regex.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 28: RegEx, Patterns, and Intro to Databases
 *       Link: https://www.hackerrank.com/challenges/30-regex-patterns/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
  
    private static Pattern gmailPattern = Pattern.compile(".+@gmail\\.com$");

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        List<String> emailUsers = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            // Do a match on the regex and if found, add to list
            if (gmailPattern.matcher(emailID).find()) {
              emailUsers.add(firstName);
            }
        }
        
        scanner.close();

        //  Sort and print using Lambda/streams
        emailUsers.stream().sorted()
          .forEach(user -> System.out.println(user));
    }
}
