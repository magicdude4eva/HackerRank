package practice.tutorials.thirtydaysofcode.day18queuesandstacks;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 18: Queues and Stacks
 *       Link: https://www.hackerrank.com/challenges/30-queues-stacks/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
  // Write your code here.
  
  // We use a stack and a linked list to push/enqueue and pop/dequeue characters to check if a word is a palindrome
  // If it was me, I would have just done a much simplier Palindrome test:
  // String backsie = new StringBuilder(S).reverse().toString();
  // System.out.println( "The word, " + input + ", is " + ( (!S.equals(backsie) ? "not a palindrome." : "a palindrome." ) );
  
  
  private Stack<Character> stack = new Stack<>();
  private Queue<Character> queue = new LinkedList<>();
  
  // Push character onto the stack
  private void pushCharacter(Character ch) {
    stack.push(ch);
  }
  
  // Push the character onto the queue
  private void enqueueCharacter(char ch) {
    queue.add(ch);
  }
  
  // Pop character from the stack
  private char popCharacter() {
    return stack.pop();
  }
  
  // remove the character from the queue
  private char dequeueCharacter() {
    return queue.remove();
  }
  
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    // Create a Solution object:
    Solution p = new Solution();

    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
        p.pushCharacter(c);
        p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length/2; i++) {
        if (p.popCharacter() != p.dequeueCharacter()) {
            isPalindrome = false;                
            break;
        }
    }

    //Finally, print whether string s is palindrome or not.
    System.out.println( "The word, " + input + ", is " 
                       + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
}
}  