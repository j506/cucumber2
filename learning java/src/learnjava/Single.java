package learnjava;

public class Single {

	void eat()
	{
		System.out.println("eat");
	}

}
public class s extends Single
{
   public static void main(String[]arg)
   {
	   s c=new s();
	   c.eat();
   }
}
