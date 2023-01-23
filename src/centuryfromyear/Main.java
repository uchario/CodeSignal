package centuryfromyear;

public class Main {
    public static void main(String[] args) {
        System.out.println(centuryFromYear(2019));
    }

    public static int centuryFromYear(int year) {
//        Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.
//
//                Example
//
//        For year = 1905, the output should be
//        solution(year) = 20;
//        For year = 1700, the output should be
//        solution(year) = 17.
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer year
//
//        A positive integer, designating the year.
//
//        Guaranteed constraints:
//        1 ≤ year ≤ 2005.
//
//                [output] integer
//
//        The number of the century the year is in.
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
        if(year % 100 != 0) {
            return (year/100) + 1;
        }
        return year/100;
    }

    public static int yuvalScharfSolution(int year) {
        return 1 + (year - 1) / 100;
    }
}
