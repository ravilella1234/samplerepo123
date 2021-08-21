package com.hdfc.loans.carloans;

public interface Rbi 
{
	int x = 10;
	
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		Rbi i;
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
		
		i = new HDFC();
		i.deposit();
		i.withdrawl();
		
		
		ICICI i1 = new ICICI();
		i1.deposit();
		i1.withdrawl();
		i1.ministatement();
		
	}

}
