package isdigit;

public class Main {
    public static void main(String[] args) {
        char symbol = '0';
        System.out.println(isDigit(symbol));
    }

    public static boolean isDigit(char symbol) {
//        Determine if the given character is a digit or not.
//
//        Example
//
//        For symbol = '0', the output should be
//        solution(symbol) = true;
//        For symbol = '-', the output should be
//        solution(symbol) = false.
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] char symbol
//
//        A character which is either a digit or not.
//
//                Guaranteed constraints:
//        Given symbol is from ASCII table.
//
//[output] boolean
//
//        true if symbol is a digit, false otherwise.
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

        return Character.isDigit(symbol);
    }
}
