package thecore.willyou;

public class Main {
    public static void main(String[] args) {
        boolean young = true, beautiful = true, loved = true;
        System.out.println(willYou(young, beautiful, loved));
    }

    public static boolean willYou(boolean young, boolean beautiful, boolean loved) {
//        Once Mary heard a famous song, and a line from it stuck in her head. That line was "Will you still love me when I'm no longer young and beautiful?". Mary believes that a person is loved if and only if he/she is both young and beautiful, but this is quite a depressing thought, so she wants to put her belief to the test.
//
//                Knowing whether a person is young, beautiful and loved, find out if they contradict Mary's belief.
//
//        A person contradicts Mary's belief if one of the following statements is true:
//
//        they are young and beautiful but not loved;
//        they are loved but not young or not beautiful.
//                Example
//
//        For young = true, beautiful = true, and loved = true, the output should be
//        solution(young, beautiful, loved) = false.
//
//                Young and beautiful people are loved according to Mary's belief.
//
//        For young = true, beautiful = false, and loved = true, the output should be
//        solution(young, beautiful, loved) = true.
//
//                Mary doesn't believe that not beautiful people can be loved.
//
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] boolean young
//
//[input] boolean beautiful
//
//[input] boolean loved
//
//[output] boolean
//
//        true if the person contradicts Mary's belief, false otherwise.
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
        return (young && beautiful && !loved) || (loved && !young && !beautiful) || (young && loved && !beautiful) || (beautiful && young && !loved) || (beautiful && loved && !young);
    }
}
