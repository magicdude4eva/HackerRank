package practice.java.datastructures.javabitset;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java BitSet
 *       Link: https://www.hackerrank.com/challenges/java-bitset/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        
        while (M-- > 0) {
            String operation = input.next();
            int iSet = input.nextInt();
            int iSetOrIndex = input.nextInt();
            
            if (operation.equals("AND")) {
                if (iSet == 1) B1.and(B2); else B2.and(B1);
            } else if (operation.equals("OR")) {
                if (iSet == 1) B1.or(B2); else B2.or(B1);
            } else if (operation.equals("XOR")) {
                if (iSet == 1) B1.xor(B2); else B2.xor(B1);
            } else if (operation.equals("FLIP")) {
                if (iSet == 1) B1.flip(iSetOrIndex); else B2.flip(iSetOrIndex);
            } else if (operation.equals("SET")) {
                if (iSet == 1) B1.set(iSetOrIndex); else B2.set(iSetOrIndex);
            }
            
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        
        input.close();
    }
}
