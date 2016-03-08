package es.ucm.fdi.tp.practica4.ataxx;

import java.util.List;

import es.ucm.fdi.tp.basecode.bgame.control.Controller;
import es.ucm.fdi.tp.basecode.bgame.control.GameFactory;
import es.ucm.fdi.tp.basecode.bgame.control.Player;
import es.ucm.fdi.tp.basecode.bgame.model.AIAlgorithm;
import es.ucm.fdi.tp.basecode.bgame.model.GameObserver;
import es.ucm.fdi.tp.basecode.bgame.model.GameRules;
import es.ucm.fdi.tp.basecode.bgame.model.Observable;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;

public class AtaxxFactory implements GameFactory {

	@Override
	public GameRules gameRules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player createConsolePlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player createRandomPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player createAIPlayer(AIAlgorithm alg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Piece> createDefaultPieces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createConsoleView(Observable<GameObserver> game, Controller ctrl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createSwingView(Observable<GameObserver> game, Controller ctrl, Piece viewPiece, Player randPlayer,
			Player aiPlayer) {
		// TODO Auto-generated method stub
		
	}

}
