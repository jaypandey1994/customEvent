package com.mds.event;

import org.springframework.context.ApplicationListener;

public class LoginTracker implements ApplicationListener<LoginEvent>{

	public void onApplicationEvent(LoginEvent event) {
		System.out.println(((Login) event.getSource()).getUsername() +" logged-in @ "+ event.getDate()+"\n");
		
	}

}
