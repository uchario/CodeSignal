package areyousimilar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,2};
        int[] b = {2,1,1};
        System.out.println(trinhnguyen(a, b));
    }

    public static boolean areYouSimilar(int[] a, int[] b) {
//        Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
//
//                Given two arrays a and b, check whether they are similar.
//
//        Example
//
//        For a = [1, 2, 3] and b = [1, 2, 3], the output should be
//        solution(a, b) = true.
//
//                The arrays are equal, no need to swap any elements.
//
//                For a = [1, 2, 3] and b = [2, 1, 3], the output should be
//        solution(a, b) = true.
//
//                We can obtain b from a by swapping 2 and 1 in b.
//
//        For a = [1, 2, 2] and b = [2, 1, 1], the output should be
//        solution(a, b) = false.
//
//                Any swap of any two elements either in a or in b won't make a and b equal.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.integer a
//
//        Array of integers.
//
//                Guaranteed constraints:
//        3 ≤ a.length ≤ 105,
//                1 ≤ a[i] ≤ 1000.
//
//                [input] array.integer b
//
//        Array of integers of the same length as a.
//
//                Guaranteed constraints:
//        b.length = a.length,
//                1 ≤ b[i] ≤ 1000.
//
//                [output] boolean
//
//        true if a and b are similar, false otherwise.
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
        return false;
    }

    public static boolean trinhnguyen(int[] a, int[] b) {
        int rs = 0, s1 = 1, s2 = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                rs++;
            s1 *= a[i];
            s2 *= b[i];
        }
        return rs <= 2 && s1 == s2;
    }

    public static boolean bandorthild(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {if (a[i] != b[i]) {sum++;}}
        Arrays.sort(a);
        Arrays.sort(b);
<<<<<<< HEAD
        return Arrays.equals(a, b) && sum < 3;
=======
        return Arrays.equals(a, b) && sum < 3;}
>>>>>>> origin/master
    }
}
