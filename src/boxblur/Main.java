package boxblur;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] intArray = {{1,1,1},{1,7,1},{1,1,1}};
        int[][] intArray2 = {{7,4,0,1}, {5,6,2,2}, {6,10,7,8}, {1,4,2,0}};
        int[][] intArray3 = {{36,0,18,9}, {27,54,9,0}, {81,63,72,45}};
        System.out.println(Arrays.deepToString(boxBlur(intArray3)));
    }

    public static int[][] boxBlur(int[][] image) {
//        Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
//
//        The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.
//
//                Return the blurred image as an integer, with the fractions rounded down.
//
//        Example
//
//                For
//
//        image = [[1, 1, 1],
//         [1, 7, 1],
//         [1, 1, 1]]
//        the output should be solution(image) = [[1]].
//
//        To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1. The border pixels are cropped from the final result.
//
//                For
//
//        image = [[7, 4, 0, 1],
//         [5, 6, 2, 2],
//         [6, 10, 7, 8],
//         [1, 4, 2, 0]]
//        the output should be
//
//        solution(image) = [[5, 4],
//                   [4, 4]]
//        There are four 3 × 3 squares in the input image, so there should be four integers in the blurred output. To get the first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5. The other three integers are obtained the same way, then the surrounding integers are cropped from the final result.
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] array.array.integer image
//
//        An image, stored as a rectangular matrix of non-negative integers.
//
//                Guaranteed constraints:
//        3 ≤ image.length ≤ 100,
//                3 ≤ image[0].length ≤ 100,
//                0 ≤ image[i][j] ≤ 255.
//
//                [output] array.array.integer
//
//        A blurred image represented as integers, obtained through the process in the description.
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

        int[][] blurArray = new int[image.length - 2][image[0].length - 2];
        for(int i = 3; i <= image[0].length; i++) {
            for(int j = 3; j <= image.length; j++) {
                blurArray[j - 3][i - 3] = (image[j - 3][i - 3] + image[j - 3][i - 2] + image[j - 3][i - 1] + image[j - 2][i - 3] + image[j - 2][i - 2] + image[j - 2][i - 1] + image[j - 1][i - 3] + image[j - 1][i - 2] + image[j - 1][i - 1]) / 9;
            }
        }
        return blurArray;
    }
}
