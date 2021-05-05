package Adapters;

import Abstract.PersonCheckService;
import Entities.Player;

public class MernisServiceAdapter implements PersonCheckService{
	
		@Override
	public  boolean checkIfRealPerson(Player player) {
		return true;
	}

}
