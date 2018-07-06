package practice.tutorials.crackingthecodinginterview.queuesataleoftwostacks;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > Cracking the Coding Interview > Queues: A Tale of Two Stacks
 *       Link: https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
  
  // Our own MyQueue implementation
  public static class MyQueue<T> {
    Stack<T> stackNewest = new Stack<T>();
    Stack<T> stackOldest = new Stack<T>();
    
    // Push onto newest stack
    public void enqueue (T aStackItem) {
      stackNewest.push(aStackItem);
    }
    
    // peek from the stack
    public T peek () {
      shiftStacks();      
      return stackOldest.peek();
    }
    
    // dequeue from the stack
    public T dequeue() {
      shiftStacks();
      return stackOldest.pop();
    }
    
    // Do the shuffle, populate stackOldest if empty with stackNewest to continue process
    public void shiftStacks () {
      if (stackOldest.isEmpty()) {
        while (!stackNewest.isEmpty()) {
          stackOldest.push(stackNewest.pop());
        }
      }
      
      return;
    }
    
  }
  
  public static void main(String[] args) {
      MyQueue<Integer> queue = new MyQueue<Integer>();

      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();

      for (int i = 0; i < n; i++) {
          int operation = scan.nextInt();
          if (operation == 1) { // enqueue
            queue.enqueue(scan.nextInt());
          } else if (operation == 2) { // dequeue
            queue.dequeue();
          } else if (operation == 3) { // print/peek
            System.out.println(queue.peek());
          }
      }
      scan.close();
  }
}
