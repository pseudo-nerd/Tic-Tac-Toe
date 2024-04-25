package dev.sst.tictactoe.controllers;

import dev.sst.tictactoe.exceptions.InvalidMoveException;
import dev.sst.tictactoe.models.Game;
import dev.sst.tictactoe.models.GameState;
import dev.sst.tictactoe.models.Player;


import java.util.List;

public class GameController {
    public Game startGame(int dimension  , List<Player> players){
        return  new Game(dimension,players);
    }

    public  void makeMove(Game game) throws InvalidMoveException {
       game.makeMove();
    }
    public GameState checkState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
    public  void printBoard(Game game){
        game.printBoard();
    }



}
