package thecore.phonecall;

public class Main {
    public static void main(String[] args) {
        int min1 = 3, min2_10 = 1, min11 = 2, s = 20;
        System.out.println(phoneCall(min1, min2_10, min11, s));
    }

    public static int phoneCall(int min1, int min2_10, int min11, int s) {
        int t1=min1+ min2_10*9;
        if (s>=t1){
            return 10+(s-t1)/min11;
        }
        if (s>=min1){
            return (s-min1)/min2_10+1;
        }
        return 0;
    }
}
