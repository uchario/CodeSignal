package almostincreasingsequence;

public class Main {
    public static void main(String[] args) {
//        Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
//
//        Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.
//
//        Example
//
//        For sequence = [1, 3, 2, 1], the output should be
//        solution(sequence) = false.
//
//                There is no one element in this array that can be removed in order to get a strictly increasing sequence.
//
//                For sequence = [1, 3, 2], the output should be
//        solution(sequence) = true.
//
//                You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.integer sequence
//
//        Guaranteed constraints:
//        2 ≤ sequence.length ≤ 105,
//                -105 ≤ sequence[i] ≤ 105.
//
//                [output] boolean
//
//        Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.
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

        int []arr = { 1, 2, 5, 3, 5 };
        int N = arr.length;

        if (almostIncreasingSequence(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        // Stores the count of numbers that
        // are needed to be removed
        int count = 0;

        // Store the index of the element
        // that needs to be removed
        int index = -1;

        int n = sequence.length;

        // Traverse the range [1, N - 1]
        for(int i = 1; i < n; i++)
        {

            // If arr[i-1] is greater than
            // or equal to arr[i]
            if (sequence[i - 1] >= sequence[i])
            {

                // Increment the count by 1
                count++;

                // Update index
                index = i;
            }
        }

        // If count is greater than one
        if (count > 1)
            return false;

        // If no element is removed
        if (count == 0)
            return true;

        // If only the last or the
        // first element is removed
        if (index == n - 1 || index == 1)
            return true;

        // If a[index] is removed
        if (sequence[index - 1] < sequence[index + 1])
            return true;

        // If a[index - 1] is removed
        if (index - 2 >= 0 && sequence[index - 2] < sequence[index])
            return true;

        // if there is no element to compare
        if(index < 0)
            return true;

        return false;
    }

    public static boolean gopinathSolution(int[] sequence) {
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i+1] >= 0) {
                numErr += 1;
                if (i - 1 >= 0 && i + 2 <= sequence.length - 1
                        && sequence[i] - sequence[i+2] >= 0
                        && sequence[i-1] - sequence[i+1] >= 0) {
                    return false;
                }
            }
        }

        return numErr <= 1;
    }



}
