package test;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void webCarLoanLogin()
	{
		System.out.println("This is webCarLogin (manoj)");
	}
	
	@Test
	public void MobileCarLoanLogin()
	{
		System.out.println("This is MobileCarLogin");
		
	}
	
	@Test
	public void MobileCarLoanLogout()
	{
		System.out.println("This is MobileCarLogout");
	}
	
	@Test(groups= {"Smoke"})
	public void apiCarLoanLogin()
	{
		System.out.println("This is ApiCarLogin This is gitlearn");
	}
	

}
