package Services;
import Entities.Sale;

public class SaleManager implements BaseManager{

	Sale sale;
	
	public SaleManager(Sale sale) {
		super();
		this.sale = sale;
	}

	@Override
	public void Add() {
		System.out.println(sale.getGame().getName() + " oyunu " + sale.getPlayer().getFirstName() + " " + sale.getPlayer().getLastName() + " oyuncusuna " + sale.getSalePrice() +  " fiyatına satıldı");		
	}

	@Override
	public void Delete() {
		System.out.println(sale.getGame().getName() + " oyunu " + sale.getPlayer().getFirstName() + " " + sale.getPlayer().getLastName() + " oyuncusuna " + sale.getSalePrice() +  " fiyatına satışı silindi");
		
	}

	@Override
	public void Update() {
		System.out.println(sale.getGame().getName() + " oyunu " + sale.getPlayer().getFirstName() + " " + sale.getPlayer().getLastName() + " oyuncusuna " + sale.getSalePrice() +  " fiyatına satışı güncellendi");
		
	}

}
