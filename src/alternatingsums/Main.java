package alternatingsums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] weightArray = {50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(alternatingSums(weightArray)));
    }

    public static int[] alternatingSums(int[] a) {
//        Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
//
//        You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.
//
//                Example
//
//        For a = [50, 60, 60, 45, 70], the output should be
//        solution(a) = [180, 105].
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.integer a
//
//        Guaranteed constraints:
//        1 ≤ a.length ≤ 105,
//                45 ≤ a[i] ≤ 100.
//
//                [output] array.integer
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
        int[] weightArray = new int[2];
        int firstSum = 0, secondSum = 0;
        for(int i = 0; i < a.length; i++) {
            if(i%2 == 0) {
                firstSum += a[i];
            }  else {
                secondSum += a[i];
            }
        }
        weightArray[0] = firstSum;
        weightArray[1] = secondSum;
        return weightArray;
    }

    public static int[] jocke93(int[] a) {
        int []niz = new int[2];

        for(int i=0; i<a.length; i++)
            niz[i%2]+=a[i];

        return niz;
    }
}
