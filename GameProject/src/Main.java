import Concrete.SaleManager;
import Entities.Campaign;
import Entities.CampaignSale;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player= new Player(1, "Muhammet", "Şanlı", "2001", "12345678910");
		Game game=new Game(1, "Mount and Blade Bannerlord", 50);
		Campaign campaign = new Campaign(1,50);
		CampaignSale sale=new CampaignSale(1, game, player, campaign);
		
		SaleManager saleManager=new SaleManager();
		saleManager.add(sale); 
	}

}
