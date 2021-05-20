package InterfaceDemo;

public class ClassA implements A,B{

	@Override
	public void interfaceBmethod() {
		// TODO Auto-generated method stub
		System.out.println("Inteface B method is called");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method is displayed");
		
	}

	@Override
	public void interfaceAmethod() {
		// TODO Auto-generated method stub
		System.out.println("Interface A method is called");
	}

	

}
