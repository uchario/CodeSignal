package checkpalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("aabaa"));
    }

    public static boolean checkPalindrome(String inputString) {
//        Given the string, check if it is a palindrome.
//
//        Example
//
//        For inputString = "aabaa", the output should be
//        solution(inputString) = true;
//        For inputString = "abac", the output should be
//        solution(inputString) = false;
//        For inputString = "a", the output should be
//        solution(inputString) = true.
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string inputString
//
//        A non-empty string consisting of lowercase characters.
//
//                Guaranteed constraints:
//        1 ≤ inputString.length ≤ 105.
//
//                [output] boolean
//
//        true if inputString is a palindrome, false otherwise.
//
//[Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
//
        String temp = "";
        for(int i = inputString.length() - 1; i >= 0; i--) {
            temp += inputString.charAt(i);
        }
        if(inputString.equals(temp)) {
            return true;
        }
        return false;
    }

    public static boolean mminellaSolution(String inputString) {
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }
}
