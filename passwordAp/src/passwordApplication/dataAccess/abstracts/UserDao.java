package passwordApplication.dataAccess.abstracts;

import java.util.List;

import passwordApplication.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int Id);//ba�kas� b�yle yapm�� => Customer getById(int id);
	List<User> getAll();
	
	
	
}
