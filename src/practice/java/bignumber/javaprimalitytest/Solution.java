package practice.java.bignumber.javaprimalitytest;

import java.util.*;
import java.math.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > BigNumber > Java Primality Test
 *       Link: https://www.hackerrank.com/challenges/java-primality-test/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger number = new BigInteger(n);
        scanner.close();
        System.out.println(number.isProbablePrime(10) ? "prime" : "not prime");
    }
}
