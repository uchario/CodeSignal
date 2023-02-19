package areequallystrong;

public class Main {
    public static void main(String[] args) {
       int yourLeft = 10,
        yourRight = 15,
        friendsLeft = 15,
        friendsRight = 10;
       System.out.println(areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight));
    }

    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
//        Call two arms equally strong if the heaviest weights they each are able to lift are equal.
//
//                Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.
//
//        Given your and your friend's arms' lifting capabilities find out if you two are equally strong.
//
//                Example
//
//        For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10, the output should be
//        solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
//        For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 10, the output should be
//        solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
//        For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 9, the output should be
//        solution(yourLeft, yourRight, friendsLeft, friendsRight) = false.
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] integer yourLeft
//
//        A non-negative integer representing the heaviest weight you can lift with your left arm.
//
//        Guaranteed constraints:
//        0 ≤ yourLeft ≤ 20.
//
//                [input] integer yourRight
//
//        A non-negative integer representing the heaviest weight you can lift with your right arm.
//
//        Guaranteed constraints:
//        0 ≤ yourRight ≤ 20.
//
//                [input] integer friendsLeft
//
//        A non-negative integer representing the heaviest weight your friend can lift with his or her left arm.
//
//                Guaranteed constraints:
//        0 ≤ friendsLeft ≤ 20.
//
//                [input] integer friendsRight
//
//        A non-negative integer representing the heaviest weight your friend can lift with his or her right arm.
//
//                Guaranteed constraints:
//        0 ≤ friendsRight ≤ 20.
//
//                [output] boolean
//
//        true if you and your friend are equally strong, false otherwise.
//
//[Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
//        `String helloWorld(String name) {
//            System.out.println("This prints to the console when you Run Tests");
//            return "Hello, " + name;
//        }`
        int yourStrongestArm = Math.max(yourLeft, yourRight);
        int yourWeakestArm = Math.min(yourLeft, yourRight);
        int friendsStrongestArm = Math.max(friendsLeft, friendsRight);
        int friendsWeakestArm = Math.min(friendsLeft, friendsRight);
        if(yourStrongestArm == friendsStrongestArm && yourWeakestArm == friendsWeakestArm) {
            return true;
        }
        return false;
    }

    public static boolean jocke93(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return yourLeft==friendsLeft && yourRight==friendsRight || yourLeft==friendsRight && yourRight== friendsLeft;
    }
}
