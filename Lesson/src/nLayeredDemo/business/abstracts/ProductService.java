package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
//iþ sýnýfý "interface" ler "service" olarak adlandýrýlýr.
	void add(Product product);
	List<Product> getAll();
}
