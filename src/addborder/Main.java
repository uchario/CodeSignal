package addborder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] picture = new String[] {"abc", "ded"};
        System.out.println(Arrays.toString(addBorder(picture)));
    }

    public static String[] addBorder(String[] picture) {
//        Given a rectangular matrix of characters, add a border of asterisks(*) to it.
//
//        Example
//
//                For
//
//        picture = ["abc",
//                "ded"]
//        the output should be
//
//        solution(picture) = ["*****",
//                "*abc*",
//                "*ded*",
//                "*****"]
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.string picture
//
//        A non-empty array of non-empty equal-length strings.
//
//                Guaranteed constraints:
//        1 ≤ picture.length ≤ 100,
//                1 ≤ picture[i].length ≤ 100.
//
//                [output] array.string
//
//        The same matrix of characters, framed with a border of asterisks of width 1.
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
        String[] newArray = new String[picture.length + 2];
        int charLength = picture[0].length();
        int asteriskLength = charLength + 2;
        newArray[0] = "*".repeat(asteriskLength);
        newArray[newArray.length - 1] = "*".repeat(asteriskLength);
        for(int i = 1; i < newArray.length - 1; i++) {
            newArray[i] = "*" + picture[i - 1] + "*";
        }
        return newArray;
    }

    public static String[] bartek_p1(String[] picture) {
        String[] framedPicture = new String[picture.length + 2];

        for(int i = 0 ; i < picture.length ; i++) {
            framedPicture[i+1] = '*' + picture[i] + '*';
        }

        framedPicture[0] = framedPicture[picture.length + 1] = framedPicture[1].replaceAll(".","*");

        return framedPicture;
    }

}
