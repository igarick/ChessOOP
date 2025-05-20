package org.example;

public class Game {

    public final Board board;

    private BoardConsoleRenderer renderer = new BoardConsoleRenderer();

    public Game(Board board) {
        this.board = board;
    }

    public void gameLoop() {
        boolean isWhiteToMove = true;

        while (true) {
            renderer.render(board);

            isWhiteToMove =! isWhiteToMove;
        }
    }
}
