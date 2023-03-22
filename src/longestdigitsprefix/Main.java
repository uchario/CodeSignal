package longestdigitsprefix;

public class Main {
    public static void main(String[] args) {
        String inputString = "123aa1";
        System.out.println(longestDigitsPrefix(inputString));
    }

    public static String longestDigitsPrefix(String inputString) {
//        Given a string, output its longest prefix which contains only digits.
//
//                Example
//
//        For inputString = "123aa1", the output should be
//        solution(inputString) = "123".
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string inputString
//
//        Guaranteed constraints:
//        3 ≤ inputString.length ≤ 100.
//
//                [output] string
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

        String outputString = "";
        for(int i = 0; i < inputString.length(); i++) {
            if(Character.isDigit(inputString.charAt(i))) {
                outputString = outputString + inputString.charAt(i);
            } else {
                break;
            }
        }
        return outputString;
    }

    public static String pixelstorm(String inputString) {
        return inputString.replaceAll("^(\\d*).*","$1");
    }
}
