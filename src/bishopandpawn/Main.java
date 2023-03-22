package bishopandpawn;

public class Main {
    public static void main(String[] args) {
        String bishop = "g1";
        String pawn = "f3";
        String bishop1 = "h1";
        String pawn1 = "a8";
        System.out.println(bishopAndPawn(bishop1, pawn1));
    }

    public static boolean bishopAndPawn(String bishop, String pawn) {
//        Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.
//
//        The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move:
//
//
//        Example
//
//        For bishop = "a1" and pawn = "c3", the output should be
//        solution(bishop, pawn) = true.
//
//
//
//                For bishop = "h1" and pawn = "h3", the output should be
//        solution(bishop, pawn) = false.
//
//
//
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string bishop
//
//        Coordinates of the white bishop in the chess notation.
//
//                Guaranteed constraints:
//        bishop.length = 2,
//                'a' ≤ bishop[0] ≤ 'h',
//                1 ≤ bishop[1] ≤ 8.
//
//                [input] string pawn
//
//        Coordinates of the black pawn in the same notation.
//
//                Guaranteed constraints:
//        pawn.length = 2,
//                'a' ≤ pawn[0] ≤ 'h',
//                1 ≤ pawn[1] ≤ 8.
//
//                [output] boolean
//
//        true if the bishop can capture the pawn, false otherwise.
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
        if((Math.abs(bishop.charAt(0)) != Math.abs(pawn.charAt(0))) && (Math.abs(bishop.charAt(1)) != Math.abs(pawn.charAt(1))) && (((bishop.charAt(0) - bishop.charAt(1)) % 2) == ((pawn.charAt(0) - pawn.charAt(1)) % 2))) {
            return true;
        }
        return false;
    }

    public static boolean ben_s24(String bishop, String pawn) {
        return(Math.abs(bishop.charAt(0) - pawn.charAt(0))) == (Math.abs(bishop.charAt(1) - pawn.charAt(1)));
    }
}
