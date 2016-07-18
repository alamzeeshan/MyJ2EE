package com.rameez.service;

import com.rameez.dao.LoginDAO;
import com.rameez.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	LoginDAO loginDAO;

	public LoginServiceImpl() {
		super();
		System.out.println("Constructing LoginServiceImpl");
		loginDAO = new LoginDAOImpl();
	}

	@Override
	public boolean isValidUser(String userName, String password) {
		return loginDAO.isValidUser(userName, password);
	}

}
