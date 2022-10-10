package chess;

import board.Board;

public class ChessMatch {
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	private Board board;
	
	public ChessMatch() {
		board = new Board();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] chessBoard = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				chessBoard[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return chessBoard;
	}

	@Override
	public String toString() {
		return "ChessMatch [turn=" + turn + ", currentPlayer=" + currentPlayer + ", check=" + check + ", checkMate="
				+ checkMate + ", enPassantVulnerable=" + enPassantVulnerable + ", promoted=" + promoted + ", board="
				+ board + "]";
	}
	
	
	
	
	
}
