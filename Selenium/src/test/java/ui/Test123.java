package ui;

class Test123 extends Thread {
	public void run()
	{
		System.out.println("task1");
	}

}
class Test44 extends Thread
{
   public void run()
   {
	   System.out.println("task2");
   }
   public static void main(String[]args)
   {
	   Test123 t1=new Test123();
	   t1.start();
	   Test44 t2=new Test44();
	   t2.start();
   }
  
   
}


