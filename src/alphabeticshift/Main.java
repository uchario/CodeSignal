package alphabeticshift;

public class Main {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(alphabeticShift(input));
    }

    public static String alphabeticShift(String inputString) {

//        Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).
//
//                Example
//
//        For inputString = "crazy", the output should be solution(inputString) = "dsbaz".
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string inputString
//
//        A non-empty string consisting of lowercase English characters.
//
//        Guaranteed constraints:
//        1 ≤ inputString.length ≤ 1000.
//
//                [output] string
//
//        The resulting string after replacing each of its characters.
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

        StringBuilder inputB = new StringBuilder(inputString);
        for(int i = 0; i < inputB.length(); i++) {
            if(inputB.charAt(i) == 'z') {
                inputB.replace(i, i + 1, "a");
            } else {
                inputB.replace(i, i + 1, Character.toString(Character.codePointAt(inputB, i) + 1));
            }
        }
        return inputB.toString();
    }

    public static String ben_w6(String inputString) {
        return new String(inputString.chars().map(x -> (x - 'a' + 1) % 26 + 'a').toArray(), 0, inputString.length());
    }
}
