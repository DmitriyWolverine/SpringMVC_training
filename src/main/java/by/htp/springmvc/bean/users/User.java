package by.htp.springmvc.bean.users;

import by.htp.springmvc.bean.Entity;

public class User extends Entity{
	private String login;
	private String password;
	private int role = 0;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public User(String login, String password, int role) {
		super();
		this.login = login;
		this.password = password;
		this.role = role;
	}
	public User(int id, String login, String password, int role) {
		super(id);
		this.login = login;
		this.password = password;
		this.role = role;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	
	public void setRole(int role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + role;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role != other.role)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
