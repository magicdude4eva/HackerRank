package practice.java.datastructures.javasort;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Sort
 *       Link: https://www.hackerrank.com/challenges/java-sort/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Student implements Comparable<Student> {
  private int id;
  private String fname;
  private double cgpa;
  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }
  public int getId() {
    return id;
  }
  public String getFname() {
    return fname;
  }
  public double getCgpa() {
    return cgpa;
  }
    
    @Override
    public int compareTo(Student aStudent) {
        
        if (this.getCgpa() == aStudent.getCgpa()) {
            if (this.getFname().equals(aStudent.getFname())) {
                return this.getId() - aStudent.getId();
            } else {
                return this.getFname().compareTo(aStudent.getFname());
            }
        } else {
            return (aStudent.getCgpa() > this.getCgpa() ? 1 : -1);
        }        
    }
}

//Complete the code
public class Solution {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    
    List<Student> studentList = new ArrayList<Student>();
    while(testCases>0){
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();
      
      Student st = new Student(id, fname, cgpa);
      studentList.add(st);
      
      testCases--;
    }
    
    in.close();
        
    // Sort magic
    Collections.sort(studentList);
        
    for (Student st: studentList) {
      System.out.println(st.getFname());
    }
    
  }
}
