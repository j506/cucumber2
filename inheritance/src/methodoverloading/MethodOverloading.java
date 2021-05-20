package methodoverloading;

public class MethodOverloading {
	public void add( int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b,int c)
	{
		double d=a+b+c;
		System.out.println(d);
	}

}
