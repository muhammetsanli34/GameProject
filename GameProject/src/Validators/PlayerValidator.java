package Validators;
import Entities.Player;

public class PlayerValidator {
	public static boolean isValid(Player player)
	{
		if(player.getNationalityId().length()==11 && player.getFirstName().length()>=2 && player.getLastName().length()>=2)
			return true;
		
		return false;
	}
}
