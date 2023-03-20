package differentsymbolsnaive;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "aabbccdd";
        System.out.println(differentSymbolsNaive(s));
    }

    public static int differentSymbolsNaive(String s) {
        Set<Character> alpha = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            alpha.add(s.charAt(i));
        }
        return alpha.size();
    }

    public static int ben_w6(String s) {
        return (int) s.chars().distinct().count();
    }
}
