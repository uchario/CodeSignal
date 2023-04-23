package thecore.rangebitcount;

public class Main {
    public static void main(String[] args) {
        int a = 2, b = 7;
        System.out.println(rangeBitCount(a, b));
    }

    public static int rangeBitCount(int a, int b) {
//        You are given two numbers a and b where 0 ≤ a ≤ b. Imagine you construct an array of all the integers from a to b inclusive. You need to count the number of 1s in the binary representations of all the numbers in the array.
//
//        Example
//
//        For a = 2 and b = 7, the output should be
//        solution(a, b) = 11.
//
//        Given a = 2 and b = 7 the array is: [2, 3, 4, 5, 6, 7]. Converting the numbers to binary, we get [10, 11, 100, 101, 110, 111], which contains 1 + 2 + 1 + 2 + 2 + 3 = 11 1s.
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer a
//
//        Guaranteed constraints:
//        0 ≤ a ≤ b.
//
//[input] integer b
//
//        Guaranteed constraints:
//        a ≤ b ≤ 10.
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
        String[] binaryStr = new String[b - a + 1];
        int j = 0, count = 0;
        for(int i = a; i <= b; i++) {
            binaryStr[j] = Integer.toBinaryString(i);
            for(int k = 0; k < binaryStr[j].length(); k++) {
                if(binaryStr[j].charAt(k) == '1') {
                    count++;
                }
            }
            j++;
        }
        return count;
    }

    public static int cthaeghya(int a, int b) {
        int t = 0;
        for (int i = a; i<=b; i++) {
            t += Integer.bitCount(i);
        }
        return t;
    }
}
