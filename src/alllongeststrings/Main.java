package alllongeststrings;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static String[] allLongestStrings(String[] inputArray) {

//        Given an array of strings, return another array containing all of its longest strings.
//
//                Example
//
//        For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
//        solution(inputArray) = ["aba", "vcd", "aba"].
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.string inputArray
//
//        A non-empty array.
//
//                Guaranteed constraints:
//        1 ≤ inputArray.length ≤ 10,
//                1 ≤ inputArray[i].length ≤ 10.
//
//                [output] array.string
//
//        Array of the longest strings, stored in the same order as in the inputArray.
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

        int longest = 0;

        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].length() > longest) {
                longest = inputArray[i].length();
            }
        }

        ArrayList<String> newArray = new ArrayList<>();

        for(int j = 0; j < inputArray.length; j++) {
            if(inputArray[j].length() == longest) {
                newArray.add(inputArray[j]);
            }
        }

        String[] finalArray = new String[newArray.size()];

        for(int k = 0; k < finalArray.length; k++) {
            finalArray[k] = newArray.get(k);
        }
        return finalArray;
    }

    public static String[] p4kSolution(String[] inputArray) {
        String l = ""; //full string with "-" separator

        for( String s: inputArray )
        {
            //length is first index of substring
            //if list has same size strings, add this one
            if( l.indexOf("-") == s.length() )
                l += s + "-";
                //reset if list has smaller strings
            else if ( l.indexOf("-") < s.length() )
                l = s + "-";
        }

        return l.split( "-" );
    }
}
