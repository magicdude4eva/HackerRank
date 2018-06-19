package practice.java.datastructures.javaarraylist;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Arraylist
 *       Link: https://www.hackerrank.com/challenges/java-arraylist/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        // Store the 2-d array
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int d = input.nextInt();
            
            ArrayList<Integer> list = new ArrayList<>();
            for (int col = 0; col < d; col++) {
                list.add(input.nextInt());
            }
            lists.add(list);            
        }
        
        // Work out the queries
        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            ArrayList<Integer> list = lists.get(x-1);
            
            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        input.close();
        
    }
}