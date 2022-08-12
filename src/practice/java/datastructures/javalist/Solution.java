package practice.java.datastructures.javalist;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java List
 *       Link: https://www.hackerrank.com/challenges/java-list/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        // Input the integers
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(input.nextInt());
        }
        
        // Run through the query
        int Q = input.nextInt();
        for (int i = 0; i < Q; i++) {
            String queryType = input.next();
            int index = input.nextInt();
            
            if (queryType.equals("Insert")) {
                int value = input.nextInt();
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                list.remove(index);
            }
        }
        input.close();
        
        // Print out the modified list
        for (Integer value : list) {
            System.out.printf("%d ", value);
        }
    }
}
