package firstnonrepeatingcharacter;

public class Main {
    public static void main(String[] args) {
        String s = "abacabad";
        char returnChar = firstNonRepeatingCharacter(s);
        System.out.println(returnChar);
    }

    public static char firstNonRepeatingCharacter(String s) {
//        Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.
//
//                Example
//
//        For s = "abacabad", the output should be
//        solution(s) = 'c'.
//
//                There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.
//
//        For s = "abacabaabacaba", the output should be
//        solution(s) = '_'.
//
//                There are no characters in this string that do not repeat.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string s
//
//        A string that contains only lowercase English letters.
//
//        Guaranteed constraints:
//        1 ≤ s.length ≤ 105.
//
//                [output] char
//
//        The first non-repeating character in s, or '_' if there are no characters that do not repeat.
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

        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
                return c[i];
        }
        return '_';

    }
}
