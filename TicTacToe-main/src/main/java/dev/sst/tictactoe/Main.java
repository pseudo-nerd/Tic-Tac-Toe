package dev.sst.tictactoe;

import dev.sst.tictactoe.controllers.GameController;
import dev.sst.tictactoe.exceptions.InvalidMoveException;
import dev.sst.tictactoe.models.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();
        int dimension = 3;
        List<Player> players = List.of(
                new Player("sst", new Symbol('X'), PlayerType.human),
                new bot("Scaler", new Symbol('0'), PlayerType.bot, botDifficultyLevel.easy)

        );
        Game game = gameController.startGame(dimension, players);

        while (game.getGameState().equals(GameState.in_progress)) {
            gameController.printBoard(game);
            gameController.makeMove(game);
        }

        if (!gameController.checkState(game).equals(GameState.ended)) {
            game.setGameState(GameState.draw);
            System.out.println("Game draw");
        } else {
            gameController.printBoard(game);
            System.out.println("Player " + gameController.getWinner(game).getName() + " is the winner");
        }
    }
}