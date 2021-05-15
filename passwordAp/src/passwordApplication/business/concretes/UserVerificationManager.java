package passwordApplication.business.concretes;

import passwordApplication.business.abstracts.UserVerificationService;
import passwordApplication.entities.concretes.User;

public class UserVerificationManager implements UserVerificationService{

	@Override
	public void verification(User user) {
		// TODO Auto-generated method stub
		user.setVerification(true);
	}

}
