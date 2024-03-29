package thecore.maxmultiple;

public class Main {
    public static void main(String[] args) {
        int divisor = 3, bound = 10;
        System.out.println(maxMultiple(divisor, bound));
    }

    public static int maxMultiple(int divisor, int bound) {
//        Given a divisor and a bound, find the largest integer N such that:
//
//        N is divisible by divisor.
//                N is less than or equal to bound.
//                N is greater than 0.
//        It is guaranteed that such a number exists.
//
//        Example
//
//        For divisor = 3 and bound = 10, the output should be
//        solution(divisor, bound) = 9.
//
//        The largest integer divisible by 3 and not larger than 10 is 9.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer divisor
//
//        Guaranteed constraints:
//        2 ≤ divisor ≤ 10.
//
//                [input] integer bound
//
//        Guaranteed constraints:
//        5 ≤ bound ≤ 100.
//
//                [output] integer
//
//        The largest integer not greater than bound that is divisible by divisor.
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
        int dividend = 0;
        for(int i = 1; i <= bound; i++) {
            if(i % divisor == 0) {
                dividend = i;
            }
        }
        return dividend;
    }

    public static int mikeconig(int divisor, int bound) {
        return (bound / divisor) * divisor;
    }
}
