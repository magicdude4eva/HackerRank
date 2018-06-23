package practice.java.advanced.javareflectionattributes;

import java.lang.reflect.*;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Java Reflection - Attributes
 *       Link: https://www.hackerrank.com/challenges/java-reflection-attributes/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

@SuppressWarnings ("unused")
class Student{
  private String name;
  private String id;
  private String email;

  public String getName() {
      return name;
  }
  public void setId(String id) {
      this.id = id;
  }
  public void setEmail(String email) {
      this.email = email;
  }
  public void anothermethod(){  }
}

public class Solution {

  public static void main(String[] args){
      Class<Student> student = Student.class;
      Method[] methods = student.getDeclaredMethods();

      ArrayList<String> methodList = new ArrayList<>();
      for(Method method : methods){
          methodList.add(method.getName());
      }
      Collections.sort(methodList);
      for(String name: methodList){
          System.out.println(name);
      }
  }

}

