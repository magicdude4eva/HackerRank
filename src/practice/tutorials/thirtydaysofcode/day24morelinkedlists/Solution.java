package practice.tutorials.thirtydaysofcode.day24morelinkedlists;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 24: More Linked Lists
 *       Link: https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Node {

  int  data;
  Node next;

  Node (int d) {
    data = d;
    next = null;
  }

}

class Solution {

  public static Node removeDuplicates (Node head) {
    // Write your code here
    
    // Assign head to currentNode as we will traverse it
    Node currentNode = head;
    
    // This problem is really  easy as the linked-list arrives already in a sorted fashion
    // So the only thing we need  to do is to check if current node is the same as next node
    // and then just replace current node with next.
    while (currentNode != null && currentNode.next  != null) {
      if (currentNode.data == currentNode.next.data) {
        currentNode.next = currentNode.next.next;
      } else {
        currentNode = currentNode.next;
      }
    }
    
    return head;
  }

  public static Node insert (Node head, int data) {

    Node p = new Node(data);
    if (head == null)
      head = p;
    else if (head.next == null)
      head.next = p;
    else {
      Node start = head;
      while (start.next != null)
        start = start.next;
      start.next = p;

    }
    return head;
  }

  public static void display (Node head) {

    Node start = head;
    while (start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }

  public static void main (String args[]) {

    Scanner sc = new Scanner(System.in);
    Node head = null;
    int T = sc.nextInt();
    while (T-- > 0) {
      int ele = sc.nextInt();
      head = insert(head, ele);
    }
    sc.close(); // savage HackerOne testers do not close the scanner....
    head = removeDuplicates(head);
    display(head);

  }
}
