package thecore.addtwodigits;

public class Main {
    public static void main(String[] args) {
        int n = 92;
        System.out.println(addTwoDigits(n));
    }

    public static int addTwoDigits(int n) {
//        You are given a two-digit integer n. Return the sum of its digits.
//
//        Example
//
//        For n = 29, the output should be
//        solution(n) = 11.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        A positive two-digit integer.
//
//                Guaranteed constraints:
//        10 ≤ n ≤ 99.
//
//                [output] integer
//
//        The sum of the first and second digits of the input number.
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
        int sum = 0;
        for(int i = 0; i < String.valueOf(n).length(); i++) {
            sum += Integer.parseInt(Character.toString(String.valueOf(n).charAt(i)));
        }
        return sum;
    }

    public static int hamsterulz(int n) {
        return n/10 + n%10;
    }
}
