package ui;

public class Whiteboxtesting {
	public static void main(String[]args)
	{
		module1();
		module2();
		
	}
	public static void module1()
	{
		System.out.println("this is module 1");
		submodule1();
	}
	public static void module2()
	{
		System.out.println("this is module 2 ");
		
	}
	public static void submodule1()
	{
		System.out.println("this is submodule1");
		submodule2();
	}
	public static void submodule2()
	{
		System.out.println("this is submodule2");
	}

}
