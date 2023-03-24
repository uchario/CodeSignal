package buildpalindrome;

public class Main {
    public static void main(String[] args) {
        String st = "abcdc";
        System.out.println(buildPalindrome(st));
    }

    public static String buildPalindrome(String st) {
//        Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.
//
//        Example
//
//        For st = "abcdc", the output should be
//        solution(st) = "abcdcba".
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string st
//
//        A string consisting of lowercase English letters.
//
//                Guaranteed constraints:
//        3 ≤ st.length ≤ 10.
//
//                [output] string
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
        String newSt = st;
        int count = 0;
        while(!newSt.equals(new StringBuilder(newSt).reverse().toString())) {
            newSt = new StringBuilder(newSt).append(" ").insert(st.length(), st.charAt(count)).toString().strip();
            count++;
        }
        return st;
    }
}
