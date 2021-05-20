package learnjava;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods md=new Methods();
		System.out.println(md.addtwonumbers(15, 20));
		dologin();
		tologout();
		

	}
	public static void dologin()
	{
		//this is the syntax of methods within we can know what is public ,what is void and 
		//within this curli braces if want to define in your code here
		//login code go inside 
		//whenever you are trying to login for perticuar portal then i will call this methods by any of my testcases.
		//the public is the access modifier this methos is accessable accross diffreent class,when you do the login after login
		//you are trying to return certain integer or some other data types for tahat perticular case the return types will be accordingly
		System.out.println("system is login successfully");
	}
	public static void tologout()
	{
		dologin();
		System.out.println("system is logout successfully");
	}
	public int addtwonumbers(int x,int y)
	{
		int z=x+y;
		return z;
	}

}
