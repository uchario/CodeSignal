package sudoku;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        char[][] grid = {
                {'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '7', '.'}
        };
        System.out.println(sudoku(grid));
    }

    public static boolean sudoku(char[][] grid) {
//        Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.
//
//        Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to the layout rules described above. Note that the puzzle represented by grid does not have to be solvable.
//
//                Example
//
//                For
//
//        grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
//        ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
//        ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
//        ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
//        ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
//        ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
//        ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
//        ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
//        ['.', '.', '.', '5', '.', '.', '.', '7', '.']]
//        the output should be
//        solution(grid) = true;
//
//        For
//
//        grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
//        ['.', '.', '.', '.', '6', '.', '.', '.', '.'],
//        ['7', '1', '.', '.', '7', '5', '.', '.', '.'],
//        ['.', '7', '.', '.', '.', '.', '.', '.', '.'],
//        ['.', '.', '.', '.', '8', '3', '.', '.', '.'],
//        ['.', '.', '8', '.', '.', '7', '.', '6', '.'],
//        ['.', '.', '.', '.', '.', '2', '.', '.', '.'],
//        ['.', '1', '.', '2', '.', '.', '.', '.', '.'],
//        ['.', '2', '.', '.', '3', '.', '.', '.', '.']]
//        the output should be
//        solution(grid) = false.
//
//                The given grid is not correct because there are two 1s in the second column. Each column, each row, and each 3 × 3 subgrid can only contain the numbers 1 through 9 one time.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.array.char grid
//
//        A 9 × 9 array of characters, in which each character is either a digit from '1' to '9' or a period '.'.
//
//[output] boolean
//
//        Return true if grid represents a valid Sudoku puzzle, otherwise return false.
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
        int n = grid.length;

        Set<String> set = new HashSet<String>();

        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in row " + row))
                    return false;
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in col " + col))
                    return false;
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in square " + row/3 + " " + col/3))
                    return false;
            }
        }

        return true;
    }

}
