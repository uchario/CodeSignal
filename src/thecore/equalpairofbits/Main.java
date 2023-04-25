package thecore.equalpairofbits;

public class Main {
    public static void main(String[] args) {
        int n = 10, m = 11;
        System.out.println(equalPairOfBits(n, m));
    }

    public static int equalPairOfBits(int n, int m) {
//        You're given two integers, n and m. Find position of the rightmost pair of equal bits in their binary representations (it is guaranteed that such a pair exists), counting from right to left.
//
//        Return the value of 2position_of_the_found_pair (0-based).
//
//                Example
//
//        For n = 10 and m = 11, the output should be
//        solution(n, m) = 2.
//
//        1010 = 10102, 1110 = 10112, the position of the rightmost pair of equal bits is the bit at position 1 (0-based) from the right in the binary representations.
//                So the answer is 21 = 2.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [memory limit] 1 GB
//
//                [input] integer n
//
//        Guaranteed constraints:
//        0 ≤ n ≤ 230.
//
//                [input] integer m
//
//        Guaranteed constraints:
//        0 ≤ m ≤ 230.
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
        return Integer.lowestOneBit(~(n^m));
    }
}
