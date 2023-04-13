package thecore.reachnextlevel;

public class Main {
    public static void main(String[] args) {
        int experience = 10, threshold = 15, reward = 4;
        System.out.println(reachNextLevel(experience, threshold, reward));
    }

    public static boolean reachNextLevel(int experience, int threshold, int reward) {
//        You are playing an RPG game. Currently your experience points (XP) total is equal to experience. To reach the next level your XP should be at least at threshold. If you kill the monster in front of you, you will gain more experience points in the amount of the reward.
//
//                Given values experience, threshold and reward, check if you reach the next level after killing the monster.
//
//                Example
//
//        For experience = 10, threshold = 15, and reward = 5, the output should be
//        solution(experience, threshold, reward) = true;
//        For experience = 10, threshold = 15, and reward = 4, the output should be
//        solution(experience, threshold, reward) = false.
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer experience
//
//        Guaranteed constraints:
//        3 ≤ experience ≤ 250.
//
//                [input] integer threshold
//
//        Guaranteed constraints:
//        5 ≤ threshold ≤ 300.
//
//                [input] integer reward
//
//        Guaranteed constraints:
//        2 ≤ reward ≤ 65.
//
//                [output] boolean
//
//        true if you reach the next level, false otherwise.
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
        return experience + reward >= threshold;
    }
}
