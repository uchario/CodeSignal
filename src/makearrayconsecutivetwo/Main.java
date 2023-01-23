package makearrayconsecutivetwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
//        each statue having an non-negative integer size. Since he likes to make things perfect,
//        he wants to arrange them from smallest to largest so that each statue will be bigger
//        than the previous one exactly by 1. He may need some additional statues to be able to
//        accomplish that. Help him figure out the minimum number of additional statues needed.

//        Example

//        For statues = [6, 2, 3, 8], the output should be
//        solution(statues) = 3.

//        Ratiorg needs statues of sizes 4, 5 and 7.
//        Input/Output

//        [execution time limit] 3 seconds (java)

//        [input] array.integer statues

//        An array of distinct non-negative integers.

//        Guaranteed constraints:
//        1 ≤ statues.length ≤ 10,
//        0 ≤ statues[i] ≤ 20.
//
//        [output] integer
//
//        The minimal number of statues that need to be added to existing statues such that
//        it contains every integer size from an interval [L, R] (for some L, R) and no
//        other sizes.

        int[] statues = {6, 2, 3, 8};
        Arrays.sort(statues);
        HashMap<Integer, Boolean> newArray = new HashMap<>();
        for(int i = 0; i < statues.length; i++) {
            newArray.put(statues[i], true);
        }
        int counter = 0;
        for(int j = statues[0]; j < statues[statues.length - 1]; j++) {
            if(newArray.get(j) == null) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static int dhruvilSolution(int[] a) {
        Arrays.sort(a);
        int n = a[a.length-1] - a[0];
        return n - a.length + 1;
    }
}
