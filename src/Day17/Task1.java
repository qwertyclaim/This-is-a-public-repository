package Day17;
public class Task1 {
    public static void main(String[] args) {
        ChessPiece cp1 = ChessPiece.PAWN_WHITE;
        ChessPiece cp2 = ChessPiece.PAWN_WHITE;
        ChessPiece cp3 = ChessPiece.PAWN_WHITE;
        ChessPiece cp4 = ChessPiece.PAWN_WHITE;
        ChessPiece cp5 = ChessPiece.ROOK_BLACK;
        ChessPiece cp6 = ChessPiece.ROOK_BLACK;
        ChessPiece cp7 = ChessPiece.ROOK_BLACK;
        ChessPiece cp8 = ChessPiece.ROOK_BLACK;
        ChessPiece[] chess = new ChessPiece[8];
        chess[0] = cp1;
        chess[1] = cp2;
        chess[2] = cp3;
        chess[3] = cp4;
        chess[4] = cp5;
        chess[5] = cp6;
        chess[6] = cp7;
        chess[7] = cp8;
        for (int i = 0; i<chess.length; i++) {
            System.out.print(chess[i].getSymbol()+" ");
        }
    }
}