package variablename;

public class Main {
    public static void main(String[] args) {
        System.out.println(variableName("var_1__Int"));
    }

    public static boolean variableName(String name) {
        if (Character.isDigit(name.charAt(0))) {
            return false;
        }
        for(int i = 0; i < name.length(); i++) {
            if(!Character.isDigit(name.charAt(i)) && !Character.isAlphabetic(name.charAt(i)) && name.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }

    public static boolean simonpiano(String name) {
        return name.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }
}
