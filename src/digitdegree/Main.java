package digitdegree;

public class Main {
    public static void main(String[] args) {
        int n = 91;
        System.out.println(digitDegree(n));
    }

    public static int digitDegree(int n) {
//        Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.
//
//        Given an integer, find its digit degree.
//
//                Example
//
//        For n = 5, the output should be
//        solution(n) = 0;
//        For n = 100, the output should be
//        solution(n) = 1.
//        1 + 0 + 0 = 1.
//        For n = 91, the output should be
//        solution(n) = 2.
//        9 + 1 = 10 -> 1 + 0 = 1.
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        Guaranteed constraints:
//        5 ≤ n ≤ 109.
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

        int count = 0;
        while(String.valueOf(n).length() > 1) {
            int temp = 0;
            for(int i = 0; i < String.valueOf(n).length(); i++) {
                temp += Integer.parseInt(Character.toString(String.valueOf(n).charAt(i)));
            }
            count++;
            n = temp;
        }
        return count;
    }
}
