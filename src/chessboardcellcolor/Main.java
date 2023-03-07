package chessboardcellcolor;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String cell1 = "A1";
        String cell2 = "B3";
        System.out.println(chessBoardCellColor(cell1, cell2));
    }

    public static boolean chessBoardCellColor(String cell1, String cell2) {
        String chessAlpha = "ABCDEFGH";
        HashMap<Character, Integer> alphaMap = new HashMap<>();
        for(int i = 0; i < chessAlpha.length(); i++) {
            alphaMap.put(chessAlpha.charAt(i), i + 1);
        }
        boolean cell1Boolean = (((alphaMap.get(cell1.charAt(0)) + Integer.parseInt(Character.toString(cell1.charAt(1)))) % 2) == 0);
        boolean cell2Boolean = (((alphaMap.get(cell2.charAt(0)) + Integer.parseInt(Character.toString(cell2.charAt(1)))) % 2) == 0);
        return  cell1Boolean == cell2Boolean;
    }

    public static boolean viet_tran(String cell1, String cell2) {
        return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;
    }

    public static boolean bandorthild(String cell1, String cell2) {
        return ((int)cell1.charAt(0)+(int)cell1.charAt(1)+(int)cell2.charAt(0)+(int)cell2.charAt(1))%2==0;
    }
}
