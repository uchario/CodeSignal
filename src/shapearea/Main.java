package shapearea;

public class Main {
    public static void main(String[] args) {
        System.out.println(shapeArea(3));
    }

    public static int shapeArea(int n) {
//        Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
//
//                A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
//
//
//
//                Example
//
//        For n = 2, the output should be
//        solution(n) = 5;
//        For n = 3, the output should be
//        solution(n) = 13.
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        Guaranteed constraints:
//        1 ≤ n < 104.
//
//                [output] integer
//
//        The area of the n-interesting polygon.
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

        if(n == 1) {
            return 1;
        }
        int result =  4 * (n - 1) + shapeArea(n - 1);
        return result;
    }
}
