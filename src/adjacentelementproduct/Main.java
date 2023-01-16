package adjacentelementproduct;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(adjacentElementsProducts(inputArray));
    }

    public static int adjacentElementsProducts(int[] inputArray) {
//        Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
//
//                Example
//
//        For inputArray = [3, 6, -2, -5, 7, 3], the output should be
//        solution(inputArray) = 21.
//
//        7 and 3 produce the largest product.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.integer inputArray
//
//        An array of integers containing at least two elements.
//
//                Guaranteed constraints:
//        2 ≤ inputArray.length ≤ 10,
//                -1000 ≤ inputArray[i] ≤ 1000.
//
//                [output] integer
//
//        The largest product of adjacent elements.
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
