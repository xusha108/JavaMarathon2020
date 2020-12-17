package day17;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        ChessBoard board = new ChessBoard(array);

        ChessPiece pawnW = ChessPiece.PAWN_WHITE;
        ChessPiece pawnB = ChessPiece.PAWN_BLACK;

        ChessPiece rookB = ChessPiece.ROOK_BLACK;
        ChessPiece rookW = ChessPiece.ROOK_WHITE;
        ChessPiece knightB = ChessPiece.KNIGHT_BLACK;
        ChessPiece kingB = ChessPiece.KING_BLACK;
        ChessPiece queenB = ChessPiece.QUEEN_BLACK;
        ChessPiece bishopW = ChessPiece.BISHOP_WHITE;
        ChessPiece bishopB = ChessPiece.BISHOP_BLACK;
        ChessPiece queenW = ChessPiece.QUEEN_WHITE;
        ChessPiece kingW = ChessPiece.KING_WHITE;
        ChessPiece empty = ChessPiece.EMPTY;


        array[0][0] = rookB.getSign();
        array[0][5] = rookB.getSign();
        array[0][6] = kingB.getSign();

        array[1][1] = rookW.getSign();
        array[1][4] = pawnB.getSign();
        array[1][5] = pawnB.getSign();
        array[1][7] = pawnB.getSign();

        array[2][0] = pawnB.getSign();
        array[2][2] = knightB.getSign();
        array[2][6] = pawnB.getSign();

        array[3][0] = queenB.getSign();
        array[3][3] = bishopW.getSign();

        array[4][3] = bishopB.getSign();
        array[4][4] = pawnW.getSign();

        array[5][4] = bishopW.getSign();
        array[5][5] = pawnW.getSign();

        array[6][0] = pawnW.getSign();
        array[6][3] = queenW.getSign();
        array[6][5] = pawnW.getSign();
        array[6][7] = pawnW.getSign();

        array[7][5] = rookW.getSign();
        array[7][6] = kingW.getSign();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null) {
                    array[i][j] = empty.getSign();
                }
            }
        }
        board.print();
    }
}
