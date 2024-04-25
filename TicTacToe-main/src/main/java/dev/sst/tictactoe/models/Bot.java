package dev.sst.tictactoe.models;

import java.util.List;

public class bot extends Player {
    private botDifficultyLevel botDifficultyLevel;

    public bot(String name, Symbol symbol, PlayerType playerType, botDifficultyLevel botDifficultyLevel) {
        super(name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move makeMove(Board board) {
        // find the first empty cell and move there
        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellState().equals(CellState.empty)) {
                    return new Move(cell, this);
                }
            }
        }
        return null;
    }

}
