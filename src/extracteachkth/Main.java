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
