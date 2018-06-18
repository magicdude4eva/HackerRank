package practice.java.advanced.javasingletonpattern;


/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Java Singleton Pattern
 *       Link: https://www.hackerrank.com/challenges/java-singleton/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Singleton {
    public String str = null;
    private static Singleton instance = null;
    
    private Singleton() {        
    }
    
    // we use lazy initialisation with double-checked locking like any super-hero
    // would....
    public static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }    
}