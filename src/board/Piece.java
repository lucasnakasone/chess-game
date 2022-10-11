package board;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) throws BoardException {
		this.board = board;
		position = null;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) throws BoardException {
		throw new BoardException("Not implemented yet.");
	}
	
	public boolean isThereAnyPossibleMove() throws BoardException {
		throw new BoardException("Not implemented yet.");
	}

	protected Board getBoard() {
		return board;
	}

}
