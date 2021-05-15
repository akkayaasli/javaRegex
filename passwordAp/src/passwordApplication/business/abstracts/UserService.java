package passwordApplication.business.abstracts;

import passwordApplication.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(String email,String password);
	void googleAccount(String email, String password);
}
