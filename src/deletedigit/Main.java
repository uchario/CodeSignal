package deletedigit;

public class Main {
    public static void main(String[] args) {
        int n = 1001;
        System.out.println(deleteDigit(n));
    }

    public static int deleteDigit(int n) {
//        Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.
//
//                Example
//
//        For n = 152, the output should be
//        solution(n) = 52;
//        For n = 1001, the output should be
//        solution(n) = 101.
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        Guaranteed constraints:
//        10 ≤ n ≤ 106.
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

        int maxNum = 0;
        StringBuilder sb = new StringBuilder(String.valueOf(n)), copyStrVal = new StringBuilder(sb);
        for (int i = 0; i < sb.length(); i++) {
            int strToInt = Integer.parseInt(copyStrVal.deleteCharAt(i).toString());
            if(strToInt > maxNum) {
                maxNum = strToInt;
            }
            copyStrVal = new StringBuilder(sb);
        }
        return maxNum;
    }

    public static int ben_w6(int n) {
        int max = 0;
        for (int t = 1; t < n; t *= 10)
            max = Math.max(n / 10 / t * t + n % t, max);
        return max;
    }
}
