package dev.sst.tictactoe.models;

public class Cell {
    int row;
    int col;
    private Player player;

    private CellState state;

    public Cell(int row, int col, Player player, CellState state) {
        this.row = row;
        this.col = col;
        this.player = player;
        this.state = state;
    }
}
