package passwordApplication.business.abstracts;

import passwordApplication.entities.concretes.User;

public interface UserControlService {
	boolean controlEmail(User user);
	boolean controlPassword(User user);
	boolean controlUserName(User user);
	
}
