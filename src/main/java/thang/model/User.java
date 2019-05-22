package thang.model;

public class User {
	private String fname;
	private String lname;
	private String email;
	private String number;
	private String password;
	public User(String fname, String lname, String email, String number,String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.number = number;
		this.password= password;
	}
	public User(String fname,String email) {
		this.fname= fname;
		this.email=email;
	}
	public User() {
		super();
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
