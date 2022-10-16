package board;

public class Board {
	private int rows = 8;
	private int columns = 8;
	private Piece[][] pieces = new Piece[rows][columns];
	
	public Board() {
	}
	
	public Piece piece(int row, int column) throws BoardException {
		if(!positionExists(row, column)) {
			throw new BoardException("Position does not exist.");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) throws BoardException {
		if(!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardException("Position does not exist.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) throws BoardException {
		if (thereIsAPiece(position)) {
			throw new BoardException("Position already ocupied - " + position.getRow() + ", " + position.getColumn());
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) throws BoardException {
		if(!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardException("Position does not exist.");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece removedPiece = piece(position);
		removedPiece.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return removedPiece;
	}
	
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) throws BoardException {
		if(!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardException("Position does not exist.");
		}
		return piece(position) != null;
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