package practice.java.advanced.javavarargssimpleaddition;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Java Varargs - Simple Addition
 *       Link: https://www.hackerrank.com/challenges/simple-addition-varargs/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

//Write your code here
class Add {

  void add (int... numbers) {

    int totalSum = 0;
    StringBuffer sb = new StringBuffer();

    for (int number : numbers) {
      sb.append(number + "+");
      totalSum += number;
    }

    // replace the last "+" with a "="
    sb.setCharAt(sb.length() - 1, '=');
    
    // add the total and print the whole string
    System.out.println(sb.append(totalSum));
    
  }
}


public class Solution {

  public static void main(String[] args) {
     try{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n1=Integer.parseInt(br.readLine());
    int n2=Integer.parseInt(br.readLine());
    int n3=Integer.parseInt(br.readLine());
    int n4=Integer.parseInt(br.readLine());
    int n5=Integer.parseInt(br.readLine());
    int n6=Integer.parseInt(br.readLine());
    Add ob=new Add();
    ob.add(n1,n2);
    ob.add(n1,n2,n3);
    ob.add(n1,n2,n3,n4,n5); 
    ob.add(n1,n2,n3,n4,n5,n6);
    Method[] methods=Add.class.getDeclaredMethods();
    Set<String> set=new HashSet<>();
    boolean overload=false;
    for(int i=0;i<methods.length;i++)
    {
      if(set.contains(methods[i].getName()))
      {
        overload=true;
        break;
      }
      set.add(methods[i].getName());
      
    }
    if(overload)
    {
      throw new Exception("Overloading not allowed");
    }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
