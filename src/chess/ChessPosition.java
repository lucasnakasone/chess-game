package chess;

import board.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	
	
	public ChessPosition(char column, int row) throws ChessException {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values from A1 to H8");
		}
		this.column = column;
		this.row = row;
	}

	protected Position toPosition() throws ChessException{
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) throws ChessException {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

}	
