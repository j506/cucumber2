package Accessmodifiers;


public class Accessmodifier {
	private int a=10;
	public  void m1()
	{
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifier j=new Accessmodifier();
		j.m1();
		System.out.println(j.a);
		
		

	}

}
