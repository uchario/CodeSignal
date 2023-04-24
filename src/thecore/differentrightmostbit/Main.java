package thecore.differentrightmostbit;

public class Main {
    public static void main(String[] args) {
        int n = 11, m = 13;
        System.out.println(differentRightMostBit(n, m));
    }

    public static int differentRightMostBit(int n, int m) {
//        You're given two integers, n and m. Find position of the rightmost bit in which they differ in their binary representations (it is guaranteed that such a bit exists), counting from right to left.
//
//        Return the value of 2position_of_the_found_bit (0-based).
//
//                Example
//
//        For n = 11 and m = 13, the output should be
//        solution(n, m) = 2.
//
//        1110 = 10112, 1310 = 11012, the rightmost bit in which they differ is the bit at position 1 (0-based) from the right in the binary representations.
//                So the answer is 21 = 2.
//
//        For n = 7 and m = 23, the output should be
//        solution(n, m) = 16.
//
//        710 = 1112, 2310 = 101112, i.e.
//
//        00111
//        10111
//        So the answer is 24 = 16.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        Guaranteed constraints:
//        0 ≤ n ≤ 230.
//
//                [input] integer m
//
//        Guaranteed constraints:
//        0 ≤ m ≤ 230,
//                n ≠ m.
//
//[output] integer
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
        return Integer.lowestOneBit(n^m);
    }

    public static int todayHumor(int n, int m) {
        return (n^=m) & -n;
    }
}
