package thang.model;

public class UserTemp {
	private String fname;
	private String lname;
	private String email;
	private String number;
	private String password;
	private String code;
	public UserTemp(String fname, String lname, String email, String number,String password, String code) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.number = number;
		this.password= password;
		this.code= code;
	}
	public UserTemp() {
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
