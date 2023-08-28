package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessPiece;
import chess.ChessPosition;

public class UI {

	public static ChessPosition readChessPosition (Scanner sc){
		try {
			String s = sc.nextLine();
			char column = s.charAt(0);
			int row = Integer.parseInt(s.substring(1));
			return new ChessPosition(column, row);
		} catch (RuntimeException e) {
			throw new InputMismatchException("Error  reading ChessPossition. Valid values are from a1 to h8");
		}
	}

	public static void printBoard(ChessPiece[][] pieces) {

		for (int i = 0; i < pieces.length; i++) {
			System.out.print("\u001B[0m");
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {

				int sum = i + j;
				if (sum % 2 == 0) {
					System.out.print("\u001B[43m");
					printPiece(pieces[i][j]);
				}else {
					System.out.print("\u001B[42m");
					printPiece(pieces[i][j]);
				}
			}
			System.out.println();
		}
		System.out.print("\u001B[0m");
		System.out.println("   A  B  C  D  E  F  G  H");
	}

	private static void printPiece(ChessPiece piece) {
		if (piece == null) {

			System.out.print("  ");
		} else {
			System.out.print(" "+piece);
		}
		System.out.print(" "+"\u001B[0m");
	}

}
