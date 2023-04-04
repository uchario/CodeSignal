package digitsproduct;

public class Main {
    public static void main(String[] args) {
        System.out.println(digitsProduct(12));
    }

    public static int digitsProduct(int product) {
//        Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.
//
//                Example
//
//        For product = 12, the output should be
//        solution(product) = 26;
//        For product = 19, the output should be
//        solution(product) = -1.
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer product
//
//        Guaranteed constraints:
//        0 ≤ product ≤ 600.
//
//                [output] integer
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
        if (product == 0)
            return 10;
        if (product < 10)
            return product;

        String r = "";
        for (int d = 9; d > 1; d--)
            for (; product % d == 0; product /= d)
                r = d + r;
        return product == 1 ? new Integer(r) : -1;
    }
}
