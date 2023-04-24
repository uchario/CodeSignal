package thecore.srzb;

public class Main {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(srzb(n));
    }

    public static int srzb(int n) {
//        Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
//                Presented with the integer n, find the 0-based position of the second rightmost zero bit in its binary representation (it is guaranteed that such a bit exists), counting from right to left.
//
//        Return the value of 2position_of_the_found_bit.
//
//                Example
//
//        For n = 37, the output should be
//        solution(n) = 8.
//
//        3710 = 1001012. The second rightmost zero bit is at position 3 (0-based) from the right in the binary representation of n.
//                Thus, the answer is 23 = 8.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        Guaranteed constraints:
//        4 ≤ n ≤ 230.
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
        return ~(n|(n+1)) & ((n|(n+1))+1);
    }
}
