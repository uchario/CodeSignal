package islucky;

public class Main {
    public static void main(String[] args) {
//        Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
//
//        Given a ticket number n, determine if it's lucky or not.
//
//        Example
//
//        For n = 1230, the output should be
//        solution(n) = true;
//        For n = 239017, the output should be
//        solution(n) = false.
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        A ticket number represented as a positive integer with an even number of digits.
//
//        Guaranteed constraints:
//        10 ≤ n < 106.
//
//                [output] boolean
//
//        true if n is a lucky ticket number, false otherwise.
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
//
    System.out.println(isLucky(239017));

 }

 public static boolean isLucky(int n) {
     String newNumber = n + "";
     int numberSize = newNumber.length();
     int firstHalf = 0;
     int secondHalf = 0;
     for(int i = 0; i < numberSize/2; i++) {
         firstHalf += newNumber.charAt(i);
     }
     for(int i = numberSize/2; i < numberSize; i++) {
         secondHalf += newNumber.charAt(i);
     }
     if(firstHalf == secondHalf) {
         return true;
     }
     return false;
 }

 public static boolean jocke93(int n) {
     String s = n+"";
     int sum = 0;

     for(int i=0; i<s.length()/2; i++)
         sum+=(s.charAt(i)-s.charAt(s.length()-1-i));

     return sum==0;
 }

}
