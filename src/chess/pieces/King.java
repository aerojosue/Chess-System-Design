package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		if (getColor() == Color.BLACK) {
			return "\u001B[30m"+"K";
		} else {
		return "K";
		}
	}
}
