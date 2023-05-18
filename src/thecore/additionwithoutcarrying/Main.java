package thecore.additionwithoutcarrying;

public class Main {
    public static void main(String[] args) {
        int param1 = 456, param2 = 1734;
        System.out.println(additionWithoutCarrying(param1, param2));
    }

    public static int additionWithoutCarrying(int param1, int param2) {
//        A little child is studying arithmetic. They have just learned how to add two integers, written one below another, column by column. But the child always forgets about the important part - carrying.
//
//                Given two integers, your task is to find the result that the child will get.
//
//                Note: The child had learned from this site, so feel free to check it out too if you are not familiar with column addition.
//
//                Example
//
//        For param1 = 456 and param2 = 1734, the output should be
//        solution(param1, param2) = 1180.
//
//        456
//        1734
//                + ____
//        1180
//        The child performs the following operations from right to left:
//
//        6 + 4 = 10 but the child forgets about carrying the 1 and just writes down the 0 in the last column
//        5 + 3 = 8
//        4 + 7 = 11 but the child forgets about the leading 1 and just writes down 1 under 4 and 7.
//        There is no digit in the first number corresponding to the leading digit of the second one, so the child imagines that 0 is written before 456. Thus, they get 0 + 1 = 1.
//        Input/Output
//
//                [execution time limit] 3 seconds (java)
//
//                [memory limit] 1 GB
//
//                [input] integer param1
//
//        A non-negative integer.
//
//                Guaranteed constraints:
//        0 ≤ param1 < 105.
//
//                [input] integer param2
//
//        A non-negative integer.
//
//                Guaranteed constraints:
//        0 ≤ param2 < 6 · 104.
//
//                [output] integer
//
//        The result that the little child will get by using column addition without carrying.
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
        if (param1 == 0 || param2 == 0) {
            return param1+param2;
        }
        return additionWithoutCarrying(param1/10,param2/10)*10 + (param1+param2)%10;
    }

    public static int cthaeghya(int param1, int param2) {
        int t = 0;
        int mult = 1;
        while (param1 + param2 > 0) {
            int value = (param1 +param2)%10;
            t += value * mult;
            mult *= 10;
            param1 /= 10;
            param2 /= 10;
        }
        return t;
    }
}
