package practice.tutorials.thirtydaysofcode.day23bstlevelordertraversal;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 23: BST Level-Order Traversal
 *       Link: https://www.hackerrank.com/challenges/30-binary-trees/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Node{
  Node left,right;
  int data;
  Node(int data){
      this.data=data;
      left=right=null;
  }
}
class Solution{
  static void levelOrder(Node root){
    //Write your code here
    
    // goodie-good-shoes: we drop out if null
    if (root == null) {
      return;
    }
    
    // since we traverse the binary search tree from top-to-bottom and left-to-right
    // we will use a Queue and then just remove items as we traverse
    Queue<Node> bltNodeList = new LinkedList<>();
    bltNodeList.add(root);
    
    while (!bltNodeList.isEmpty()) {
      Node currentNode = bltNodeList.remove();
      
      System.out.printf("%d ", currentNode.data);
      
      // We check if we have left or right nodes and add to the queue
      if (currentNode.left  != null) bltNodeList.add(currentNode.left);
      if (currentNode.right != null) bltNodeList.add(currentNode.right);
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
        levelOrder(root);
    } 
}
