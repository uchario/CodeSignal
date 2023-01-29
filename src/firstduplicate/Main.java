package firstduplicate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 1};
        int finalNumber = marinisaac1Solution(array);
        System.out.println(finalNumber);
    }

    public static int firstDuplicate(int[] a) {
//        Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.
//
//        Example

//        For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3.
//
//        There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.
//
//        For a = [2, 2], the output should be solution(a) = 2;
//
//        For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.integer a
//
//        Guaranteed constraints:
//        1 ≤ a.length ≤ 105,
//                1 ≤ a[i] ≤ a.length.
//
//[output] integer
//
//        The element in a that occurs in the array more than once and has the minimal index for its second occurrence. If there are no such elements, return -1.
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
        HashMap<Integer, Integer> index = new HashMap<>();
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] == a[i]) {
                    if(!(index.containsKey(a[j]))) {
                        index.put(a[j], j);
                        break;
                    }
                }
            }
        }
        int k = a.length;
        int finalNumber = -1;
        for (Map.Entry<Integer, Integer> set : index.entrySet()) {
            if(set.getValue() < k) {
                k = set.getValue();
                finalNumber = set.getKey();
            }
        }
        return finalNumber;
    }

    public static int marinisaac1Solution(int[] a) {
//        int[] array = {1, 1, 2, 2, 1};
        for(int i = 0; i < a.length; i++)
            if(a[Math.abs(a[i]) - 1] < 0)
                return Math.abs(a[i]);
            else{
                a[Math.abs(a[i]) - 1] =- a[Math.abs(a[i]) - 1];
            }
        return -1;
    }
}
