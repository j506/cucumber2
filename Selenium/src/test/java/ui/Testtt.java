package ui;

public class Testtt extends Thread {
    public void run()
    {
    	System.out.println("perform sigle task from multiple threads");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testtt t1=new Testtt();
		t1.start();
		Testtt t2=new Testtt();
		t2.start();

	}

}
