package thecore.appleboxes;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int k = 5;
        System.out.println(appleBoxes(k));
    }

    public static int appleBoxes(int k) {
//        You have k apple boxes full of apples. Each square box of size m contains m × m apples. You just noticed two interesting properties about the boxes:
//
//        The smallest box is size 1, the next one is size 2,..., all the way up to size k.
//                Boxes that have an odd size contain only yellow apples. Boxes that have an even size contain only red apples.
//        Your task is to calculate the difference between the number of red apples and the number of yellow apples.
//
//                Example
//
//        For k = 5, the output should be
//        solution(k) = -15.
//
//        There are 1 + 3 * 3 + 5 * 5 = 35 yellow apples and 2 * 2 + 4 * 4 = 20 red apples, making the answer 20 - 35 = -15.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [memory limit] 1 GB
//
//                [input] integer k
//
//        A positive integer.
//
//                Guaranteed constraints:
//        1 ≤ k ≤ 40.
//
//                [output] integer
//
//        The difference between the two types of apples.
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

        return IntStream.range(1, k + 1).filter(i -> i % 2 == 0).map(i -> i * i).sum()
                - IntStream.range(1, k + 1).filter(i -> i % 2 != 0).map(i -> i * i).sum();
    }
}
