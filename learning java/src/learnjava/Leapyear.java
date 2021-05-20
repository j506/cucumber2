package learnjava;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check for leap year
		int year=2018;
		//if(year%4==0)
		//{
			//if(year%100==0)
			//{
				//if(year%400==0)
				//{
					//System.out.println("leap year");
				//}
				//else
				//{
					//System.out.println("Not a leap year");  
				//}
			//}
			//else
			//{
				//System.out.println("leap year");
			//}
		//}
		//else {
			//System.out.println("no is not a leap year");
		//}
		if((year%400==0)||(year%4==0 && year%100!=0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

	}

}
