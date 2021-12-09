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
    private String color;
    private IPieceExistence pieceExistence;

    public Piece(String pieceName, String color) {
        this.pieceName = pieceName;
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
    public String getPieceColor() {
        return this.color;
    }

    public abstract boolean isValidMove(SquareBox startPosition, SquareBox endPosition);

}
