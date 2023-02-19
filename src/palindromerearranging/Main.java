package palindromerearranging;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "aabb";
    }

    public static boolean palindromeRearranging(String inputString) {
//        Given a string, find out if its characters can be rearranged to form a palindrome.
//
//                Example
//
//        For inputString = "aabb", the output should be
//        solution(inputString) = true.
//
//                We can rearrange "aabb" to make "abba", which is a palindrome.
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string inputString
//
//        A string consisting of lowercase English letters.
//
//                Guaranteed constraints:
//        1 ≤ inputString.length ≤ 50.
//
//                [output] boolean
//
//        true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
//
//[Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
    //        String helloWorld(String name) {
    //            System.out.println("This prints to the console when you Run Tests");
    //            return "Hello, " + name;
    //        }
        return true;
    }

    public static boolean samantha_p5(String inputString) {
        int map = 0;
        for(int i=0; i<inputString.length(); i++) {
            map ^= 1 << (inputString.charAt(i) - 'a');
        }
        return map == 0 || (map & -map) == map;
    }

    public static boolean melvin_m8(String inputString) {
        Set<Character> chars = new HashSet<Character>();

        for (int i = 0; i < inputString.length();  ++i) {
            char c = inputString.charAt(i);
            if (chars.contains(c)) {
                chars.remove(c);
            }
            else {
                chars.add(c);
            }
        }
        return chars.size() <= 1 ? true : false;
    }

    public static boolean jocke93(String inputString) {
        int []niz = new int[26];

        for(int i=0; i<inputString.length(); i++)
            niz[inputString.charAt(i)-97]++;

        int cnt=0;
        for(int i=0; i<niz.length; i++)
            if(niz[i]%2!=0)
                cnt++;

        return cnt<=1;
    }
}
