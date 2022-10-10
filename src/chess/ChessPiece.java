package chess;

import board.Board;
import board.BoardException;
import board.Piece;
import board.Position;

public abstract class ChessPiece extends Piece{
	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color, int moveCount) throws BoardException {
		super(board);
		this.color = color;
		this.moveCount = moveCount;
	}

	public ChessPosition getChessPosition() throws ChessException {
		throw new ChessException("Not implemented yet.");
	}
	
	protected boolean isThereOpponentPiece (Position position) throws ChessException {
		throw new ChessException("Not implemented yet.");
	}
	
	protected void increaseMoveCount() throws ChessException {
		throw new ChessException("Not implemented yet.");
	}
	
	protected void decreaseMoveCount() throws ChessException {
		throw new ChessException("Not implemented yet.");
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
	
}