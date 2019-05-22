package thang.userDAO;
import java.util.ArrayList;

import thang.model.User;
import thang.model.UserTemp;
public class userDAO {
	private static ArrayList<User> listUser = new ArrayList<User>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		add(new User("thang","luu","thang@gmail.com","0938996159","123456"));
		add(new User("tri","nguyen","tri@gmail.com","0123456789","123456"));
	}
		
	};
	private static ArrayList<UserTemp> listTemp = new ArrayList<UserTemp>();
	public static ArrayList<User> getListUser() {
		return listUser;
	}
	public static void setListUser(ArrayList<User> listUser) {
		userDAO.listUser = listUser;
	}
	public static ArrayList<UserTemp> getListTemp() {
		return listTemp;
	}
	public static void setListTemp(ArrayList<UserTemp> listTemp) {
		userDAO.listTemp = listTemp;
	}
	public static void insertTemp(UserTemp user) {
		getListTemp().add(user); System.out.println(getListTemp().size());
	}
	public static void insertUser(User user) {
		getListUser().add(user);
	}
	public static void removeUser(UserTemp user) {
		getListTemp().remove(user);
	}
	}
