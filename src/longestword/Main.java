package longestword;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Ready, Steady, go!";
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
        String[] splitStr = text.split(" "), splitStrCopy = text.split(" ");
        for(int i = 0; i < splitStr.length; i++) {
            for(int j = 0; j < splitStr[i].length(); j++) {
                if(!Character.isAlphabetic(splitStr[i].charAt(j))) {
                    splitStrCopy[i] = splitStrCopy[i].replace(String.valueOf(splitStr[i].charAt(j)), "");
                }
            }
        }
        String maxLen = "";
        for(int i = 0; i < splitStrCopy.length; i++) {
            if(splitStrCopy[i].length() > maxLen.length()) {
                maxLen = splitStrCopy[i];
            }
        }
        return maxLen;
    }

    public static String ben_w6(String text) {
        return Arrays.stream(text.split("\\W+")).max((a, b) -> a.length() - b.length()).get();
    }
}
