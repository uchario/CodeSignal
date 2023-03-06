package evenDigitsOnly;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean evenDigitsOnly(int n) {
        Integer a = Integer.valueOf(n);
        String[] aString = a.toString().split("");
        boolean isEven = true;
        for(String i : aString) {
            if(Integer.parseInt(i) % 2 != 0) {
                isEven = false;
                break;
            }
        }
        return isEven;
    }

    public static boolean long_duong_k(int n) {
        if (n == 0) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return long_duong_k(n / 10);
    }

}
