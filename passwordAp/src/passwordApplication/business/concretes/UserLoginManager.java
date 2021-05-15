package passwordApplication.business.concretes;

import passwordApplication.business.abstracts.UserLoginService;
import passwordApplication.dataAccess.abstracts.UserDao;
import passwordApplication.entities.concretes.User;

public class UserLoginManager implements UserLoginService{

	private UserDao userDao;
	public UserLoginManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		for(User userSystemLogin:userDao.getAll()) {
			if (email==userSystemLogin.getEmail() && password==userSystemLogin.getPassword()) {
				if (userSystemLogin.isVerification()) {
					System.out.println("Baþarýlý login iþlemi.");
					return true;
					
				}
				else
				{
					System.out.println("Baþarýsýz login iþlemi.Doðrulama mailine týklayýnýz.");
					return true;
				}
				
			}
			
		}
		System.out.println("Aktif kullanýcý bulunamadý.");
		return false;
	}

}
