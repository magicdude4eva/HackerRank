package practice.tutorials.crackingthecodinginterview.recursionfibonaccinumbers;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > Cracking the Coding Interview > Recursion: Fibonacci Numbers
 *       Link: https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n -2);
        } else {
            return n;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
