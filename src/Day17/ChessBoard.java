package Day17;
public class ChessBoard {
    public ChessBoard(ChessPiece[][] cp) {
    }
    public void print(ChessPiece[][] cp) {
        for (int i = 0; i<cp.length; i++) {
            System.out.println("\n");
            for (int j = 0; j<cp.length; j++) { // Указал вместо конкретной цифры итерацию до конца массива
                System.out.print(cp[i][j].getSymbol());
            }
        }
    }
}