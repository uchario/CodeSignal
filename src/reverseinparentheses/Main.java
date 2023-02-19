package reverseinparentheses;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseInParentheses("foo(bar(baz))blim"));
    }

    public static String reverseInParentheses(String inputString) {
//        Write a function that reverses characters in (possibly nested) parentheses in the input string.
//
//                Input strings will always be well-formed with matching ()s.
//
//                Example
//
//        For inputString = "(bar)", the output should be
//        solution(inputString) = "rab";
//        For inputString = "foo(bar)baz", the output should be
//        solution(inputString) = "foorabbaz";
//        For inputString = "foo(bar)baz(blim)", the output should be
//        solution(inputString) = "foorabbazmilb";
//        For inputString = "foo(bar(baz))blim", the output should be
//        solution(inputString) = "foobazrabblim".
//                Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
//                Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [input] string inputString
//
//        A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in inputString form a regular bracket sequence.
//
//        Guaranteed constraints:
//        0 ≤ inputString.length ≤ 50.
//
//                [output] string
//
//        Return inputString, with all the characters that were in parentheses reversed.
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
        StringBuilder st = new StringBuilder(inputString);
        int count = 0;
        for(int i = 0; i < st.length(); i++) {
            if(st.charAt(i) == '(') {
                count++;
            }
        }
        System.out.println(count);
        for(int i = 0; i < count; i ++) {
            int lastOpenParenthesis = st.lastIndexOf("(");
            int firstCloseParenthesis = st.indexOf(")");
            StringBuilder reverseString = new StringBuilder(
                    st.substring(lastOpenParenthesis + 1, firstCloseParenthesis)).reverse();
            st.replace(lastOpenParenthesis + 1, firstCloseParenthesis, String.valueOf(reverseString));
            st.deleteCharAt(firstCloseParenthesis);
            st.deleteCharAt(lastOpenParenthesis);
        }
        return st.toString();
    }

    public static String pda16(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
    }
}
