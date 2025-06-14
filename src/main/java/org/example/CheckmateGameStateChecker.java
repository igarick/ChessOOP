package org.example;

import org.example.board.Board;
import org.example.board.BoardFactory;
import org.example.board.Move;
import org.example.pieces.King;
import org.example.pieces.Piece;

import java.util.List;
import java.util.Set;

public class CheckmateGameStateChecker extends GameStateChecker {

    @Override
    public GameState check(Board board, Color color) {
        Piece king = board.getPiecesByColor(color).stream().
                filter(piece -> piece instanceof King).
                findFirst().
                get();

        if (!board.isSquareAttackedByColor(king.coordinates, color.opposite())) {
            return GameState.ONGOING;
        }

        List<Piece> pieces = board.getPiecesByColor(color);
        for (Piece piece : pieces) {
            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

            for (Coordinates coordinates : availableMoveSquares) {
                Board clone = new BoardFactory().copy(board);
                clone.makeMove(new Move(piece.coordinates, coordinates));

                Piece cloneKing = clone.getPiecesByColor(color).stream().
                        filter(p -> p instanceof King).
                        findFirst().
                        get();

                if(!clone.isSquareAttackedByColor(cloneKing.coordinates, color.opposite())) {
                    return GameState.ONGOING;
                }
            }
        }

        if (color == Color.WHITE) {
            return GameState.CHECKMATE_TO_WHITE_KING;
        } else {
            return GameState.CHECKMATE_TO_BLACK_KING;
        }
    }
}
