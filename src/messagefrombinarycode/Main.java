package messagefrombinarycode;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String inputString = "01001101011000010111100100100000011101000110100001100101001000000100011001101111011100100110001101100101001000000110001001100101001000000111011101101001011101000110100000100000011110010110111101110101";
        System.out.println(messageFromBinaryCode(inputString));
    }

    public static String messageFromBinaryCode(String code) {
//        You are taking part in an Escape Room challenge designed specifically for programmers. In your efforts to find a clue, you've found a binary code written on the wall behind a vase, and realized that it must be an encrypted message. After some thought, your first guess is that each consecutive 8 bits of the code stand for the character with the corresponding extended ASCII code.
//
//        Assuming that your hunch is correct, decode the message.
//
//        Example
//
//        For code = "010010000110010101101100011011000110111100100001", the output should be
//        solution(code) = "Hello!".
//
//                The first 8 characters of the code are 01001000, which is 72 in the binary numeral system. 72 stands for H in the ASCII-table, so the first letter is H.
//                Other letters can be obtained in the same manner.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string code
//
//        A string, the encrypted message consisting of characters '0' and '1'.
//
//                Guaranteed constraints:
//        0 < code.length < 800.
//
//                [output] string
//
//        The decrypted message.
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
        String s2 = "";
        char nextChar;
        for(int i = 0; i < code.length(); i+=8) {
            nextChar = (char)Integer.parseInt(code.substring(i, i + 8), 2);
            s2+= nextChar;
        }
        return s2;
    }

    public String helfper(String code) {
        return new String(new BigInteger(code, 2).toByteArray());
    }
}
