package chess;

import board.Board;
import board.BoardException;
import board.Piece;
import board.Position;

public abstract class ChessPiece extends Piece{
	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) throws BoardException {
		super(board);
		this.color = color;
	}

	public ChessPosition getChessPosition() throws ChessException {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece (Position position) throws BoardException {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	protected void increaseMoveCount() {
		moveCount++;
	}
	
	protected void decreaseMoveCount() {
		moveCount--;
	}

	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
	
}