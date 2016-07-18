package com.rameez.dao;

public class LoginDAOImpl implements LoginDAO {

	public LoginDAOImpl() {
		super();
		System.out.println("Constructing LoginDAOImpl");
	}

	@Override
	public boolean isValidUser(String userName, String password) {
		if(userName.equals("Rameez") && password.equals("password")) {
			return true;
		} else if(userName.equals("Shango") && password.equals("123456")) {
			return true;
		}
		return false;
	}

}
