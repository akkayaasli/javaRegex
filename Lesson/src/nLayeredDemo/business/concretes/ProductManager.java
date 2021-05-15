package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService  {
	//KURALLARRRR
	//ProductService içindeki metotlar aþaðýda.
	//kurallarý buraya yazýyoruz.Mesela id si 1 olan ürünü ekleme gibi vs 
	
	private ProductDao productDao;//hemen ardýndan yapýcý metotunu oluþturuyoruz.
	
	//core içinde oluþturduðumuz baþkasýnýn yazdýðý koda eriþim service ni ekleyelim
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
			System.out.println("Bu kategoride ürün kabul edilmez.");
			return;
			
		} 
		this.productDao.add(product);//hipernate baðýmlýlýðýný ortadan kaldýrdýk.
//ProductService içinde ki add metotunun kuralýný ProductManager içinde yazýyoruz.Ve add in
//görevi eklemek old için bu iþlemi yapmasýnýda ProductDao interface i içindeki add i kullanarak yapýyoruz.
		this.loggerService.logToSystem("Ürün loglandý "+ product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
//iþ yapan "sýnýf" "manager"
}
