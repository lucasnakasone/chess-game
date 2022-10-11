package chess;

import board.Board;
import board.BoardException;
import board.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	private Board board;
	
	public ChessMatch() throws BoardException {
		board = new Board();
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() throws BoardException{
		ChessPiece[][] chessBoard = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				chessBoard[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return chessBoard;
	}

	private void initialSetup() throws BoardException {
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 0));;
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 7));;
		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));;
		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 7));;
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));;
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));;
	}
	
	@Override
	public String toString() {
		return "ChessMatch [turn=" + turn + ", currentPlayer=" + currentPlayer + ", check=" + check + ", checkMate="
				+ checkMate + ", enPassantVulnerable=" + enPassantVulnerable + ", promoted=" + promoted + ", board="
				+ board + "]";
	}
	
	
	
	
	
}
