package thecore.arithmeticexpression;

public class Main {
    public static void main(String[] args) {
        int a = 8, b = 3, c = 2;
        System.out.println(arithmeticExpression(a, b, c));
    }

    public static boolean arithmeticExpression(int a, int b, int c) {
//        Consider an arithmetic expression of the form a#b=c. Check whether it is possible to replace # with one of the four signs: +, -, * or / to obtain a correct expression.
//
//        Example
//
//        For a = 2, b = 3, and c = 5, the output should be
//        solution(a, b, c) = true.
//
//                We can replace # with a + to obtain 2 + 3 = 5, so the answer is true.
//
//                For a = 8, b = 2, and c = 4, the output should be
//        solution(a, b, c) = true.
//
//                We can replace # with a / to obtain 8 / 2 = 4, so the answer is true.
//
//                For a = 8, b = 3, and c = 2, the output should be
//        solution(a, b, c) = false.
//
//        8 + 3 = 11 ≠ 2;
//        8 - 3 = 5 ≠ 2;
//        8 * 3 = 24 ≠ 2;
//        8 / 3 = 2.(6) ≠ 2.
//        So the answer is false.
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer a
//
//        Guaranteed constraints:
//        1 ≤ a ≤ 20.
//
//                [input] integer b
//
//        Guaranteed constraints:
//        1 ≤ b ≤ 20.
//
//                [input] integer c
//
//        Guaranteed constraints:
//        0 ≤ c ≤ 20.
//
//                [output] boolean
//
//        true if the desired replacement is possible, false otherwise.
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
       if(a + b == c || a - b == c || a * b == c || (double)a / b == c) {
          return true;
       }
        return false;
    }

    public static boolean mssk(int a, int b, int c) {
        return a+b==c || a-b==c || a*b==c || (double)a/b==c;
    }
}
