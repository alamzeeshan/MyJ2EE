package com.rameez.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rameez.service.LoginService;
import com.rameez.service.LoginServiceImpl;


public class LoginController extends HttpServlet {
       

	private static final long serialVersionUID = 1335536533149594683L;

	private LoginService loginService;
	
    public LoginController() {
        super();
        loginService = new LoginServiceImpl();
    	System.out.println("Constructing LoginController");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		String userName = request.getParameter("user");
		String password = request.getParameter("password");
		System.out.println(userName +" :: "+password);
		boolean isValidUser = loginService.isValidUser(userName, password);
		String view = "";
		
		if(isValidUser) {
			view = "/home.jsp";
		} else {
			request.setAttribute("loginResult", "failure");
			view = "/index.jsp";
		}
		System.out.println(view);
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doGet(request, response);
	}

}
