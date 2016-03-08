package es.ucm.fdi.tp.practica4.ataxx;

import java.util.List;

import es.ucm.fdi.tp.basecode.bgame.model.Board;
import es.ucm.fdi.tp.basecode.bgame.model.FiniteRectBoard;
import es.ucm.fdi.tp.basecode.bgame.model.Game.State;
import es.ucm.fdi.tp.basecode.bgame.model.GameMove;
import es.ucm.fdi.tp.basecode.bgame.model.GameRules;
import es.ucm.fdi.tp.basecode.bgame.model.Pair;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;

public class AtaxxRules implements GameRules {
	// This object is returned by gameOver to indicate that the game is not
	// over. Just to avoid creating it multiple times, etc.
	//
	protected final Pair<State, Piece> gameInPlayResult = new Pair<State, Piece>(State.InPlay, null);

	private int dim;

	public AtaxxRules() {
		this.dim = 5;
	}

	public AtaxxRules(int dim) {
		this.dim = dim;
	}

	@Override
	public String gameDesc() {
		// TODO Auto-generated method stub
		return "Ataxx " + dim + " x " + dim;
	}

	@Override
	public Board createBoard(List<Piece> pieces) {
		// TODO Auto-generated method stub
		return new FiniteRectBoard(dim, dim);
	}

	@Override
	public Piece initialPlayer(Board board, List<Piece> pieces) {
		// TODO Auto-generated method stub
		return pieces.get(0);
	}

	@Override
	public int minPlayers() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int maxPlayers() {
		// TODO Auto-generated method stub
		return 4;
	}

	// devuelve la posicion con mayor cantidad de piezas
	public int compara(int[] array) {

		return 0;
	}

	@Override
	public Pair<State, Piece> updateState(Board board, List<Piece> pieces, Piece turn) {
		// TODO Auto-generated method stub
		// creo un array para poner en este las cantidades de cada jugador
		int[] cantidad = new int[pieces.size()];
		// si no está llena, aún no termina el juego
		if (!board.isFull()) {
			return gameInPlayResult;
		} else {
			for (int i = 0; i < pieces.size(); i++) {
				cantidad[i] = board.getPieceCount(pieces.get(i));
			}
			int mayor = compara(cantidad);
			return (new Pair<State, Piece>(State.Won, pieces.get(mayor)));
		}
	}

	@Override
	public Piece nextPlayer(Board board, List<Piece> pieces, Piece turn) {
		// TODO Auto-generated method stub
		List<Piece> playersPieces = pieces;
		int i = playersPieces.indexOf(turn);
		return playersPieces.get((i + 1) % playersPieces.size());
	}

	@Override
	public double evaluate(Board board, List<Piece> pieces, Piece turn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<GameMove> validMoves(Board board, List<Piece> playersPieces, Piece turn) {
		// TODO Auto-generated method stub
		return null;
	}

}
