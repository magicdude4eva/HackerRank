package practice.tutorials.crackingthecodinginterview.treesisthisabst;



/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > Cracking the Coding Interview > Trees: Is This a Binary Search Tree?
 *       Link: https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

  // Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
  // A Node is defined as:
  class Node {
    int  data;
    Node left;
    Node right;
  }
  
  // We recursively run through the nodes. We start of with min/max values of
  // Integer to set ranges
  boolean checkBST(Node root) {
    return isNodeInRange (root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }  
  
  /* 
   * Check if the node fulfils the below criteria as per test:
   * - The data-value of every node in a node's left subtree is less than the
   *   data value of that node.
   * - The data-value of every node in a node's right subtree is greater than
   *   the data value of that node.
   * - The data-value of every node is distinct.
   */
  boolean isNodeInRange (Node aNode, int aMinData, int aMaxData) {
    if (aNode == null) {
      return true;
    }
    
    return  aMinData < aNode.data && aNode.data < aMaxData && 
        isNodeInRange(aNode.left, aMinData, aNode.data) && 
        isNodeInRange(aNode.right, aNode.data, aMaxData);
  }


  public static void main (String[] args) {
  }
}
