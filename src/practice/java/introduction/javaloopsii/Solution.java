package practice.java.introduction.javaloopsii;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Introduction > Java Loops 2
 *       Link: https://www.hackerrank.com/challenges/java-loops/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int s = 0; s < n; s++) {
                a += b * ((int) Math.pow(2, s));
                System.out.printf("%d ", a);
            }
            System.out.println();
        }
        in.close();
    }
}
