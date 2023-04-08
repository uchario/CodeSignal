package thecore.largestnumber;

public class Main {
    public static void main(String[] args) {
       int n = 2;
       System.out.println(largestNumber(n));
    }

    public static int largestNumber(int n) {
//        Given an integer n, return the largest number that contains exactly n digits.
//
//                Example
//
//        For n = 2, the output should be
//        solution(n) = 99.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        Guaranteed constraints:
//        1 ≤ n ≤ 9.
//
//                [output] integer
//
//        The largest integer of length n.
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

        String newString = "";
        for(int i = 0; i < n; i++) {
            newString += "9";
        }
        return Integer.parseInt(newString);
    }

    public static int mikeconig(int n) {
        return (int)Math.pow(10,n) - 1;
    }
}
