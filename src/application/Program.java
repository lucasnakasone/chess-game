package application;

import java.util.Scanner;

import board.BoardException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main (String[] args) throws BoardException {
		
		ChessMatch chessMatch = new ChessMatch();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println();
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
	
}
