package inheritance;

public class AdvanceCal extends Inheritance {
	public int multiplication(int a,int b)
	{
		return a+b;
	}
	public static void main(String[]args)
	{
		AdvanceCal a=new AdvanceCal();
		System.out.println(a.multiplication(6, 9));
		System.out.println(a.addition(3, 4));
	}

}
