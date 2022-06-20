package Day17;
public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chess = new ChessPiece[8];
        for (int i = 0; i<chess.length; i++) {
            if (i>=0 && i<=3)
                chess[i] = ChessPiece.PAWN_WHITE;
            else if (i>=4 && i<8)
                chess[i] = ChessPiece.PAWN_BLACK;
        }
        for (int i = 0; i<chess.length; i++) {
            System.out.print(chess[i].getSymbol()+" ");
        }
    }
}
// Заполнение массива происходит с использованием цикла, а не вручную, как раньше