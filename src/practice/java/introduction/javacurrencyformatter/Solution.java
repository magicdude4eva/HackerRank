package practice.java.introduction.javacurrencyformatter;

import java.util.*;
import java.text.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Introduction > Java Currency Formatter
 *       Link: https://www.hackerrank.com/challenges/java-currency-formatter/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us      = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        
        // of course india with the most computer programmers would not have a locale
        String india   = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String china   = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france  = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
