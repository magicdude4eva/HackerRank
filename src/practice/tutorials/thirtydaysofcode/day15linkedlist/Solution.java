package practice.tutorials.thirtydaysofcode.day15linkedlist;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 15: Linked List
 *       Link: https://www.hackerrank.com/challenges/30-linked-list/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Node {
  int data;
  Node next;
  Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

  public static Node insert(Node head,int data) {
    //Complete this method
    // We run a simple recursion to insert the nodes at the right places
    if (head == null) {
      return new Node(data);
    } else if (head.next == null) {
      head.next = new Node(data);
    } else {
      insert (head.next, data);
    }
    
    return head;
  }
  
  public static void display(Node head) {
    Node start = head;
    while(start != null) {
        System.out.print(start.data + " ");
        start = start.next;
    }
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int N = sc.nextInt();

    while(N-- > 0) {
        int ele = sc.nextInt();
        head = insert(head,ele);
    }
    display(head);
    sc.close();
}
}