package practice.java.datastructures.javacomparator;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Comparator
 *       Link: https://www.hackerrank.com/challenges/java-comparator/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */


class Checker implements Comparator<Player> {
  @Override
  public int compare (Player aPlayer1, Player aPlayer2) {
      if (aPlayer1.score == aPlayer2.score) {
          return aPlayer1.name.compareTo(aPlayer2.name);
      } else {
          return aPlayer2.score - aPlayer1.score;
      }
  }
}

class Player{
  String name;
  int score;
  
  Player(String name, int score){
      this.name = name;
      this.score = score;
  }
}

class Solution {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();

      Player[] player = new Player[n];
      Checker checker = new Checker();
      
      for(int i = 0; i < n; i++){
          player[i] = new Player(scan.next(), scan.nextInt());
      }
      scan.close();
   
      Arrays.sort(player, checker);
      for(int i = 0; i < player.length; i++){
          System.out.printf("%s %s\n", player[i].name, player[i].score);
      }
  }
}
