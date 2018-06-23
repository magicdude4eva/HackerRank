package practice.java.advanced.javavisitorpattern;

import java.util.ArrayList;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Java Visitor Pattern
 *       Link: https://www.hackerrank.com/challenges/java-vistor-pattern/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
  
  private int result = 0;
  
  public int getResult() {
    //implement this
    return result;
  }

  public void visitNode(TreeNode node) {
    // we do jack in here..... (like the South Africa government)
  }

  public void visitLeaf(TreeLeaf leaf) {
    //implement this
    result += leaf.getValue();
  }
}

class ProductOfRedNodesVisitor extends TreeVis {
  
  private long result = 1;
  private final int MODULO = (int) Math.pow(10, 9) + 7;
  
  public int getResult() {
    //implement this
    return (int) result;
  }

  public void visitNode(TreeNode node) {
    //implement this
    if (node.getColor() == Color.RED) {
      result = (result * node.getValue()) % MODULO;
    }
  }

  public void visitLeaf(TreeLeaf leaf) {
      //implement this
    if (leaf.getColor() == Color.RED) {
      result = (result * leaf.getValue()) % MODULO;
    }
  }
}

class FancyVisitor extends TreeVis {
  
  private int iNonLeafEvenDepthSum = 0;
  private int iGreanLeavesSum = 0;
  
  public int getResult() {
    //implement this
    return Math.abs(iNonLeafEvenDepthSum - iGreanLeavesSum);
  }

  public void visitNode(TreeNode node) {
    //implement this
    if (node.getDepth() % 2 == 0) {
      iNonLeafEvenDepthSum += node.getValue();
    }
  }

  public void visitLeaf(TreeLeaf leaf) {
    //implement this
    if (leaf.getColor() == Color.GREEN) {
      iGreanLeavesSum += leaf.getValue();
    }
  }
}

public class Solution {
  
  private static int [] values;
  private static Color [] colors;
  private static HashMap<Integer, HashSet<Integer>> map;
  
  public static Tree solve() {
    //read the tree from STDIN and return its root as a return value of this function
    Scanner scan = new Scanner(System.in);
    int numNodes = scan.nextInt();
    
    // Save nodes and colors
    values = new int[numNodes];
    colors = new Color[numNodes];
    map = new HashMap<>(numNodes);
    
    // Read the values
    for (int i = 0; i < numNodes; i++) {
        values[i] = scan.nextInt();
    }
    
    // Read the colors
    for (int i = 0; i < numNodes; i++) {
        colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;
    }
    
    /* Save edges */
    for (int i = 0; i < numNodes - 1; i++) {
        int u = scan.nextInt();
        int v = scan.nextInt();
        
        /* Edges are undirected: Add 1st direction */
        HashSet<Integer> uNeighbors = map.get(u);
        if (uNeighbors == null) {                
            uNeighbors = new HashSet<>();
            map.put(u, uNeighbors);
        }
        uNeighbors.add(v);
        
        /* Edges are undirected: Add 2nd direction */
        HashSet<Integer> vNeighbors = map.get(v);
        if (vNeighbors == null) {
            vNeighbors = new HashSet<>();
            map.put(v, vNeighbors);
        }
        vNeighbors.add(u);
    }
    scan.close();
    
    /* Handle 1-node tree */
    if (numNodes == 1) {
        return new TreeLeaf(values[0], colors[0], 0);
    }

    /* Create Tree */
    TreeNode root = new TreeNode(values[0], colors[0], 0);
    createEdges(root, 1);
    return root;    
  }
  
  /* Create edges/child nodes where necessary */
  private static void createEdges (TreeNode parentNode, Integer nodeLevel) {
      // Loop through children 
      for (Integer treeNum : map.get(nodeLevel)) {
          map.get(treeNum).remove(nodeLevel); // removes the opposite arrow direction
          
          // Add child 
          HashSet<Integer> grandChildren = map.get(treeNum);
          boolean childHasChild = (grandChildren != null && !grandChildren.isEmpty());
          Tree tree;
          if (childHasChild) {
              tree = new TreeNode(values[treeNum - 1], colors[treeNum - 1], parentNode.getDepth() + 1);
          } else {
              tree = new TreeLeaf(values[treeNum - 1], colors[treeNum - 1], parentNode.getDepth() + 1);
          }
          parentNode.addChild(tree);

          // Recurse if necessary
          if (tree instanceof TreeNode) {
            createEdges ((TreeNode) tree, treeNum);
          }
      }
  }
  

  public static void main(String[] args) {
      Tree root = solve();
  SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      FancyVisitor vis3 = new FancyVisitor();

      root.accept(vis1);
      root.accept(vis2);
      root.accept(vis3);

      int res1 = vis1.getResult();
      int res2 = vis2.getResult();
      int res3 = vis3.getResult();

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
}
}  