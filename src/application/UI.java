package application;

import chess.ChessPiece;

public class UI {

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
