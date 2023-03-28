package lineencoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String alpha = "aabcccdddd";
        System.out.println(lineEncoding(alpha));
    }

    public static String lineEncoding(String s) {
//        Given a string, return its encoding defined as follows:
//
//        First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
//        for example, "aabbbc" is divided into ["aa", "bbb", "c"]
//        Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
//        for example, substring "bbb" is replaced by "3b"
//        Finally, all the new strings are concatenated together in the same order and a new string is returned.
//        Example
//
//        For s = "aabbbc", the output should be
//        solution(s) = "2a3bc".
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string s
//
//        String consisting of lowercase English letters.
//
//        Guaranteed constraints:
//        4 ≤ s.length ≤ 15.
//
//                [output] string
//
//        Encoded version of s.
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

        String newS = s;
        char[] alphaArray = s.toCharArray();
        int count = 1, flag = 0;
        for(int i = 0; i < alphaArray.length - 1; i++) {
            if(alphaArray[i] == alphaArray[i + 1]) {
                count++;
            }
            if(alphaArray[i] != alphaArray[i + 1]) {
                if(count == 1) {
                    newS = newS.replace(s.substring(flag, i + 1),"" + s.charAt(i));
                } else {
                    newS = newS.replace(s.substring(flag, i + 1), count + "" + s.charAt(i));
                }
                count = 1;
                flag = i + 1;
            }
            if(i == alphaArray.length - 2) {
                s = s.concat(" ");
                if(count == 1) {
                    newS = newS.replace(s.substring(flag, i + 2), "" + s.charAt(i + 1));
                } else {
                    newS = newS.replace(s.substring(flag, i + 2), count + "" + s.charAt(i + 1));
                }
            }

        }
        return newS;
    }

    public static String pixelstorm(String s) {
        Matcher m = Pattern.compile("([a-z])\\1*").matcher(s);
        String result = "";
        while(m.find()){
            int len = m.group(0).length();
            char cha = m.group(0).charAt(0);
            result += (len==1?"":len) + "" + cha;
        }
        return result;
    }

    public static String baguetteron(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        s+=' ';
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)) count++;
            else{
                if(count>1){
                    result.append(count);
                }
                result.append(s.charAt(i-1));
                count=1;
            }
        }
        return result.toString();
    }
}
