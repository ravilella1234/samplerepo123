package com.hdfc.loans.carloans;

public class ICICI implements Rbi,Rbi1
{

	@Override
	public void withdrawl() {
		System.out.println("iam overrdien withdrawl in ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam overrdien deposit in ICICI");
	}
	
	public static void main(String[] args) 
	{
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
		i.ministatement();
	}

	@Override
	public void ministatement() {
		System.out.println("iam overriden ministatement in ICICI");		
	}

}
