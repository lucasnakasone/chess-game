package chess;

import board.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	protected Position toPosition() throws ChessException{
		throw new ChessException("Not implemented yet.");
	}

	protected ChessPosition fromPosition(Position position) throws ChessException {
		throw new ChessException("Not implemented yet.");
	}
	
	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

}	
