package practice.tutorials.thirtydaysofcode.day13abstractclasses;

import java.util.Scanner;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 13: Abstract Classes
 *       Link: https://www.hackerrank.com/challenges/30-abstract-classes/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

abstract class Book {
  String title;
  String author;
  
  Book(String title, String author) {
      this.title = title;
      this.author = author;
  }
  
  abstract void display();
}

//Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {

// Declare the price instance variable
  int price;  

/**   
*   Class Constructor
*   
*   @param title The book's title.
*   @param author The book's author.
*   @param price The book's price.
**/
// Write your constructor here
  MyBook(String title, String author, int price) {
    super(title,author);
    this.price = price;
  }

/**   
*   Method Name: display
*   
*   Print the title, author, and price in the specified format.
**/
// Write your method here
  void display() {
    System.out.printf("Title: %s\nAuthor: %s\nPrice: %d\n", title, author, price);
  }
}

//End class


public class Solution {
  
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String title = scanner.nextLine();
      String author = scanner.nextLine();
      int price = scanner.nextInt();
      scanner.close();

      Book book = new MyBook(title, author, price);
      book.display();
  }
}