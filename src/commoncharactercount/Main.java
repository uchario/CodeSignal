package commoncharactercount;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
//        System.out.println(commonCharacterCount(s1, s2));
        System.out.println(lilit_petrosyan(s1, s2));
    }

    public static int commonCharacterCount(String s1, String s2) {
        ArrayList<String> s1List = new ArrayList<>();
        ArrayList<String> s2List = new ArrayList<>();
        String[] s1Array = s1.split("");
        String[] s2Array = s2.split("");
        int count = 0;

        for(String i : s1Array) {
            s1List.add(i);
        }

        for(String i : s2Array) {
            s2List.add(i);
        }

        for(int i = 0; i < s1List.size(); i++) {
            for(int j = 0; j < s2List.size(); j++) {
                if(s1List.get(i).equals(s2List.get(j))) {
                    s1List.remove(i);
                    s2List.remove(j);
                    count++;
                    i--;
                    break;
                }
            }
        }
        return count;
    }

    public static int lilit_petrosyan(String s1, String s2) {
        int counter = 0;
        for(int i = 0; i < s1.length(); ++i){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                counter++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return counter;
    }
}
