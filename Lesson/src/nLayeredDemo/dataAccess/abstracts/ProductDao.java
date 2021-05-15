package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
//�r�n listele, g�ncelle , ekle vs burada yaz�l�r.
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);//hepsburada bir �r�ne t�klaynca bizi o �r�ne y�nlendirme id ye g�re olur
	List<Product> getAll();//listeleme : mesela arama kutusuna telefon yaz milyonlarca telefon gelmesi gibi
	//Buradaki List bir interfacedir.
}
