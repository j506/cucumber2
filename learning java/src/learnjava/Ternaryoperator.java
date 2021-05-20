package learnjava;

public class Ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=23;
		int num2=25;
		if(num1>num2)
		{
			System.out.println("num1>num2");
		}
		else
		{
			System.out.println("num1<num2");
		}
		String result=(num1>num2) ? "num1>num2":"num1<num2";
		System.out.println(result);

	}

}
