package com.vti.enity;

import java.time.LocalDate;

public class Account {

	public int id;
	public String username;
	public String email;
	public String fullname;
	public Deparment deparment;
	public position position;
	public LocalDate createDate;
	public Group[] groups;
}
