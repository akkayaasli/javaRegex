package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ToDo: Spring IoC ile iyileþtirilecek.
		ProductService productService=new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
		
		ProductService productService2=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());

		Product product=new Product(1,1,"Çilek",12,50);//id yi 1 verdik ki çalýþýyormu kontrol edelim
		Product product2=new Product(1,2,"Çilek",12,50);
		productService.add(product);
		productService.add(product2);
		productService2.add(product2);

	}

}
