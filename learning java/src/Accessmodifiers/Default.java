package Accessmodifiers;
class A
{
	//int a=10;
	//void m1()
	//{
		//System.out.println("hwkddm");
	//}
	protected int a=10;
	protected void m1()
	{
		System.out.println("hwkddm");
	}
}

public class Default {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println(a.a);
		a.m1();
		
		

	}

}
