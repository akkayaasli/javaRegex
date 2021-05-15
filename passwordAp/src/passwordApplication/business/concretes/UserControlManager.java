package passwordApplication.business.concretes;

import passwordApplication.business.abstracts.UserControlService;
import passwordApplication.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserControlManager implements UserControlService {
	   String eMailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+"[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	   String firstNamePattern = "^[\\p{L}A-Z a-z]{2,}$";
	   String lastNamePattern = "^[\\p{L}A-Z a-z]{2,}$";
	   String passwordPattern = "^(?=.[0-9A-Za-z@#$%*?^:;+-._,]).{6,}$";
	@Override
	public boolean controlEmail(User user) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(eMailPattern);
        Matcher matcher = pattern.matcher(user.getEmail());
        return matcher.matches();        
	}
	@Override
	public boolean controlPassword(User user) {
		// TODO Auto-generated method stub
		 Pattern pattern = Pattern.compile(passwordPattern);
	     Matcher matcher = pattern.matcher(user.getPassword());
	     return matcher.matches();	
	}
	@Override
	public boolean controlUserName(User user) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcherFirstName = pattern.matcher(user.getName());
        Matcher matcherLastName = pattern.matcher(user.getLastName());
        return (matcherFirstName.matches() && matcherLastName.matches());	}

}
