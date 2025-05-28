package org.example;

import org.example.board.Board;
import org.example.board.Move;

public class Game {

    private final Board board;

    private BoardConsoleRenderer renderer = new BoardConsoleRenderer();

    public Game(Board board) {
        this.board = board;
    }

    public void gameLoop() {
        boolean isWhiteToMove = true;

        while (true) {
            renderer.render(board);

            if (isWhiteToMove) {
                System.out.println("White to move");
            } else {
                System.out.println("Black to move");
            }

            Move move = InputCoordinates.inputMove(board, isWhiteToMove ? Color.WHITE : Color.BLACK, renderer);

            board.makeMove(move);

            isWhiteToMove =! isWhiteToMove;
        }
    }
}
