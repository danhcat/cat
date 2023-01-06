package com.vti.enity;

import java.time.LocalDate;

public class Group {

	public int id;
	public String Groupname;
	public Account Creatorid;
	public LocalDate creatDate;
	public Account[] accounts;
}
