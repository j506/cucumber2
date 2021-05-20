package ui;

public class Test12 extends Thread{
	public void run()
	{
		System.out.println("perform single task from single thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test12 t=new Test12();
		t.start();

	}

}
