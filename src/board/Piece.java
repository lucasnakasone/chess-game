package board;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) throws BoardException {
		this.board = board;
		position = null;
	}

	public abstract boolean[][] possibleMoves() throws BoardException;
	
	public boolean possibleMove(Position position) throws BoardException {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() throws BoardException {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

	protected Board getBoard() {
		return board;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
