package thecore.knapsacklight;

public class Main {
    public static void main(String[] args) {
        int value1 = 10, weight1 = 5, value2 = 6, weight2 = 4, maxW = 8;
        System.out.println(knapsackLight(value1, weight1, value2, weight2, maxW));
    }

    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        boolean weightBoolean = (weight1 + weight2) <= maxW;
        if(weight1 > maxW && weight2 > maxW) {
            return 0;
        }
        if(weightBoolean) {
            return value1 + value2;
        }
        if(value1 > value2 && weight1 > maxW) {
            return value2;
        }
        if(value2 > value1 && weight2 > maxW) {
            return value1;
        }
        if(!weightBoolean && value1 > value2) {
            return value1;
        }
        return value2;
    }

    public static int sujil_m(int value1, int weight1, int value2, int weight2, int maxW) {
        int val = 0;

        if (weight1 + weight2 <= maxW) return value1 + value2;

        if (weight1 <= maxW) {val = value1;}

        if (weight2 <= maxW && value2 > val) val = value2;

        return val;
    }
}
