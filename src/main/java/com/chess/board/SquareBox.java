package com.chess.board;

import com.chess.board.interfaces.ICoordinates;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.interfaces.IPiece;

public class SquareBox implements ISquareBox {
    private IPiece iPiece;
    private ICoordinates iCoordinates;

    public SquareBox(ICoordinates iCoordinates, IPiece iPiece){
        this.iCoordinates = iCoordinates;
        this.iPiece = iPiece;
    }

    @Override
    public ICoordinates getCoordinates() {
        return iCoordinates;
    }

    @Override
    public IPiece getPiece() {
        return null;
    }
}
