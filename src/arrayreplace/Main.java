package arrayreplace;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 1};
        int elemToReplace = 1;
        int substitutionElem = 3;
        System.out.println(Arrays.toString(arrayReplace(input, elemToReplace, substitutionElem)));
    }

    public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }

    public static int[] dariusz_k1(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray)
                .map(o -> o == elemToReplace ? substitutionElem : o)
                .toArray();
    }
}
