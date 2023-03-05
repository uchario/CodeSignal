package minesweeper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean[][] input = {{true, false, false}, {false, true, false}, {false, false, false}};
        boolean[][] input2 = {{true, false, false, true}, {false, false, true, false}, {true, true, false, true}};
        System.out.println(Arrays.deepToString(minesweeper(input2)));
    }

    public static int[][] minesweeper(boolean[][] matrix) {
//        In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.
//
//        Example
//
//                For
//
//        matrix = [[true, false, false],
//          [false, true, false],
//          [false, false, false]]
//        the output should be
//
//        solution(matrix) = [[1, 2, 1],
//                    [2, 1, 1],
//                    [1, 1, 1]]
//        Check out the image below for better understanding:
//
//
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.array.boolean matrix
//
//        A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false otherwise.
//
//                Guaranteed constraints:
//        2 ≤ matrix.length ≤ 100,
//                2 ≤ matrix[0].length ≤ 100.
//
//                [output] array.array.integer
//
//        Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells. Two cells are called neighboring if they share at least one corner.
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

        int[][] output = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                for(int k = i - 1; k <= i + 1; k++) {
                    for(int l = j - 1; l <= j + 1; l++) {
                        try {
                            if(!(i == k && j == l) && matrix[k][l] == true) {
                                output[i][j]++;
                            }
                        } catch(ArrayIndexOutOfBoundsException e) {
                            continue;
                        }
                    }
                }
            }
        }
        return output;
    }

    public static int[][] margaret_m1(boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int neighbors = 0;
                // 0,0  0,1  0,2
                // 1,0 [1,1] 1,2
                // 2,0  2,1  2,2

                // top
                if (i > 0 && matrix[i-1][j]) neighbors++;

                // bottom
                if (i+1 < matrix.length && matrix[i+1][j]) neighbors++;

                // left
                if(j > 0 && matrix[i][j-1]) neighbors++;

                // right
                if (j+1 < matrix[0].length && matrix[i][j+1]) neighbors++;

                // upper left
                if (i > 0 && j > 0 && matrix[i-1][j-1]) neighbors++;

                // upper right
                if (i > 0 && j+1 < matrix[0].length && matrix[i-1][j+1]) neighbors++;

                // lower left
                if (i+1 < matrix.length && j > 0 && matrix[i+1][j-1]) neighbors++;

                // lower right
                if (i+1 < matrix.length && j+1 < matrix[0].length && matrix[i+1][j+1]) neighbors++;

                result[i][j] = neighbors;
            }
        }

        return result;
    }

    public static int[][] jocke93(boolean[][] matrix) {
        int[][] m = new int[matrix.length][];
        for(int i=0; i<matrix.length; i++)
            m[i] = new int [matrix[i].length];

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length; j++){
                for(int k=i-1; k<i+2; k++)
                    for(int l=j-1; l<j+2; l++)
                        if(k>=0 && k<matrix.length && l>=0 && l<matrix[i].length &&
                                !(k==i && j==l) && matrix[k][l])
                            m[i][j]++;
            }

        return m;
    }
}
