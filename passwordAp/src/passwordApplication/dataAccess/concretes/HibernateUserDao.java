package passwordApplication.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import passwordApplication.dataAccess.abstracts.UserDao;
import passwordApplication.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName() + " kiþisi sisteme kayýt edildi.");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName() + " kiþisinin bilgileri güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName() + " kiþisinin bilgileri silindi.");
		
	}
	public List<User> users = new ArrayList<User>();
	@Override
	public User get(int Id) {
		// TODO Auto-generated method stub
		for(User user: users) {
			if(user.getId()==Id)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();//Bunu daha sonra silip dene zaten yuarda var.
		User user1=new User(1,"Dilek","Ant","dilekant@gmail.com","56");
		User user2=new User(2,"Barney","Stinson","barney@gmail.com","236");
		User user3=new User(3,"Ted","Mosby","mosby@gmail.com","698");
		users.add(user3);
		users.add(user1);
		users.add(user2);


		return users;
	}

}
