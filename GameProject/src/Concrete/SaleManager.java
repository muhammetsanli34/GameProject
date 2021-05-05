package Concrete;
import Abstract.SaleService;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getGame().getName()+" oyunu " + sale.getPlayer().getFirstName() + " " + sale.getPlayer().getLastName()
				+" oyuncusuna" + sale.getSalePrice() + " fiyatına satıldı."				
				);
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getGame().getName()+" oyunu " + sale.getPlayer().getFirstName() + " " + sale.getPlayer().getLastName()
				+" oyuncusuna" + sale.getSalePrice() + " fiyatına satışı silindi."				
				);
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(sale.getGame().getName()+" oyunu " + sale.getPlayer().getFirstName() + " " + sale.getPlayer().getLastName()
				+" oyuncusuna" + sale.getSalePrice() + " fiyatına satışı güncellendi."				
				);
		
	}

	

}
