package thecore.candies;

public class Main {
    public static void main(String[] args) {
        int n = 3, m = 9;
        System.out.println(candies(n, m));
    }

    public static int candies(int n, int m) {
//        n children have got m pieces of candy. They want to eat as much candy as they can, but each child must eat exactly the same amount of candy as any other child. Determine how many pieces of candy will be eaten by all the children together. Individual pieces of candy cannot be split.
//
//                Example
//
//        For n = 3 and m = 10, the output should be
//        solution(n, m) = 9.
//
//        Each child will eat 3 pieces. So the answer is 9.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        The number of children.
//
//        Guaranteed constraints:
//        1 ≤ n ≤ 10.
//
//                [input] integer m
//
//        The number of pieces of candy.
//
//        Guaranteed constraints:
//        2 ≤ m ≤ 100.
//
//                [output] integer
//
//        The total number of pieces of candy the children will eat provided they eat as much as they can and all children eat the same amount.
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
        return (m/n) * n;
    }
}
