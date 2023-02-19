package sortbyheight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] sortByHeight(int[] a) {

//        Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!
//
//                Example
//
//        For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
//        solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.integer a
//
//        If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.
//
//                Guaranteed constraints:
//        1 ≤ a.length ≤ 1000,
//                -1 ≤ a[i] ≤ 1000.
//
//                [output] array.integer
//
//        Sorted array a with all the trees untouched.
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
        for(int i = 0; i < a.length; i++) {
            if(a[i] > 0) {
                arrayList.add(a[i]);
            }
        }
        var newArray = arrayList.toArray();
        Arrays.sort(newArray);
        int j = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > 0) {
                a[i]= (int)newArray[j];
                j++;
            }
        }
        return a;
    }

    public static int[] mehdirizvi(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : a) {
            if (i != -1) {
                list.add(i);
            }
        }

        Collections.sort(list);

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = list.get(index++);
            }
        }

        return a;
    }

    public static int[] jocke93(int[] a) {
        int t;

        for(int i=0; i<a.length; i++)
            for(int j=i+1; j<a.length; j++)
                if(a[i]>a[j] && a[i]!=-1 && a[j]!=-1) {

                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }

        return a;
    }
}