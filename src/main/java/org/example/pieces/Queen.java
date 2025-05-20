package org.example.pieces;

import org.example.Color;
import org.example.Coordinates;

import java.util.Collections;
import java.util.Set;

public class Queen extends Piece {

    public Queen(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return Collections.emptySet();
    }
}
