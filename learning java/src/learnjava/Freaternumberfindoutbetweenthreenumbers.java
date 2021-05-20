package learnjava;

public class Freaternumberfindoutbetweenthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		//if(a>b && a>c)
		//{
			//System.out.println("a is a larger number");
		//}
		//else if(b>a && b>c)
		//{
			//System.out.println("b is a larger number ");
		//}
		//else
		//{
			//System.out.println("c is a larger number");
		//}
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else if(b>c)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
