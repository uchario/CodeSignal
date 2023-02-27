package isipv4address;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean output = isIpv4Address("1.1.1.1a");
        System.out.println(output);
//        System.out.println("uche".endsWith("he"));
    }

    public static boolean isIpv4Address(String inputString) {
        String[] ipString = inputString.split("[.]");
        if(ipString.length != 4) {
            return false;
        }
        try {
            for(String i : ipString) {
                if(i.isEmpty() || (i.length() > 1 && i.charAt(0) == '0') || Integer.parseInt(i) > 255) {
                    return false;
                }
            }
        } catch (NumberFormatException e) {
            return false;
        }
        System.out.println(Arrays.toString(ipString));
        return true;
    }

    public static boolean brian_e11(String inputString) {
        String[] splitString = inputString.split("[.]");
        if (splitString.length > 4) {
            return false;
        }
        for (String string : splitString) {
            if (string.isEmpty()) {
                return false;
            }
            if (!string.matches("[0-9]{1,3}")) {
                return false;
            }
            int number = Integer.parseInt(string);
            if (!(number >= 0 && number <= 255)) {
                return false;
            }
        }
        return true;
    }

    public static boolean pixelStorm(String inputString) {
        return inputString.matches("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    }
}
