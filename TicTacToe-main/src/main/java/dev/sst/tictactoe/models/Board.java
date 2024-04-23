package dev.sst.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> arr;

    public Board(int size, List<List<Cell>> arr) {
        this.size = size;
        this.arr = new ArrayList<>();
    }
}
