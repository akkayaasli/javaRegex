package passwordApplication;

import passwordApplication.business.abstracts.UserGoogleAccountService;
import passwordApplication.business.abstracts.UserService;
import passwordApplication.business.concretes.UserControlManager;
import passwordApplication.business.concretes.UserLoginManager;
import passwordApplication.business.concretes.UserManager;
import passwordApplication.dataAccess.concretes.HibernateUserDao;
import passwordApplication.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setName("Aslý");
		user.setEmail("asli@gmail.com");
		user.setLastName("Akkaya");
		user.setPassword("236598");


		
		UserService userService= new UserManager(new HibernateUserDao(),new UserControlManager(),
				new UserLoginManager(new HibernateUserDao()),new UserGoogleAccountService() 
						{
							@Override
							public boolean googleAccount(String userName, String password) {
								// TODO Auto-generated method stub
								return false;
							}					
						}
						
				);
		userService.add(user);		
		System.out.println("Login");
		userService.login("asli@gmail.com", "236598");
		System.out.println("Google Account Login");
		userService.googleAccount("asli@gmail.com", "236598");
	}
}
