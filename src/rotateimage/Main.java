package rotateimage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[][] a = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
       System.out.println(Arrays.toString(rotateImage(a)));
    }

    public static int[][] rotateImage(int[][] a) {
//        Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.
//
//        You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
//
//                Example
//
//        For
//
//        a = [[1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]]
//        the output should be
//
//        solution(a) =
//    [[7, 4, 1],
//     [8, 5, 2],
//     [9, 6, 3]]
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.array.integer a
//
//        Guaranteed constraints:
//        1 ≤ a.length ≤ 100,
//                a[i].length = a.length,
//                1 ≤ a[i][j] ≤ 104.
//
//                [output] array.array.integer
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
        int[][] newArray = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                newArray[i][j] = a[a.length - 1 - j][i];
            }
        }
        return newArray;
    }
}
