package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
//ürün listele, güncelle , ekle vs burada yazýlýr.
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);//hepsburada bir ürüne týklaynca bizi o ürüne yönlendirme id ye göre olur
	List<Product> getAll();//listeleme : mesela arama kutusuna telefon yaz milyonlarca telefon gelmesi gibi
	//Buradaki List bir interfacedir.
}
