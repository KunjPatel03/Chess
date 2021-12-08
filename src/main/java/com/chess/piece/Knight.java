package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.IKnight;
import com.chess.piece.interfaces.IPieceExistence;
import com.chess.utilities.Utility;

/**
 * @author Sanjuna Konda
 */

public class Knight extends Piece implements IKnight {
    private PieceFactory pieceFactory = new PieceFactory();
    private int coordinateDistance;
    public Utility utility;

    public Knight(ICoordinates iCoordinates, IPieceExistence pieceExistence, int color) {
        super(iCoordinates, pieceExistence, color);
    }

    @Override
    public String getPieceName(){
        return utility.KNIGHT;
    }

    @Override
    public boolean isValidMove(IBoard board, SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor() == this.getPieceColor()) {
            return false;
        }
        coordinateDistance = pieceFactory.createCoordinateDistance(startPosition, endPosition).calculateCoordinateDistance("Knight");
        if(coordinateDistance == utility.TWO) {
            return true;
        }
        return false;
    }
}
