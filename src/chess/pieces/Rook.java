package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		if (getColor() == Color.BLACK) {
			return "\u001B[30m"+"R";
		} else {
		return "R";
		}
	}
	
	

}
