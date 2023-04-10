package thecore.circleofnumbers;

public class Main {
    public static void main(String[] args) {
         int n = 10, firstNumber = 2;
        System.out.println(circleOfNumbers(10, 2));
    }

    public static int circleOfNumbers(int n, int firstNumber) {
//        Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).
//
//                Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
//
//        Example
//
//        For n = 10 and firstNumber = 2, the output should be
//        solution(n, firstNumber) = 7.
//
//
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        A positive even integer.
//
//        Guaranteed constraints:
//        4 ≤ n ≤ 20.
//
//                [input] integer firstNumber
//
//        Guaranteed constraints:
//        0 ≤ firstNumber ≤ n - 1.
//
//                [output] integer
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
        int radialOpp = firstNumber >= n/2 ? firstNumber - n/2 : firstNumber + n/2;
        return radialOpp;
    }

    public static int mikeconig(int n, int firstNumber) {
        return (firstNumber + n/2) % n;
    }
}
