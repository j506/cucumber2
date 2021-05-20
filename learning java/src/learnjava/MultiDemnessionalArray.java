package learnjava;

public class MultiDemnessionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array within an array is called as multi demnssional array
		int[][] multiArray=new int[2][3];
		multiArray[0][0]=2;
		multiArray[0][1]=3;
		multiArray[0][2]=5;
		multiArray[1][0]=6;
		multiArray[1][1]=8;
		multiArray[1][2]=9;
		System.out.println(multiArray[1][2]);
		
		int[][] myarray= {{2,3,5},{6,8,9}};
		//System.out.println(multiArray[1][2]);
		for(int myarray1=0;myarray1<=myarray.length;myarray1++)
		{
			for(int myarray2=0;myarray2<myarray[myarray1].length;myarray2++)
			{
				System.out.println(myarray[myarray1][myarray2]);
			}
		}
		

	}

}
