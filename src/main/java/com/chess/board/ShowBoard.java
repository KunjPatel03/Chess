package com.chess.board;

import com.chess.board.interfaces.IShowBoard;
import com.chess.board.interfaces.ISquareBox;

/**
 * @author Kunj Vijaykumar Patel
 */
public class ShowBoard  implements IShowBoard {

    @Override
    public void displayBoard(ISquareBox[][] iSquareBoxes) {

        for (int xCord =0; xCord<8; xCord++){
            for(int yCord=0; yCord<8; yCord++)
            {
                System.out.print(iSquareBoxes[xCord][yCord].getPiece().getPieceName()+" ");
            }
            System.out.print('\n');
        }

    }
}
