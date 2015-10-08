package com.mds.event;

import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class LoginEvent extends ApplicationEvent {

	private Date date;
	public LoginEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
		this.date=new Date(getTimestamp());
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
