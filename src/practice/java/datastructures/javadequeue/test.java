package practice.java.datastructures.javadequeue;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Dequeue
 *       Link: https://www.hackerrank.com/challenges/java-dequeue/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */


public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        
        HashMap<Integer, Integer> mapIntegers = new HashMap<>();
        int maxUniqueIntergers = 0;

        for (int i = 0; i < n; i++) {
            // Check if we need to remove old value first to rotate in new
            if (i >= m) {
                int oldValue = deque.removeFirst();
                
                if (mapIntegers.get(oldValue) == 1) {
                    mapIntegers.remove(oldValue);
                } else {
                    mapIntegers.merge(oldValue, -1, Integer::sum);
                }
            }
            
            // Add new value
            int num = in.nextInt();
            deque.addLast(num);
            mapIntegers.merge(num, 1, Integer::sum);
            
            maxUniqueIntergers = Math.max(maxUniqueIntergers, mapIntegers.size());
            
            // break out if we found the largest possible number
            if (maxUniqueIntergers == m) {
                break;
            }
        }
        
        in.close();
        System.out.println(maxUniqueIntergers);
    }
}
