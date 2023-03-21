package differentsymbolsnaive;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "aabbccdd";
        System.out.println(differentSymbolsNaive(s));
    }

    public static int differentSymbolsNaive(String s) {
//        Given a string, find the number of different characters in it.
//
//                Example
//
//        For s = "cabca", the output should be
//        solution(s) = 3.
//
//        There are 3 different characters a, b and c.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string s
//
//        A string of lowercase English letters.
//
//        Guaranteed constraints:
//        3 ≤ s.length ≤ 1000.
//
//                [output] integer
//
//                [Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
//        String helloWorld(String name) {
//            System.out.println("This prints to the console when you Run Tests");
//            return "Hello, " + name;
//        }

        Set<Character> alpha = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            alpha.add(s.charAt(i));
        }
        return alpha.size();
    }

    public static int ben_w6(String s) {
        return (int) s.chars().distinct().count();
    }
}
