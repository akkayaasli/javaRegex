package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService  {
	//KURALLARRRR
	//ProductService i�indeki metotlar a�a��da.
	//kurallar� buraya yaz�yoruz.Mesela id si 1 olan �r�n� ekleme gibi vs 
	
	private ProductDao productDao;//hemen ard�ndan yap�c� metotunu olu�turuyoruz.
	
	//core i�inde olu�turdu�umuz ba�kas�n�n yazd��� koda eri�im service ni ekleyelim
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmez.");
			return;
			
		} 
		this.productDao.add(product);//hipernate ba��ml�l���n� ortadan kald�rd�k.
//ProductService i�inde ki add metotunun kural�n� ProductManager i�inde yaz�yoruz.Ve add in
//g�revi eklemek old i�in bu i�lemi yapmas�n�da ProductDao interface i i�indeki add i kullanarak yap�yoruz.
		this.loggerService.logToSystem("�r�n logland� "+ product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
//i� yapan "s�n�f" "manager"
}
