package org.example;

import org.example.board.Board;
import org.example.board.BoardFactory;

public class Main {
    public static void main(String[] args) {
//        Board board = new Board();
//        board.setupDefaultPiecesPositions();

        Board board = new BoardFactory().fromFEN
                //("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR - w");
        //("3k4/8/5n2/2N5/3B4/8/8/3K4 w - - 0 1");
                //("3k4/8/p7/8/R7/8/P7/3K4 w - - 0 1");
        //("3k4/8/p5n1/5B2/R7/3P4/P7/3K4 w - - 0 1");
        //("3k4/6r1/8/1P2Q3/2B5/6P1/2R1r3/3K4 w - - 0 1");
                //("1k6/6p1/5p2/4N3/2n5/3P4/2P5/6K1 w - - 0 1");
        ("rnb1kbnr/pppp1ppp/8/4p3/6Pq/5P2/PPPPP2P/RNBQKBNR w KQkq - 0 1");

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
//        renderer.render(board);
//
//        Piece piece = board.getPiece(new Coordinates(File.G, 8));
//        Set<Coordinates> availableMoveSquare = piece.getAvailableMoveSquares(board);
//
//        int a = 123;
//
        Game game = new Game(board);
        game.gameLoop();
    }
}