package thecore.lateride;

public class Main {
    public static void main(String[] args) {
        int n = 808;
        System.out.println(lateRide(n));
    }

    public static int lateRide(int n) {
//        One night you go for a ride on your motorcycle. At 00:00 you start your engine, and the built-in timer automatically begins counting the length of your ride, in minutes. Off you go to explore the neighborhood.
//
//                When you finally decide to head back, you realize there's a chance the bridges on your route home are up, leaving you stranded! Unfortunately, you don't have your watch on you and don't know what time it is. All you know thanks to the bike's timer is that n minutes have passed since 00:00.
//
//        Using the bike's timer, calculate the current time. Return an answer as the sum of digits that the digital timer in the format hh:mm would show.
//
//        Example
//
//        For n = 240, the output should be
//        solution(n) = 4.
//
//        Since 240 minutes have passed, the current time is 04:00. The digits sum up to 0 + 4 + 0 + 0 = 4, which is the answer.
//
//                For n = 808, the output should be
//        solution(n) = 14.
//
//        808 minutes mean that it's 13:28 now, so the answer should be 1 + 3 + 2 + 8 = 14.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer n
//
//        The duration of your ride, in minutes. It is guaranteed that you've been riding for less than a day (24 hours).
//
//        Guaranteed constraints:
//        0 ≤ n < 60 · 24.
//
//                [output] integer
//
//        The sum of the digits the digital timer would show.
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

        int sum = 0;
        String intString = String.valueOf(n/60+""+n%60);
        for(int i = 0; i < intString.length(); i++) {
            sum+=Integer.parseInt(String.valueOf(intString.charAt(i)));
        }
        return sum;
    }

    public static int mikeconig(int n) {
        int hours = n/60;
        int minutes = n%60;
        return hours/10 + hours%10 + minutes/10 + minutes%10;
    }
}
