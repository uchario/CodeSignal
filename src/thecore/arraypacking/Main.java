package thecore.arraypacking;

public class Main {
    public static void main(String[] args) {
        int[] a = {24, 85, 0};
        System.out.println(arrayPacking(a));
    }

    public static int arrayPacking(int[] a) {
        String[] c = new String[a.length];
        for(int i = 0; i < a.length; i++) {
            int dec=a[i];
            String result= "00000000";
            int j=result.length()-1;
            while(dec!=0)
            {
                char b[]=result.toCharArray();
                b[j--]= String.valueOf(dec%2).charAt(0);
                result=new String(b);
                dec=dec/2;

            }
            c[i] = result;
        }
        String binaryNumber = "";
        for(int i = c.length - 1; i >= 0; i--) {
            binaryNumber += c[i];
        }
        return Integer.parseInt(binaryNumber, 2);
    }

    public static int Doaa_S(int[] a) {
        int n = 0;
        for(int i = a.length-1; i >= 0; i--) {
            n <<= 8;
            n += a[i];
        }
        return n;
    }
}
