package practice.tutorials.thirtydaysofcode.day22binarysearchtrees;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 22: Binary Search Trees
 *       Link: https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Node {
  Node left,right;
  int data;
  Node(int data){
      this.data=data;
      left=right=null;
  }
}
class Solution {

  public static int getHeight(Node root){
    //Write your code here
    
    // Recursion will be your friend here
    if (root == null) {
      return -1;
    } else {
      return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
  }
  
  public static Node insert(Node root,int data){
    if(root==null){
        return new Node(data);
    }
    else{
        Node cur;
        if(data<=root.data){
            cur=insert(root.left,data);
            root.left=cur;
        }
        else{
            cur=insert(root.right,data);
            root.right=cur;
        }
        return root;
    }
}
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        sc.close(); // savage HackerOne testers do not close the scanner....
        int height=getHeight(root);
        System.out.println(height);
    } 
}