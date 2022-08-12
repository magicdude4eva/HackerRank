package practice.tutorials.crackingthecodinginterview.hashtablesransomnonte;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > Cracking the Coding Interview > Hash Tables: Ransom Note
 *       Link: https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        
        List<String> magazineWordList = new ArrayList<String>(Arrays.asList(magazine));
        int iFoundWords = 0;
        
        for (String noteWord : note) {
            if (magazineWordList.contains(noteWord)) {
                magazineWordList.remove(magazineWordList.indexOf(noteWord));
                ++iFoundWords;
            } else { // no point in carrying on - word does not exist
                break;
            }
        }
        
        if (iFoundWords == note.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

