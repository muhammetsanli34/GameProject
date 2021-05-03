package Entities;
public class Campaign{	
	
	private int id;
	private int rate;
	
	public Campaign() {
		
	}

	
	public Campaign(int id, int rate) {
		this.id=id;
		this.rate = rate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
