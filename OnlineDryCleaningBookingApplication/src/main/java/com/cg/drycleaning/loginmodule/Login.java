package com.cg.drycleaning.loginmodule;

import org.springframework.stereotype.Component;

import com.cg.drycleaning.beans.User;

/************************************************************************************
 *          @author          Shaik Abdul Rahiman
 *          Description      It is a service class that provides the services for adding anew account, 
                                        transferring fund and viewing all the accounts  
  *         Version             1.0
  *         Created Date    03-MAR-2021
 ************************************************************************************/

@Component
public class Login {

	private boolean loginStatus;
	private User user;
	
	Login() {
		
	}

	public Login(boolean loginStatus, User user) {
		super();
		this.loginStatus = loginStatus;
		this.user = user;
	}

	public boolean isLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRole() {
		return user.getRole();
	}

}
