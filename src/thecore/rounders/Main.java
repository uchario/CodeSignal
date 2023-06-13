package thecore.rounders;

public class Main {
    public static void main(String[] args) {
        System.out.println(rounders(1445));
    }

    public static int rounders(int n) {
//        We want to turn the given integer into a number that has only one non-zero digit
//        using a tail rounding approach. This means that at each step we take the last non
//        0 digit of the number and round it to 0 or to 10. If it's less than 5 we round it
//        to 0 if it's larger than or equal to 5 we round it to 10 (rounding to 10 means increasing
//        the next significant digit by 1). The process stops immediately once there is only one
//        non-zero digit left.
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for(int i = sb.length() - 1; i > 0; i--) {
            if(Character.digit(sb.charAt(i), 10) < 5) {
                sb.replace(i, i + 1, "0");
            } else {
                sb.replace(i, i + 1, "0");
                sb.replace(i - 1, i, String.valueOf(Integer.parseInt(String.valueOf(sb.charAt(i - 1))) + 1));
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static int alephx(int value) {
        int p = 1;
        while(value > 10) {
            p *= 10;
            value = (value/10) + ((value%10<5)?0:1);
        }
        return value*p;
    }
}
