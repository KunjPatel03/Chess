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
    private IBoardFactory boardFactory;
    private IPiece piece;
    private ICoordinates coordinates;

    public SquareBox(ICoordinates coordinates,IPiece piece){
        this.coordinates = coordinates;
        this.piece = piece;
    }

    public SquareBox setFactory(IBoardFactory boardFactory){
        this.boardFactory = boardFactory;
        return this;
    }
    public SquareBox(ICoordinates coordinates){
        this(coordinates,null);
    }

    @Override
    public IPiece getPiece() {
        return this.piece;
    }

    @Override
    public ICoordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public void setPiece(IPiece piece) {
        this.piece = piece;
    }

}

