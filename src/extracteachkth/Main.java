package extracteachkth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println(Arrays.toString(extractEachKth(inputArray, k)));;
    }

    public static int[] extractEachKth(int[] inputArray, int k) {
//        Given array of integers, remove each kth element from it.
//
//                Example
//
//        For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
//        solution(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.integer inputArray
//
//        Guaranteed constraints:
//        5 ≤ inputArray.length ≤ 15,
//                -20 ≤ inputArray[i] ≤ 20.
//
//                [input] integer k
//
//        Guaranteed constraints:
//        1 ≤ k ≤ 10.
//
//                [output] array.integer
//
//        inputArray without elements k - 1, 2k - 1, 3k - 1 etc.
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

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= inputArray.length; i++ ) {
            if(i % k != 0) {
                arrayList.add(inputArray[i - 1]);
            }
        }
        return arrayList.stream().mapToInt(i->i).toArray();
    }

    public static int[] n28646(int[] inputArray, int k) {
        return IntStream.range(0, inputArray.length).filter(i -> ((i + 1) % k) != 0).map(i -> inputArray[i]).toArray();
    }
}
