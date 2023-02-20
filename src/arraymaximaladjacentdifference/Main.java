package arraymaximaladjacentdifference;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {2, 4, 1, 0};
        System.out.println(arrayMaximalAdjacentDifference(inputArray));
    }

    public static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maxDiff = 0;
        for(int i = 0; i < inputArray.length - 1; i++) {
            if(Math.abs(inputArray[i] - inputArray[i + 1]) > maxDiff) {
                maxDiff = Math.abs(inputArray[i] - inputArray[i + 1]);
            }
        }
        return maxDiff;
    }

    public static int pixelStorm(int[] inputArray) {
        int max=0;
        for( int i = 1 ; i < inputArray.length ; i++ ){
            max = Math.max(max,Math.abs(inputArray[i] - inputArray[i-1]));
        }
        return max;
    }
}
