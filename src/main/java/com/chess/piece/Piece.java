package com.chess.piece;

import com.chess.piece.interfaces.IPiece;

public class Piece implements IPiece {
    private String pieceName;
    private String color;

    public Piece(String pieceName,String color){
        this.pieceName=pieceName;
        this.color=color;
    }

    @Override
    public String getPieceName(){
        return pieceName;
    }
}
