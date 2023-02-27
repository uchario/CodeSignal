package avoidobstacles;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {5, 3, 6, 7, 9};
        System.out.println(avoidObstacles(inputArray));
    }

    public static int avoidObstacles(int[] inputArray) {
//        You are given an array of integers representing coordinates of obstacles situated on a straight line.
//
//        Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.
//
//                Find the minimal length of the jump enough to avoid all the obstacles.
//
//        Example
//
//        For inputArray = [5, 3, 6, 7, 9], the output should be
//        solution(inputArray) = 4.
//
//        Check out the image below for better understanding:
//
//
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.integer inputArray
//
//        Non-empty array of positive integers.
//
//        Guaranteed constraints:
//        2 ≤ inputArray.length ≤ 1000,
//                1 ≤ inputArray[i] ≤ 1000.
//
//                [output] integer
//
//        The desired length.
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

        int num = 0;
        Arrays.sort(inputArray);
        for(int i = 1; i < inputArray[inputArray.length - 1] + 2; i++) {
            if(num > 0) {
                break;
            }
            for(int j = 0; j < inputArray.length; j++) {
                if(inputArray[j]%i != 0) {
                    num = i;
                } else {
                    num = 0;
                    break;
                }
            }
        }
        return num;
    }

    public static int jocke93(int[] inputArray) {
        int jump = 1;
        boolean fail = true;

        while(fail) {
            jump++;
            fail = false;
            for(int i=0; i<inputArray.length; i++)
                if(inputArray[i]%jump==0) {
                    fail = true;
                    break;
                }
        }

        return jump;
    }
}
