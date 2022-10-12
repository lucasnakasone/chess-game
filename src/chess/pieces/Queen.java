package chess.pieces;

import board.Board;
import board.BoardException;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {
	
	public Queen (Board board, Color color) throws BoardException {
		super(board, color);
	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

	@Override
	public String getName() {
		return "Queen";
	}
}
