package thecore.extranumber;

public class Main {
    public static void main(String[] args) {
        int a = 2, b = 7, c = 2;
        System.out.println(extraNumber(a, b, c));
    }

    public static int extraNumber(int a, int b, int c) {
//        You're given three integers, a, b and c. It is guaranteed that two of these integers are equal to each other. What is the value of the third integer?
//
//        Example
//
//        For a = 2, b = 7, and c = 2, the output should be
//        solution(a, b, c) = 7.
//
//        The two equal numbers are a and c. The third number (b) equals 7, which is the answer.
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer a
//
//        Guaranteed constraints:
//        1 ≤ a ≤ 109.
//
//                [input] integer b
//
//        Guaranteed constraints:
//        1 ≤ b ≤ 109.
//
//                [input] integer c
//
//        Guaranteed constraints:
//        1 ≤ c ≤ 109.
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
        if(a == b) {
            return c;
        }
        if(a == c) {
            return b;
        }
        return a;
    }

    public static int kpatel311(int a, int b, int c) {
        return a^b^c;
    }
}
