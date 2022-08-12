package practice.java.introduction.javadatatypes;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Introduction > Java Datatypes
 *       Link: https://www.hackerrank.com/challenges/java-datatypes/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Solution{
    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for (int i=0; i<t; i++) {
            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code ^^^ fucking sloppy code you write, but let's do this
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
            } catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        
        sc.close();
    }
}
