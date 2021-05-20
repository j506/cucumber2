package ui;

public class Test1 implements Runnable {
    public void run()
    {
    	System.out.println("thread task2");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		Thread th=new Thread(t);
		th.start();

	}

}
