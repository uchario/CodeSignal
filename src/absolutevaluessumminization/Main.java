package absolutevaluessumminization;

public class Main {
    public static void main(String[] args) {
        int[] a ={2,4,7};
        System.out.println(absoluteValuesSumMinimization(a));
    }

    public static int absoluteValuesSumMinimization(int[] a) {
        int[] min = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                min[i] += Math.abs(a[j] -a[i]);
            }
        }
        int count = 0;
        for(int i = 1; i < min.length; i++) {
            if(min[i] < min[count]) {
                count = i;
            }
        }
        return a[count];
    }

    public static int thucnguyen(int[] A) {
        return A[(A.length-1)/2];
    }
}
