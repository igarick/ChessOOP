package org.example;

import org.example.pieces.Piece;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPositions();

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
        renderer.render(board);

        Piece piece = board.getPiece(new Coordinates(File.B, 1));
        Set<Coordinates> availableMoveSquare = piece.getAvailableMoveSquares(board);

        int a = 1;
    }
}