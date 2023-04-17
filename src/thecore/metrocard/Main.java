package thecore.metrocard;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int lastNumberOfDays = 31;
        System.out.println(metroCard(lastNumberOfDays));
    }

    public static int[] metroCard(int lastNumberOfDays) {
//        You just bought a public transit card that allows you to ride the Metro for a certain number of days.
//
//                Here is how it works: upon first receiving the card, the system allocates you a 31-day pass, which equals the number of days in January. The second time you pay for the card, your pass is extended by 28 days, i.e. the number of days in February (note that leap years are not considered), and so on. The 13th time you extend the pass, you get 31 days again.
//
//        You just ran out of days on the card, and unfortunately you've forgotten how many times your pass has been extended so far. However, you do remember the number of days you were able to ride the Metro during this most recent month. Figure out the number of days by which your pass will now be extended, and return all the options as an array sorted in increasing order.
//
//        Example
//
//        For lastNumberOfDays = 30, the output should be
//        solution(lastNumberOfDays) = [31].
//
//        There are 30 days in April, June, September and November, so the next months to consider are May, July, October or December. All of them have exactly 31 days, which means that you will definitely get a 31-days pass the next time you extend your card.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer lastNumberOfDays
//
//        A positive integer, the number of days for which the card was extended the last time.
//
//        Guaranteed constraints:
//        lastNumberOfDays = 28 or lastNumberOfDays = 30 or lastNumberOfDays = 31.
//
//                [output] array.integer
//
//        An array of positive integers, the possible number of days for which you will extend your pass. The elements of the array can only be equal to 28, 30 or 31 and must be sorted in increasing order.
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
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        ArrayList<Integer> priorMonthDays = new ArrayList<>();
        for(int i = 0; i < daysInMonth.length; i++) {
            if(daysInMonth[i] == lastNumberOfDays && i == 11) {
                priorMonthDays.add(31);
            } else if(daysInMonth[i] == lastNumberOfDays) {
                priorMonthDays.add(daysInMonth[i + 1]);
            }
        }
        Collections.sort(priorMonthDays);
        return priorMonthDays.stream().mapToInt(i -> i).distinct().toArray();
    }

    public static int[] mssk(int lastNumberOfDays) {
        if(lastNumberOfDays== 31)
            return new int[]{28,30,31};
        return new int[]{31};
    }
}
