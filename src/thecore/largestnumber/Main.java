package thecore.largestnumber;

public class Main {
    public static void main(String[] args) {
       int n = 2;
       System.out.println(largestNumber(n));
    }

    public static int largestNumber(int n) {
        String newString = "";
        for(int i = 0; i < n; i++) {
            newString += "9";
        }
        return Integer.parseInt(newString);
    }

    public static int mikeconig(int n) {
        return (int)Math.pow(10,n) - 1;
    }
}
