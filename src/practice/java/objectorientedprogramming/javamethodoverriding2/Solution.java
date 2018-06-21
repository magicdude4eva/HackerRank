package practice.java.objectorientedprogramming.javamethodoverriding2;


/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Object Oriented Programming > Java Method Overriding 2 (Super Keyword)
 *       Link: https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class BiCycle{
  String define_me(){
    return "a vehicle with pedals.";
  }
}

class MotorCycle extends BiCycle{
  String define_me(){
    return "a cycle with an engine.";
  }
  
  MotorCycle(){
    System.out.println("Hello I am a motorcycle, I am "+ define_me());
    String temp=super.define_me(); //Fix this line
    System.out.println("My ancestor is a cycle who is "+ temp );
  }
  
}
class Solution{
  @SuppressWarnings ("unused")
  public static void main(String []args){
    MotorCycle M = new MotorCycle();
  }
}
    