package com.evolvus.SpringListInjection;

import java.util.List;

public class Passinglisttospring {
 
	private List<String> details;
	
	public Passinglisttospring (List<String> details)
	{
		this.details=details;
	}
	
	
	
	public void display()
	{
		for (String printdetails : details) {
			System.out.println(printdetails );
		}
	}
	
	
}
