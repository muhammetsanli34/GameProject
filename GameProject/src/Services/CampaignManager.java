package Services;
import Entities.Campaign;

public class CampaignManager implements BaseManager{

	Campaign campaign;
	
	public CampaignManager(Campaign campaign) {
		super();
		this.campaign = campaign;
	}

	@Override
	public void Add() {
		
		System.out.println(this.campaign.id + " kampanyası eklendi");
		
	}

	@Override
	public void Delete() {
		System.out.println(this.campaign.id + " kampanyası silindi");
		
	}

	@Override
	public void Update() {
		System.out.println(this.campaign.id + " kampanyası güncellendi");
		
	}

}
