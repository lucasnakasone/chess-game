package chess.pieces;

import board.Board;
import board.BoardException;
import board.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{
	
	private ChessMatch chessMatch;
	
	public Pawn (Board board, Color color, ChessMatch chessMatch) throws BoardException {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public String toString() {
		return "P";
	}

	@Override
	public boolean[][] possibleMoves() throws BoardException {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);
		if(getColor() == Color.WHITE) {
			// Check 1 above
			p.setValues(position.getRow() - 1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// Check 2 above
			p.setValues(position.getRow() - 2, position.getColumn());
			Position p2 = new Position(position.getRow() - 1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) 
					&& getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p) 
					&& getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// Check northwest
			p.setValues(position.getRow() - 1, position.getColumn() - 1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// Check northeast
			p.setValues(position.getRow() - 1, position.getColumn() + 1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// En passant - WHITE
			if (position.getRow() == 3) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnpassantVulnerable()) {
					mat[left.getRow() - 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnpassantVulnerable()) {
					mat[right.getRow() - 1][right.getColumn()] = true;
				}
			}
			
		} else if (getColor() == Color.BLACK){
			// Check 1 below
			p.setValues(position.getRow() + 1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// Check 2 below
			p.setValues(position.getRow() + 2, position.getColumn());
			Position p2 = new Position(position.getRow() + 1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) 
					&& getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p) 
					&& getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// Check southwest
			p.setValues(position.getRow() + 1, position.getColumn() - 1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// Check southeast
			p.setValues(position.getRow() + 1, position.getColumn() + 1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// En passant - BLACK
			if (position.getRow() == 4) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnpassantVulnerable()) {
					mat[left.getRow() + 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnpassantVulnerable()) {
					mat[right.getRow() + 1][right.getColumn()] = true;
				}
			}
		}
		return mat;
	}

	@Override
	public String getName() {
		return "Pawn";
	}
}
