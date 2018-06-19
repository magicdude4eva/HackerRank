package practice.java.datastructures.javapriorityqueue;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Priority Queue
 *       Link: https://www.hackerrank.com/challenges/java-priority-queue/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */


/*
 * Create the Student and Priorities classes here.
 */
class Priorities {
    public Priorities() {        
    }
    
    public List<Student> getStudents(List<String> events) {
        
      PriorityQueue<Student> queue = new PriorityQueue<>(
          Comparator.comparing(Student::getCGPA).reversed()
              .thenComparing(Student::getName)
              .thenComparing(Student::getID));
      
      Scanner input = new Scanner(System.in);
      
      for (String event : events) {
          String[] eventData = event.split(" ");
          
          if (eventData[0].equals("ENTER")) {
              Student student = new Student(Integer.parseInt(eventData[3]),
                    eventData[1], Double.parseDouble(eventData[2]));
              queue.add(student);
          } else if (eventData[0].equals("SERVED")) {
              queue.poll();
          }
      }
      
      input.close();
      
      List<Student> students = new ArrayList<>();
      while (!queue.isEmpty()) {
          students.add(queue.poll());
      }
      
      return students;
    }
}

class Student {
    private int studentId = 0;
    private String studentName;
    private double studentCGPA = 0.0;
    
    public Student(int id, String name, double cgpa) {
        studentId = id;
        studentName = name;
        studentCGPA = cgpa; 
    }
    
    public int getID() { return studentId; }
    public String getName() { return studentName; }
    public double getCGPA() { return studentCGPA; }
}

public class Solution {
  private final static Scanner scan = new Scanner(System.in);
  private final static Priorities priorities = new Priorities();
  
  public static void main(String[] args) {
      int totalEvents = Integer.parseInt(scan.nextLine());    
      List<String> events = new ArrayList<>();
      
      while (totalEvents-- != 0) {
          String event = scan.nextLine();
          events.add(event);
      }
      
      List<Student> students = priorities.getStudents(events);
      
      if (students.isEmpty()) {
          System.out.println("EMPTY");
      } else {
          for (Student st: students) {
              System.out.println(st.getName());
          }
      }
  }
}
