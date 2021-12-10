package com.chess.piece;

import com.chess.piece.interfaces.IPieceExistence;

/**
 * @author Sanjuna Konda
 */

public class PieceExistence implements IPieceExistence {

    private boolean existence;

    public PieceExistence(boolean existence) {
        setExistence(existence);
    }

    @Override
    public boolean isExists() {
        return this.existence;
    }

    @Override
    public void setExistence(boolean existence) {
        this.existence = existence;
    }

}
