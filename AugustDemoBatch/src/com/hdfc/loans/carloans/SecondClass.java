package com.hdfc.loans.carloans;

public class SecondClass 
{
	
	//data properties
	int a=10,b=20,result;
	
	//behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : " + result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : " + result);
	}
	
	public void mul()
	{
		result = a*b;
		System.out.println("Mul of A & B is : " + result);
	}
	
	public void div()
	{
		result =a/b;
		System.out.println("Div of A & B is : " +  result);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hello...");
				
		int x = 100;
		String name = "ravilella";
		
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
	}

}
