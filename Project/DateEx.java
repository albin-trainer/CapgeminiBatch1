package com.capgemini.collections;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateEx {
public static void main(String[] args) {
	Date date=new Date();
	System.out.println("Current data & time :"+ date); //current date with time ...
	
	Calendar c=new GregorianCalendar(2002, 0, 15);//month starts from 0
	Date d=c.getTime();
	
	System.out.println(d);
	//to compare dates ///
	System.out.println(date.compareTo(d));
	
	
	Date d2= new GregorianCalendar(2002, 0, 15).getTime(); 
	
	System.out.println(d2);
	Music m=new Music();
	m.setDateOfrelease(new GregorianCalendar(2002, 0, 15).getTime());
}
}


class Music{
	private Date dateOfrelease;

	public Date getDateOfrelease() {
		return dateOfrelease;
	}

	public void setDateOfrelease(Date dateOfrelease) {
		this.dateOfrelease = dateOfrelease;
	}
	
}