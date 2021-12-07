package com.chess.board;

import com.chess.board.interfaces.IBoardFactory;
import com.chess.board.interfaces.IInitBoard;
import com.chess.board.interfaces.ISquareBox;
import com.chess.piece.PieceFactory;
import com.chess.piece.interfaces.IPiece;
import com.chess.piece.interfaces.IPieceFactory;

/**
 * @author Kunj Vijaykumar Patel
 */
public class InitBoard implements IInitBoard {

    private IBoardFactory iBoardFactory= new BoardFactory();
    private IPieceFactory iPieceFactory=new PieceFactory();

    @Override
    public ISquareBox[][] initializeNewBoard(ISquareBox[][] iSquareBoxes) {
        for (int x=0;x<8;x++) {
            for (int y=0;y<8;y++) {
                iSquareBoxes[x][y]= iBoardFactory.createSqureBox(iBoardFactory.createCoordinates(x,y));
            }
        }

        iSquareBoxes=initializeBlackPieces(iSquareBoxes);
        iSquareBoxes=initializeWhitePieces(iSquareBoxes);

        return iSquareBoxes;
    }

    @Override
    public ISquareBox[][] initializeWhitePieces(ISquareBox[][] iSquareBoxes) {

        iSquareBoxes[0][0].setPiece((IPiece) iPieceFactory.createRook("WRk"));
        iSquareBoxes[0][7].setPiece((IPiece) iPieceFactory.createRook("WRk"));
        iSquareBoxes[0][1].setPiece((IPiece) iPieceFactory.createKnight("WKn"));
        iSquareBoxes[0][6].setPiece((IPiece) iPieceFactory.createKnight("WKn"));
        iSquareBoxes[0][2].setPiece((IPiece) iPieceFactory.createBishop("WBi"));
        iSquareBoxes[0][5].setPiece((IPiece) iPieceFactory.createBishop("WBi"));
        iSquareBoxes[0][3].setPiece((IPiece) iPieceFactory.createQueen("WQn"));
        iSquareBoxes[0][4].setPiece((IPiece) iPieceFactory.createKing("BRk"));
        for (int index=0; index<8; index++){
            iSquareBoxes[1][index].setPiece((IPiece) iPieceFactory.createPawn("BPn"));
        }

        return iSquareBoxes;
    }

    @Override
    public ISquareBox[][] initializeBlackPieces(ISquareBox[][] iSquareBoxes) {

        //iSquareBoxes[7][2].setPiece(new Bishop(PlayerType.BLACK));
        iSquareBoxes[7][0].setPiece((IPiece) iPieceFactory.createRook("BRk"));
        iSquareBoxes[7][7].setPiece((IPiece) iPieceFactory.createRook("BRk"));
        iSquareBoxes[7][2].setPiece((IPiece) iPieceFactory.createBishop("BBi"));
        iSquareBoxes[7][5].setPiece((IPiece) iPieceFactory.createBishop("BBi"));
        iSquareBoxes[7][1].setPiece((IPiece) iPieceFactory.createKnight("BKn"));
        iSquareBoxes[7][6].setPiece((IPiece) iPieceFactory.createKnight("BKn"));
        iSquareBoxes[7][3].setPiece((IPiece) iPieceFactory.createQueen("BQn"));
        iSquareBoxes[7][4].setPiece((IPiece) iPieceFactory.createKing("BRk"));
        for (int index=0; index<8; index++){
            iSquareBoxes[6][index].setPiece((IPiece) iPieceFactory.createPawn("BPn"));
        }

        return iSquareBoxes;
    }

}
