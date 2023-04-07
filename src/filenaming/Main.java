package filenaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"doc", "doc", "image", "doc(1)", "doc"};
        System.out.println(fileNaming(stringArray));
    }

    public static List<String> fileNaming(String[] names) {
//        You are given an array of strings names representing filenames. The array is sorted in order of file creation, such that names[i] represents the name of a file created before names[i+1] and after names[i-1] (assume 0-based indexing). Because all files must have unique names, files created later with the same name as a file created earlier should have an additional (k) suffix in their names, where k is the smallest positive integer (starting from 1) that does not appear in previous file names.
//
//        Your task is to iterate through all elements of names (from left to right) and update all filenames based on the above. Return an array of proper filenames.
//
//        Example
//
//        For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be solution(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].
//
//        Since names[0] = "doc" and names[1] = "doc", update names[1] = "doc(1)"
//        Since names[1] = "doc(1)" and names[3] = "doc(1)", update names[3] = "doc(1)(1)"
//        Since names[0] = "doc", names[1] = "doc(1)", and names[4] = "doc", update names[4] = "doc(2)"
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.string names
//
//        Guaranteed constraints:
//        5 ≤ names.length ≤ 1000,
//                1 ≤ names[i].length ≤ 15.
//
//                [output] array.string
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
        List<String> input = Arrays.asList(names);
        List<String> result = new ArrayList<>();
        for( String s : names ){
            if(result.contains(s)){
                int i = 1;
                for(; result.contains(s+"("+i+")") ;i++){

                }
                s+="("+i+")";
            }
            result.add(s);
        }
        return result;
    }
}
