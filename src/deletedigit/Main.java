package deletedigit;

public class Main {
    public static void main(String[] args) {
        int n = 1001;
        System.out.println(deleteDigit(n));
    }

    public static int deleteDigit(int n) {
        int maxNum = 0;
        StringBuilder sb = new StringBuilder(String.valueOf(n)), copyStrVal = new StringBuilder(sb);
        for (int i = 0; i < sb.length(); i++) {
            int strToInt = Integer.parseInt(copyStrVal.deleteCharAt(i).toString());
            if(strToInt > maxNum) {
                maxNum = strToInt;
            }
            copyStrVal = new StringBuilder(sb);
        }
        return maxNum;
    }

    public static int ben_w6(int n) {
        int max = 0;
        for (int t = 1; t < n; t *= 10)
            max = Math.max(n / 10 / t * t + n % t, max);
        return max;
    }
}
