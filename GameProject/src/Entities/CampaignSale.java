package Entities;
public class CampaignSale extends Sale{
	
	private Campaign campaign;

	public CampaignSale(int id, Game game, Player player, Campaign campaign) {
		super(id,game,player);
		this.campaign = campaign;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}	
	
	@Override
	public int getSalePrice() {
		salePrice=this.getGame().getPrice()-(this.getGame().getPrice()*this.getCampaign().getRate()/100);
		return salePrice;
	}
	
	
}
