/**
 * @author Kunj Vijaykumar Patel
 */
package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.ICoordinates;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.interfaces.IPiece;

/**
 * @author Kunj Vijaykumar Patel
 */
public class SquareBox implements ISquareBox {
    private IBoardFactory iBoardFactory = new BoardFactory();
    private IPiece iPiece;
    private ICoordinates iCoordinates;

    public SquareBox(ICoordinates iCoordinates,IPiece iPiece){
        this.iCoordinates = iCoordinates;
        this.iPiece = iPiece;
    }
    public SquareBox(ICoordinates iCoordinates){
        this(iCoordinates,null);
    }

    @Override
    public IPiece getPiece() {
        return this.iPiece;
    }

    @Override
    public ICoordinates getCoordinates() {
        return iCoordinates;
    }

    @Override
    public void setPiece(IPiece iPiece) {
        this.iPiece = iPiece;
    }

    @Override
    public boolean isOccupied() {
        if (iPiece == null) {
            return false;
        }
        return true;
    }

}

