package methodoverriding1;


public class Testcase {
	public static void main(String[]args)
	{
        //MethodOverriding1  c =new ClassB();
		//ClassB c=(ClassB) new  MethodOverriding1();
		//c.add(10, 30);
		//c.info1();
		MethodOverriding1 obj=new ClassB();
	    ClassB.downCasting(obj);
	}

}
