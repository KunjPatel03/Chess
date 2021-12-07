package com.chess.piece;

import com.chess.piece.interfaces.IPiece;

public class Piece implements IPiece {
    private String pieceName;

    public Piece(String pieceName){
        this.pieceName=pieceName;
    }

    @Override
    public String getPieceName(){
        return pieceName;
    }
}
