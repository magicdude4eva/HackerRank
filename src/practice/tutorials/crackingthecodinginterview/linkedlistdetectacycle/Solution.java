package practice.tutorials.crackingthecodinginterview.linkedlistdetectacycle;


/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > Cracking the Coding Interview > Linked Lists: Detect a Cycle
 *       Link: https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

  // Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
  // A Node is defined as:
  class Node {

    int  data;
    Node next;
  }

  // Detect if we have a cycle
  boolean hasCycle (Node head) {

    // If head is null, break out
    if (head == null) {
      return false;
    }
    
    // We iterate through two different nodes with different distance.
    // With this we detect a cycle:
    Node currentNode     = head; // move one node at a time
    Node currentNodePlus = head; // moves two nodes at a time
    
    while (currentNodePlus != null && currentNodePlus.next != null) {
      currentNode     = currentNode.next;          // move to the next node
      currentNodePlus = currentNodePlus.next.next; // move two nodes ahead
      
      // if the current node matches the two nodes ahead we have a cycle:
      if (currentNode == currentNodePlus) {
        return true; 
      }
    }

    return false;
  }

  public static void main (String[] args) {
  }
}
