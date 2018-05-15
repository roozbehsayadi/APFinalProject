package Classes.ChessStuff.SafHe;

public class ChessBoard {

	private Block [][] board=new Block[8][8];

    public Block[][] getBoard() {
        return board;
    }

    public void setBoard(Block[][] board) {
        this.board = board;
    }
}
