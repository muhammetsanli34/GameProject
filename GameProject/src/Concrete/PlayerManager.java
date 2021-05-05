package Concrete;
import Abstract.PersonCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	PersonCheckService checkService;
	
	
	
	public PlayerManager(PersonCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(Player player) {
		
		if(this.checkService.checkIfRealPerson(player))
		{
			System.out.println(player.getFirstName() + " " + player.getLastName() + " kullanıcısı eklendi");	
		}
		
		else
		{
			System.out.println("Kimlik bilgileri hatalı!");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kullanıcısı silindi");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kullanıcısı güncellendi");
		
	}

	

}
