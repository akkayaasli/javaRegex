package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
//i� s�n�f� "interface" ler "service" olarak adland�r�l�r.
	void add(Product product);
	List<Product> getAll();
}
