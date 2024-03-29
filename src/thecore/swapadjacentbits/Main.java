package thecore.swapadjacentbits;

public class Main {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(swapAdjacentBits(n));
    }

    public static int swapAdjacentBits(int n) {
//        You're given an arbitrary 32-bit integer n. Take its binary representation, split bits into it in pairs (bit number 0 and 1, bit number 2 and 3, etc.) and swap bits in each pair. Then return the result as a decimal number.
//
//        Example
//
//        For n = 13, the output should be
//        solution(n) = 14.
//
//        1310 = 11012 ~> {11}{01}2 ~> 11102 = 1410.
//
//        For n = 74, the output should be
//        solution(n) = 133.
//
//        7410 = 010010102 ~> {01}{00}{10}{10}2 ~> 100001012 = 13310.
//        Note the preceding zero written in front of the initial number: since both numbers are 32-bit integers, they have 32 bits in their binary representation. The preceding zeros in other cases don't matter, so they are omitted. Here, however, it does make a difference.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        Guaranteed constraints:
//        0 ≤ n < 230.
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
        return (n<<1&0b10101010101010101010101010101010) + (n>>1&0b01010101010101010101010101010101);
    }
}
