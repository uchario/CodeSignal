package chessknight;

public class Main {
    public static void main(String[] args) {
        String cell = "a1";
        System.out.println(chessKnight(cell));
    }

    public static int chessKnight(String cell) {
//        Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.
//
//                The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.
//
//
//
//        Example
//
//        For cell = "a1", the output should be
//        solution(cell) = 2.
//
//
//
//        For cell = "c2", the output should be
//        solution(cell) = 6.
//
//
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string cell
//
//        String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.
//
//        Guaranteed constraints:
//        cell.length = 2,
//                'a' ≤ cell[0] ≤ 'h',
//                1 ≤ cell[1] ≤ 8.
//
//                [output] integer
//
//                [Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
//        String helloWorld(String name) {
//            System.out.println("This prints to the console when you Run Tests");
//            return "Hello, " + name;
//        }
        char lowerAlphaBound = 'a', lowerNumBound = '1', upperAlphaBound = 'h', upperNumBound = '8';
        int count = 0;
        for(int i = -2; i <= 2; i++) {
            for(int j = -2; j <= 2; j++) {
                if(Math.abs(i) == Math.abs(j) || i == 0 || j == 0) {
                    continue;
                } else {
                    if((cell.charAt(0) + i >= lowerAlphaBound && cell.charAt(1) + j >= lowerNumBound) && (cell.charAt(0) + i <= upperAlphaBound && cell.charAt(1) + j <= upperNumBound)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int mehdirizvi(String cell) {
        int moves = 8;
        if (cell.charAt(0) == 'b' || cell.charAt(0) == 'g') {
            moves -= 2;
        }
        if (cell.charAt(1) == '2' || cell.charAt(1) == '7') {
            moves -= 2;
        }
        if (cell.charAt(0) == 'a' || cell.charAt(0) == 'h') {
            moves /= 2;
        }
        if (cell.charAt(1) == '1' || cell.charAt(1) == '8') {
            moves /= 2;
        }
        return moves;
    }
}
