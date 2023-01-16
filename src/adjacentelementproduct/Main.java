package adjacentelementproduct;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(adjacentElementsProducts(inputArray));
    }

    public static int adjacentElementsProducts(int[] inputArray) {
        int[] result = new int[inputArray.length - 1];
        for(int i = 0; i < inputArray.length - 1; i++) {
            result[i] = inputArray[i] * inputArray[i + 1];
        }
        int greatest = result[0];
        for(int j = 1; j < result.length; j++) {
            if(result[j] > greatest) {
                greatest = result[j];
            }
        }
        return greatest;
    }
}
