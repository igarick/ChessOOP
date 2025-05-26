package org.example.pieces;

import org.example.Board;
import org.example.BoardUtils;
import org.example.Color;
import org.example.Coordinates;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rook extends LongRangePiece implements IRook{

    public Rook(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return getRookMoves();
        }
    }
