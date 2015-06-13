package dan.practice.designpatterns.demo1.view;

// Class that stores info with getters and setters
// Also called a bean class
public class LoginFormEvent {
	private String name;
	private String password;
	
	public LoginFormEvent(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
