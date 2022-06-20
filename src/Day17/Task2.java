package Day17;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] cp = new ChessPiece[8][8];

        for (ChessPiece[] row : cp)
            Arrays.fill(row, ChessPiece.EMPTY);

        cp[0][0] = ChessPiece.ROOK_BLACK;
        cp[0][5] = ChessPiece.ROOK_BLACK;
        cp[0][6] = ChessPiece.KING_BLACK;

        cp[1][1] = ChessPiece.ROOK_WHITE;
        cp[1][4] = ChessPiece.PAWN_BLACK;
        cp[1][5] = ChessPiece.PAWN_BLACK;
        cp[1][7] = ChessPiece.PAWN_BLACK;

        cp[2][0] = ChessPiece.PAWN_BLACK;
        cp[2][2] = ChessPiece.KNIGHT_BLACK;
        cp[2][6] = ChessPiece.PAWN_BLACK;

        cp[3][0] = ChessPiece.QUEEN_BLACK;
        cp[3][3] = ChessPiece.BISHOP_WHITE;

        cp[4][3] = ChessPiece.BISHOP_BLACK;
        cp[4][4] = ChessPiece.PAWN_WHITE;

        cp[5][4] = ChessPiece.BISHOP_WHITE;
        cp[5][5] = ChessPiece.PAWN_WHITE;

        cp[6][0] = ChessPiece.PAWN_WHITE;
        cp[6][3] = ChessPiece.QUEEN_WHITE;
        cp[6][5] = ChessPiece.PAWN_WHITE;
        cp[6][7] = ChessPiece.PAWN_WHITE;

        cp[7][5] = ChessPiece.ROOK_WHITE;
        cp[7][6] = ChessPiece.KING_WHITE;

        ChessBoard cb = new ChessBoard(cp);
        cb.print(cp);
    }
}
/* Текущие изменения: реализован метод "fill" для первоначльного проставления пустых ячеек на шахматной доске;
* далее заполнение доски фигурами происходит вручную */