package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnW = ChessPiece.PAWN_WHITE;
        ChessPiece rookB = ChessPiece.ROOK_BLACK;

        List<String> chessList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            chessList.add(pawnW.getSign());
        }

        for (int i = 0; i < 4; i++) {
            chessList.add(rookB.getSign());
        }

        StringBuilder builder = new StringBuilder();
        for (String value : chessList) {
            builder.append(value + " ");
        }
        String text = builder.toString();
        System.out.print(text);
    }
}