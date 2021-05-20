package methodoverriding1;

import MethodOverriding.Methodoverriding;
import methodoverloading.MethodOverloading;

public class ClassB extends MethodOverriding1{
	public void add(int a,int c)
	{
		int b=a+c;
		System.out.println("child class"+b);
	}
	public void info3()
	{
		System.out.println("jd");
	}
	public static void downCasting(MethodOverriding1 p)
	{
		if(p instanceof MethodOverriding1)
		{
			ClassB c=(ClassB) p;//downcasting
			c.info3();
		}
	}
	
	

}
