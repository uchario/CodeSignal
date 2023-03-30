package longestword;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "ab-CDE-fg_hi";
        System.out.println(longestWord(text));
    }

    public static String longestWord(String text) {
//        Define a word as a sequence of consecutive English letters. Find the longest word from the given string.
//
//        Example
//
//        For text = "Ready, steady, go!", the output should be
//        solution(text) = "steady".
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string text
//
//        Guaranteed constraints:
//        4 ≤ text.length ≤ 50.
//
//                [output] string
//
//        The longest word from text. It's guaranteed that there is a unique output.
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
        String textCopy = text;
        for(int i = 0; i < textCopy.length(); i++) {
            if(!Character.isAlphabetic(textCopy.charAt(i))) {
                textCopy = textCopy.replace(String.valueOf(textCopy.charAt(i)), " ");
            }
        }
        String[] textCopySplit = textCopy.split(" ");
        String maxLen = "";
        for(int i = 0; i < textCopySplit.length; i++) {
            if(textCopySplit[i].length() > maxLen.length()) {
                maxLen = textCopySplit[i];
            }
        }
        return maxLen;
    }

    public static String ben_w6(String text) {
        return Arrays.stream(text.split("\\W+")).max((a, b) -> a.length() - b.length()).get();
    }
}
