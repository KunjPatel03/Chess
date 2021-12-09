package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.IPiece;
import com.chess.piece.interfaces.IPieceExistence;

/**
 * @author Sanjuna Konda
 */

public abstract class Piece implements IPiece {
    private String pieceName;
    private int color;
    private IPieceExistence pieceExistence;

    public Piece(int color) {
        this.color = color;
    }

    public Piece(String pieceName) {
        this.pieceName = pieceName;
    }

    @Override
    public String getPieceName(){
        return pieceName;
    }

    public IPieceExistence getPieceExistence() {
        return pieceExistence;
    }

    @Override
    public int getPieceColor() {
        return this.color;
    }

    public abstract boolean isValidMove(SquareBox startPosition, SquareBox endPosition);

}
