package learnjava;
public class Prime {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     for(int i=1;i<=100;i++)
	      {    
	    	    int temp=0;
	            
	            for(int j=2;j<i;j++)
	            {
	            	if(i%j==0)
	            	{
	            		temp=temp+1;
	            	}
	            }
	            if(temp==0)
	            {
	            	System.out.println(i);
	            }
	            
	      
	    
	      }
	      
	      

	}

}