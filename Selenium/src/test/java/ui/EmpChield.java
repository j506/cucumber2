package ui;

public class EmpChield extends EmpParent{
	int age;
	EmpChield(int empID,String empString,int age)
	{
		super(empID,empString);
		this.age=age;
		System.out.println("chield class constructed called");
	}
	public void showRecord()
	{
		
		System.out.println("Emp ID"+empID);
		System.out.println("Emp Name"+empString);
		System.out.println("Emp age"+age);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
