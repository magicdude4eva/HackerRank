package practice.tutorials.thirtydaysofcode.day12inheritance;

import java.util.Scanner;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva?hr_r=1
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 12: Inheritance
 *       Link: https://www.hackerrank.com/challenges/30-inheritance/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire:
 * https://www.naschenweng.info/cv
 */
class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;
  
  // Constructor
  Person(String firstName, String lastName, int identification){
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }
  
  // Print person data
  public void printPerson(){
     System.out.println(
        "Name: " + lastName + ", " + firstName 
      +   "\nID: " + idNumber); 
  }
   
}

class Student extends Person{
  private int[] testScores;

    /*  
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
        super (firstName, lastName, id);
        this.testScores = scores;
    }

    /*  
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int totalScore = 0;
        for (int score : testScores) {
            totalScore += score;
        }
        
        totalScore = totalScore / testScores.length;
        
        return (totalScore > 89 ? 'O' : 
                totalScore > 79 ? 'E' : 
                totalScore > 69 ? 'A' :
                totalScore > 54 ? 'P' :
                totalScore > 39 ? 'D': 'T');        
    }
}

public class Solution {  
  
  public Solution () {
    // TODO Auto-generated constructor stub
    
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String firstName = scan.next();
    String lastName = scan.next();
    int id = scan.nextInt();
    int numScores = scan.nextInt();
    int[] testScores = new int[numScores];
    for(int i = 0; i < numScores; i++){
      testScores[i] = scan.nextInt();
    }
    scan.close();
    
    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate() );
  }    
  
}
