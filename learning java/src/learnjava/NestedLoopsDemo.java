package learnjava;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=4;i++)
		{
			int j=1;
			while(j<=5)
			{
				
				
				for(int x=1;x<=2;x++)
				{
					System.out.println("the vlaue of i is"+i+"the values of j is "+j+"the inner most loop x is"+x);
					count++;
				}
				j++;
				
			}
		}
		System.out.println(count);

	}

}
