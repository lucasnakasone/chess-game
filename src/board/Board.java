package board;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private int rows;
	private int columns;
	private List<Piece> pieces = new ArrayList<>();
	
	public Board() {
	}

	public Piece piece(int row, int columns) throws BoardException{
		throw new BoardException("Not implemented yet.");
	}
	
	public Piece piece(Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
	}
	
	public void plaecPiece(Piece piece, Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
	}
	
	public Piece placePiece(Piece piece, Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
	}
	
	public Piece removePiece(Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
	}
	
	public boolean positionExists(Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
	}
	
	public boolean thereIsAPiece(Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
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
