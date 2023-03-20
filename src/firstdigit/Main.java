package firstdigit;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstDigit("var_1__Int"));
    }

    public static char firstDigit(String inputString) {
        char output = 'a';
        for(int i = 0; i < inputString.length(); i++) {
            if(Character.isDigit(inputString.charAt(i))) {
                return inputString.charAt(i);
            }
        }
        return output;
    }

    public static char fal_rnd(String inputString) {
        return inputString.replaceAll("[^0-9]","").charAt(0);
    }
}
