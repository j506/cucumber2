package AbstractClassDemo;

public class TestClass {
	public static void main(String[]args)
	{
		RBIBank obj=new SBI();
		RBIBank obj1=new HDFC();
		obj.rbiMethod();
		System.out.println("RI of SBI is:"+obj.getRateofInterest()+"%");
		System.out.println("RI of HDFC is:"+obj1.getRateofInterest()+"%");
	}

}
