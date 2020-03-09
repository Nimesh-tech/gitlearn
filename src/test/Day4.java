package test;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void webHomeLoanLogin()
	{
		System.out.println("This is webCarLogin");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileHomeLoanLogin()	{
		System.out.println("This is webCarLogin");
	}
	
	@Test
	public void apiHomeLoanLogin()
	{
		System.out.println("This is webCarLogin");
	}

}
