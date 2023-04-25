package thecore.leastfactorial;

public class Main {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(leastFactorial(n));
    }

    public static int leastFactorial(int n) {
//        Given an integer n, find the minimal k such that
//
//                k = m! (where m! = 1 * 2 * ... * m) for some integer m;
//        k >= n.
//                In other words, find the smallest factorial which is not less than n.
//
//                Example
//
//        For n = 17, the output should be
//        solution(n) = 24.
//
//        17 < 24 = 4! = 1 * 2 * 3 * 4, while 3! = 1 * 2 * 3 = 6 < 17).
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [memory limit] 1 GB
//
//                [input] integer n
//
//        A positive integer.
//
//                Guaranteed constraints:
//        1 ≤ n ≤ 120.
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
        int k = 1;
        int fact = factorial(k);
        while(fact < n) {
            fact = factorial(++k);
        }
        return fact;
    }
    static int factorial(int m) {
        if(m == 1 || m == 0) {
            return 1;
        }
        return m * factorial(m - 1);
    }

    public static int dayanruben(int n) {
        int k = 1, c = 1;
        while (k < n) k *= c++;
        return k;
    }
}
