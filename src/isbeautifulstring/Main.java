package isbeautifulstring;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inputString = "zaa";
//        System.out.println(isBeautiful(inputString));
        System.out.println(Arrays.toString(inputString.getBytes()));
        for(int i : inputString.getBytes()) {
            System.out.println(i);
        }
    }

    public static boolean isBeautiful(String inputString) {
//        A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string; ie: b occurs no more times than a; c occurs no more times than b; etc. Note that letter a has no previous letter.
//
//        Given a string, check whether it is beautiful.
//
//        Example
//
//        For inputString = "bbbaacdafe", the output should be solution(inputString) = true.
//
//                This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other letter), so since there aren't any letters that appear more frequently than the previous letter, this string qualifies as beautiful.
//
//        For inputString = "aabbb", the output should be solution(inputString) = false.
//
//                Since there are more bs than as, this string is not beautiful.
//
//        For inputString = "bbc", the output should be solution(inputString) = false.
//
//                Although there are more bs than cs, this string is not beautiful because there are no as, so therefore there are more bs than as.
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string inputString
//
//        A string of lowercase English letters.
//
//        Guaranteed constraints:
//        3 ≤ inputString.length ≤ 50.
//
//                [output] boolean
//
//        Return true if the string is beautiful, false otherwise.
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

        if(!inputString.isBlank() && !inputString.contains("a")) {
            return false;
        }
        int[] inputStringArray = inputString.codePoints().toArray();
        int[] inputStringArrayDistinct = inputString.codePoints().distinct().toArray();
        Arrays.sort(inputStringArray);
        Arrays.sort(inputStringArrayDistinct);
        int[] inputStringArrayCount = new int[(int)inputString.codePoints().distinct().count()];
        inputStringArrayCount[0] = 1;
        int j = 0;
        for(int i = 0; i < inputStringArray.length - 1; i++) {
            if(inputStringArray[i] - inputStringArray[i + 1] == 0 ) {
                inputStringArrayCount[j]++;
            } else {
                inputStringArrayCount[j + 1]++;
                j++;
            }
        }
        for(int k = 0; k < inputStringArrayCount.length - 1; k++) {
            if((inputStringArrayCount[k] < inputStringArrayCount[k + 1]) || (inputStringArrayDistinct[k + 1] - inputStringArrayDistinct[k] > 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean thucnguyen(String s) {
        int [] c = new int[26];

        for (int i : s.getBytes()) c[i-'a'] ++;

        for (int i = 1; i < 26; i ++)
            if (c[i] > c[i-1]) return false;

        return true;
    }

}
