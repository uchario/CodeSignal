package depositprofit;

public class Main {
    public static void main(String[] args) {
        int deposit = 100, rate = 20, threshold = 170;
        System.out.println(depositProfit(deposit, rate, threshold));
    }

    public static int depositProfit(int deposit, int rate, int threshold) {
        return (int)Math.ceil(Math.log((double)threshold / deposit) / Math.log(1 + (rate / 100.0)));
    }
}
