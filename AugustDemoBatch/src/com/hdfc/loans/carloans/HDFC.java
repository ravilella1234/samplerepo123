package com.hdfc.loans.carloans;

public class HDFC implements Rbi
{

	@Override
	public void withdrawl() {
		System.out.println("iam overrdien withdrawl in HDFC");
	}

	@Override
	public void deposit() {
		System.out.println("iam overrdien deposit in HDFC");
	}
	
	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.deposit();
		h.withdrawl();
	}

}
