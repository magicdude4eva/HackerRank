package practice.java.exceptionhandling.javaexceptionhandlingtrycatch;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Exception Handling > Java Exception Handling (Try-catch)
 *       Link: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println (input.nextInt() / input.nextInt());
        } catch (InputMismatchException imex) {
            System.out.println(imex.getClass().getName());
        } catch (ArithmeticException aex) {
            System.out.println(aex.getClass().getName() + ": / by zero");
        } finally {
            input.close(); // because I am a goody-good-shoes and clean up after myself
        }        
    }
}

