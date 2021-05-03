package Services;
import Entities.Game;

public class GameManager implements BaseManager{

	Game game;
	
	public GameManager(Game game) {
		this.game = game;
	}

	@Override
	public void Add() {
		System.out.println(game.getName() + " adlı oyun eklendi");
		
	}

	@Override
	public void Delete() {
		 System.out.println(game.getName() + " adlı oyun silindi");
		
	}

	@Override
	public void Update() {
		System.out.println(game.getName() + " adlı oyun güncellendi");
		
	}	
	
}
