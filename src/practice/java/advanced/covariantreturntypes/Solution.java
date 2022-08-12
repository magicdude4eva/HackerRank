package practice.java.advanced.covariantreturntypes;

import java.io.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Advanced > Covariant Return Types
 *       Link: https://www.hackerrank.com/challenges/java-covariance/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Flower {
  String whatsYourName() {
    return "I have many names and types.";
  }
}

class Jasmine extends Flower {
  @Override
  String whatsYourName() {
    return "Jasmine";
  }
}

class Lily extends Flower {
  @Override
  String whatsYourName() {
    return "Lily";
  }
}

class Region {
  Flower yourNationalFlower() {
    return new Flower();
  }
}

class WestBengal extends Region {
  @Override
  Flower yourNationalFlower() {
    return new Jasmine();
  }
}

class AndhraPradesh extends Region {
  @Override
  Flower yourNationalFlower() {
    return new Lily();
  }
}

public class Solution {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}
