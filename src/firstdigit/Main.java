package firstdigit;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstDigit("var_1__Int"));
    }

    public static char firstDigit(String inputString) {
//        Find the leftmost digit that occurs in a given string.
//
//        Example
//
//        For inputString = "var_1__Int", the output should be
//        solution(inputString) = '1';
//        For inputString = "q2q-q", the output should be
//        solution(inputString) = '2';
//        For inputString = "0ss", the output should be
//        solution(inputString) = '0'.
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string inputString
//
//        A string containing at least one digit.
//
//                Guaranteed constraints:
//        3 ≤ inputString.length ≤ 10.
//
//                [output] char
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

        char output = 'a';
        for(int i = 0; i < inputString.length(); i++) {
            if(Character.isDigit(inputString.charAt(i))) {
                return inputString.charAt(i);
            }
        }
        return output;
    }

    public static char fal_rnd(String inputString) {
        return inputString.replaceAll("[^0-9]","").charAt(0);
    }
}
