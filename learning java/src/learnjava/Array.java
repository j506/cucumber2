package learnjava;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myint=5;
		int[] myArray=new int[10];
	    myArray[0]=10;
	    myArray[1]=20;
	    System.out.println(myArray[1]);
	    System.out.println(myArray.length);
	    int[] myArray1= {10,20,30,40};
	    System.out.println(myArray1[1]);
	    System.out.println(myArray1.length);
	    for(int myArray11=0;myArray11<myArray1.length;myArray11++)
	    {
	    	System.out.println(myArray1[myArray11] +"the length of an array"+myArray11);
	    }

	    

	}

}
