package thecore.mirrorbits;

public class Main {
    public static void main(String[] args) {
        int a = 97;
        System.out.println(mirrorBits(a));
    }

    public static int mirrorBits(int a) {
//        Reverse the order of the bits in a given integer.
//
//        Example
//
//        For a = 97, the output should be
//        solution(a) = 67.
//
//        97 equals to 1100001 in binary, which is 1000011 after mirroring, and that is 67 in base 10.
//
//        For a = 8, the output should be
//        solution(a) = 1.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer a
//
//        Guaranteed constraints:
//        5 ≤ a ≤ 105.
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

        return Integer.parseInt(new StringBuilder(String.valueOf(Integer.toBinaryString(a))).reverse().toString(), 2);
    }
}
