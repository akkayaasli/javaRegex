package passwordApplication.business.concretes;

import passwordApplication.business.abstracts.UserControlService;
import passwordApplication.business.abstracts.UserGoogleAccountService;
import passwordApplication.business.abstracts.UserLoginService;
import passwordApplication.business.abstracts.UserService;
import passwordApplication.dataAccess.abstracts.UserDao;
import passwordApplication.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private UserControlService userControlService;
	private UserLoginService userLoginService;
	private UserGoogleAccountService userGoogleAccountService;
	
	
	//Constructor Method
	public UserManager(UserDao userDao, UserControlService userControlService, UserLoginService userLoginService,
			UserGoogleAccountService userGoogleAccountService) {
		super();
		this.userDao = userDao;
		this.userControlService = userControlService;
		this.userLoginService = userLoginService;
		this.userGoogleAccountService = userGoogleAccountService;
	}




	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		boolean transaction=false;
		if (userDao.getAll()!=null) {
			for(User userT:userDao.getAll()) {
				if (user.getEmail()==userT.getEmail()) {
					System.out.println("Kay�tl� bir mail adresi");
					
				}
			}
		}
		
		
		if (!userControlService.controlEmail(user)) {
			System.out.println("L�tfen ge�erli bir mail giriniz.");
		}
		if (!userControlService.controlUserName(user)) {
			System.out.println("L�tfen ge�erli bir kullan�c� ad� giriniz.");
		}
		if (!userControlService.controlPassword(user)) {
			System.out.println("L�tfen 6 karakterden olu�an ge�erli bir �ifre giriniz.");
		}
		
	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		userLoginService.login(email,password);
		
	}

	@Override
	public void googleAccount(String userName, String password) {
		// TODO Auto-generated method stub
		userGoogleAccountService.googleAccount(userName,password);
		
	}

}
