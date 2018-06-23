package practice.java.advanced.javaannotations;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Java Annotations
 *       Link: https://www.hackerrank.com/challenges/java-annotations/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
  String userRole() default "GUEST";
  int maximumAvailableMoneyBabies() default 0;
}

class FamilyMember {
  @FamilyBudget(userRole = "SENIOR", maximumAvailableMoneyBabies = 100)
  public void seniorMember(int budget, int moneySpend) {
    System.out.println("Senior Member");
    System.out.println("Spend: " + moneySpend);
    System.out.println("Budget Left: " + (budget - moneySpend));
  }

  @FamilyBudget(userRole = "JUNIOR", maximumAvailableMoneyBabies = 50)
  public void juniorUser(int budget, int moneySpend) {
    System.out.println("Junior Member");
    System.out.println("Spend: " + moneySpend);
    System.out.println("Budget Left: " + (budget - moneySpend));
  }
}

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    while (testCases > 0) {
      String role = in.next();
      int spend = in.nextInt();
      try {
        Class annotatedClass = FamilyMember.class;
        Method[] methods = annotatedClass.getMethods();
        for (Method method : methods) {
          if (method.isAnnotationPresent(FamilyBudget.class)) {
            FamilyBudget family = method
                .getAnnotation(FamilyBudget.class);
            String userRole = family.userRole();
            int budgetLimit = family.maximumAvailableMoneyBabies();
            if (userRole.equals(role)) {
              if(spend <= budgetLimit){
                method.invoke(FamilyMember.class.newInstance(),
                    budgetLimit, spend);
              }else{
                System.out.println("Budget Limit Over");
              }
            }
          }
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
      testCases--;
    }
    in.close();
  }
}
