package Day17;
public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] cp = new ChessPiece[8][8];
        cp[0][0] = ChessPiece.ROOK_BLACK;
        cp[0][1] = ChessPiece.EMPTY;
        cp[0][2] = ChessPiece.EMPTY;
        cp[0][3] = ChessPiece.EMPTY;
        cp[0][4] = ChessPiece.EMPTY;
        cp[0][5] = ChessPiece.ROOK_BLACK;
        cp[0][6] = ChessPiece.KING_BLACK;
        cp[0][7] = ChessPiece.EMPTY;

        cp[1][0] = ChessPiece.EMPTY;
        cp[1][1] = ChessPiece.ROOK_WHITE;
        cp[1][2] = ChessPiece.EMPTY;
        cp[1][3] = ChessPiece.EMPTY;
        cp[1][4] = ChessPiece.PAWN_BLACK;
        cp[1][5] = ChessPiece.PAWN_BLACK;
        cp[1][6] = ChessPiece.EMPTY;
        cp[1][7] = ChessPiece.PAWN_BLACK;

        cp[2][0] = ChessPiece.PAWN_BLACK;
        cp[2][1] = ChessPiece.EMPTY;
        cp[2][2] = ChessPiece.KNIGHT_BLACK;
        cp[2][3] = ChessPiece.EMPTY;
        cp[2][4] = ChessPiece.EMPTY;
        cp[2][5] = ChessPiece.EMPTY;
        cp[2][6] = ChessPiece.PAWN_BLACK;
        cp[2][7] = ChessPiece.EMPTY;

        cp[3][0] = ChessPiece.QUEEN_BLACK;
        cp[3][1] = ChessPiece.EMPTY;
        cp[3][2] = ChessPiece.EMPTY;
        cp[3][3] = ChessPiece.BISHOP_WHITE;
        cp[3][4] = ChessPiece.EMPTY;
        cp[3][5] = ChessPiece.EMPTY;
        cp[3][6] = ChessPiece.EMPTY;
        cp[3][7] = ChessPiece.EMPTY;

        cp[4][0] = ChessPiece.EMPTY;
        cp[4][1] = ChessPiece.EMPTY;
        cp[4][2] = ChessPiece.EMPTY;
        cp[4][3] = ChessPiece.BISHOP_BLACK;
        cp[4][4] = ChessPiece.PAWN_WHITE;
        cp[4][5] = ChessPiece.EMPTY;
        cp[4][6] = ChessPiece.EMPTY;
        cp[4][7] = ChessPiece.EMPTY;

        cp[5][0] = ChessPiece.EMPTY;
        cp[5][1] = ChessPiece.EMPTY;
        cp[5][2] = ChessPiece.EMPTY;
        cp[5][3] = ChessPiece.EMPTY;
        cp[5][4] = ChessPiece.BISHOP_WHITE;
        cp[5][5] = ChessPiece.PAWN_WHITE;
        cp[5][6] = ChessPiece.EMPTY;
        cp[5][7] = ChessPiece.EMPTY;

        cp[6][0] = ChessPiece.PAWN_WHITE;
        cp[6][1] = ChessPiece.EMPTY;
        cp[6][2] = ChessPiece.EMPTY;
        cp[6][3] = ChessPiece.QUEEN_WHITE;
        cp[6][4] = ChessPiece.EMPTY;
        cp[6][5] = ChessPiece.PAWN_WHITE;
        cp[6][6] = ChessPiece.EMPTY;
        cp[6][7] = ChessPiece.PAWN_WHITE;

        cp[7][0] = ChessPiece.EMPTY;
        cp[7][1] = ChessPiece.EMPTY;
        cp[7][2] = ChessPiece.EMPTY;
        cp[7][3] = ChessPiece.EMPTY;
        cp[7][4] = ChessPiece.EMPTY;
        cp[7][5] = ChessPiece.ROOK_WHITE;
        cp[7][6] = ChessPiece.KING_WHITE;
        cp[7][7] = ChessPiece.EMPTY;
        ChessBoard cb = new ChessBoard(cp);
        cb.print(cp);
    }
}