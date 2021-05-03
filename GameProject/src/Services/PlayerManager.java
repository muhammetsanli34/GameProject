package Services;
import Entities.Player;
import Validators.PlayerValidator;

public class PlayerManager implements BaseManager{

	Player player;
	
	@Override
	public void Add() {
		if(PlayerValidator.isValid(player))
		{
			System.out.println(this.player.getFirstName() + " " + player.getLastName() + "adlı oyuncu eklendi.");
		}
		else
			System.out.println("Kullanıcı bilgileri geçersiz.");
		
		
	}

	@Override
	public void Delete() {
		if(PlayerValidator.isValid(player))
		{
			System.out.println(this.player.getFirstName() + " " + player.getLastName() + "adlı oyuncu silindi.");
		}
		else
			System.out.println("Kullanıcı bilgileri geçersiz.");
		
	}

	@Override
	public void Update() {
		if(PlayerValidator.isValid(player))
		{
			System.out.println(this.player.getFirstName() + " " + player.getLastName() + "adlı oyuncu güncellendi.");
		}
		else
			System.out.println("Kullanıcı bilgileri geçersiz.");
		
	}

}
