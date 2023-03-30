package validtime;

public class Main {
    public static void main(String[] args) {
        String time = "24:00";
        System.out.println(validTime(time));
    }

    public static boolean validTime(String time) {
//        Check if the given string is a correct time representation of the 24-hour clock.
//
//                Example
//
//        For time = "13:58", the output should be
//        solution(time) = true;
//        For time = "25:51", the output should be
//        solution(time) = false;
//        For time = "02:76", the output should be
//        solution(time) = false.
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string time
//
//        A string representing time in HH:MM format. It is guaranteed that the first two characters, as well as the last two characters, are digits.
//
//[output] boolean
//
//        true if the given representation is correct, false otherwise.
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
        return Integer.parseInt(time.substring(0, 2)) < 24 && Integer.parseInt(time.substring(3)) <= 59;
    }
}
