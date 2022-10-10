package board;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
	}
	
	public boolean isThereAnyPossibleMove() throws BoardException {
		throw new BoardException("Not implemented yet.");
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
}
