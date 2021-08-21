package com.hdfc.loans.carloans;

public interface Rbi1 
{
	public void ministatement();
	
	public static void main(String[] args) 
	{
		Rbi1 i1;
		
		i1 = new ICICI();
		i1.ministatement();
	}

}
