package practice.problemsolving.datastructures.arrays.dynamicarray;

import java.io.*;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Data Structures > Arrays > Dynamic Array
 *       Link: https://www.hackerrank.com/challenges/dynamic-array/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    /*
     * Complete the dynamicArray function below.
     */
    static int[] dynamicArray(int n, int[][] queries) {
        /*
         * Write your code here.
         */
      // Person should be fucking shot for wording the problem like he did. 
      List<Integer>[] seqList = new List[n];
      int lastAnswer = 0;
      List<Integer> results = new ArrayList<>();
      
      for (int[] query : queries) {
        
        int index = (query[1] ^ lastAnswer) % n;
        
        if (query[0] == 1) {
          if (seqList[index] == null) {
            seqList[index] = new ArrayList<>();
          }
          seqList[index].add(query[2]);
        } else {
          List<Integer> subList = seqList[index];
          lastAnswer = subList.get(query[2] % subList.size());
          results.add(lastAnswer);
        }
      }
      
      return results.stream().mapToInt(i -> i).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[][] queries = new int[q][3];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = dynamicArray(n, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
