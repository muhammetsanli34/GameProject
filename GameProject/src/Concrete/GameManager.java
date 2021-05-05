package Concrete;
import Abstract.GameService;
import Entities.Game;
import Services.BaseManager;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" adlı oyun eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" adlı oyun silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" adlı oyun güncellendi.");
		
	}

	
	
}
