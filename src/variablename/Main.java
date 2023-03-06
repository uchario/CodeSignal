package variablename;

public class Main {
    public static void main(String[] args) {
        System.out.println(variableName("var_1__Int"));
    }

    public static boolean variableName(String name) {

//        orrect variable names consist only of English letters, digits and underscores and they can't start with a digit.
//
//        Check if the given string is a correct variable name.
//
//        Example
//
//        For name = "var_1__Int", the output should be
//        solution(name) = true;
//        For name = "qq-q", the output should be
//        solution(name) = false;
//        For name = "2w2", the output should be
//        solution(name) = false.
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string name
//
//        Guaranteed constraints:
//        1 ≤ name.length ≤ 10.
//
//                [output] boolean
//
//        true if name is a correct variable name, false otherwise.
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

        if (Character.isDigit(name.charAt(0))) {
            return false;
        }
        for(int i = 0; i < name.length(); i++) {
            if(!Character.isDigit(name.charAt(i)) && !Character.isAlphabetic(name.charAt(i)) && name.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }

    public static boolean simonpiano(String name) {
        return name.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }
}
