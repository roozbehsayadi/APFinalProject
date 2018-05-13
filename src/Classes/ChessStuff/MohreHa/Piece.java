package Classes.ChessStuff.MohreHa;

import Classes.ChessStuff.SafHe.*;
import Classes.Ezaafaat.*;

import java.util.ArrayList;

public abstract class Piece {

    private Cord currentCord;

    public abstract void move( Cord dist );

    public abstract ArrayList < Block > validBlocks( ChessBoard chessBoard );

    public Cord getCurrentCord() {
        return currentCord;
    }

    public void setCurrentCord(Cord currentCord) {
        this.currentCord = currentCord;
    }

}
