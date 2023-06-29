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
			return "\033[0;1m"+"R"+"\u001B[0m";
		} else {
		return "R";
		}
	}
	
	

}
