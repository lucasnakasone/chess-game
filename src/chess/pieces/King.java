package chess.pieces;

import board.Board;
import board.BoardException;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	
	public King(Board board, Color color) throws BoardException {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

	@Override
	public String getName() {
		return "King";
	}
}
