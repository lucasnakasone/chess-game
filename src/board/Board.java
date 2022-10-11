package board;

public class Board {
	private int rows = 8;
	private int columns = 8;
	private Piece[][] pieces = new Piece[rows][columns];
	
	public Board() {
	}
	
	public Piece piece(int row, int columns) {
		return pieces[row][columns];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		Piece removedPiece = pieces[position.getRow()][position.getColumn()];
		pieces[position.getRow()][position.getColumn()] = null;
		return removedPiece;
	}
	
	public boolean positionExists(Position position) {
		if (position.getRow() > 8 || position.getRow() < 0) {
			return false;
		} else if (position.getColumn() > 8 || position.getColumn() < 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean thereIsAPiece(Position position) {
		if (pieces[position.getRow()][position.getColumn()] != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Board [rows=" + rows + ", columns=" + columns + ", pieces=" + pieces + "]";
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
}
