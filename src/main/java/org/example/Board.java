package org.example;

import org.example.pieces.Pawn;
import org.example.pieces.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPieces(Coordinates coordinates, Piece piece) {
        piece.coordinates = coordinates;
        pieces.put(coordinates, piece);
    }

    public void setupDefaultPiecesPositions() {
        for (File file : File.values()) {
            setPieces(new Coordinates(file, 2), new Pawn(Color.WHITE, new Coordinates(file, 2)));
            setPieces(new Coordinates(file, 7), new Pawn(Color.BLACK, new Coordinates(file, 7)));
        }
    }

    public static boolean isSquareDark(Coordinates coordinates) {
        return ((coordinates.file.ordinal() + 1) + coordinates.rank) % 2 == 0;
    }
}
