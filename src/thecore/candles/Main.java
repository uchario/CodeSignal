package thecore.candles;

public class Main {
    public static void main(String[] args) {
        System.out.println(candles(5, 2));
    }

    public static int candles(int candlesNumber, int makeNew) {
//        When a candle finishes burning it leaves a leftover. makeNew leftovers can be combined
//        to make a new candle, which, when burning down, will in turn leave another leftover.You
//        have candlesNumber candles in your possession. What's the total number of candles you can
//        burn, assuming that you create new candles as soon as you have enough leftovers?
        return candlesNumber + (candlesNumber-1)/(makeNew-1);
    }
}
