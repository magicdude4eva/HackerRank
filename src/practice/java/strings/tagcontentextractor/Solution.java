package practice.java.strings.tagcontentextractor;

import java.util.*;
import java.util.regex.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Strings > Tag Content Extractor
 *       Link: https://www.hackerrank.com/challenges/tag-content-extractor/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution{
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
    while(testCases>0){
      String line = in.nextLine();
      
            boolean found = false;
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }
            if ( ! found) {
                System.out.println("None");
            }
      
      testCases--;
    }
    in.close();
  }
}



