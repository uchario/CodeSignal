package differentsquares;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 1}, {2, 2, 2}, {2, 2, 2}, {1, 2, 3}, {2, 2, 1}};
        int[][] matrix1 = {{1, 2, 1, 3}, {2, 2, 2, 4}, {2, 2, 2, 1}, {1, 2, 3, 5}, {2, 2, 1, 3}, {5, 4, 1, 3}};
        System.out.println(differentSquares(matrix));
    }

    public static int differentSquares(int[][] matrix) {
//        Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.
//
//                Example
//
//                For
//
//        matrix = [[1, 2, 1],
//          [2, 2, 2],
//          [2, 2, 2],
//          [1, 2, 3],
//          [2, 2, 1]]
//        the output should be
//        solution(matrix) = 6.
//
//        Here are all 6 different 2 × 2 squares:
//
//        1 2
//        2 2
//        2 1
//        2 2
//        2 2
//        2 2
//        2 2
//        1 2
//        2 2
//        2 3
//        2 3
//        2 1
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.array.integer matrix
//
//        Guaranteed constraints:
//        1 ≤ matrix.length ≤ 100,
//                1 ≤ matrix[i].length ≤ 100,
//                0 ≤ matrix[i][j] ≤ 9.
//
//                [output] integer
//
//        The number of different 2 × 2 squares in matrix.
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
        Set<String> newMatrix = new HashSet<>();
        for(int i = 0; i < matrix.length - 1; i++) {
            for(int j = 0; j < matrix[i].length - 1; j++) {
                String temp = matrix[i][j] + "" + matrix[i][j + 1] + "" + matrix[i + 1][j] + "" + matrix[i + 1][j + 1];
                newMatrix.add(temp);
            }
        }
        return newMatrix.size();
    }
}
