package ArrayListConcept;

import java.util.ArrayList;

public class VertualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Object> ar=new ArrayList<Object>(20);
        System.out.println(ar.size());//pysical capacity=0
        ar.add(1000);
        System.out.println(ar.size());//pysical capacity=1;
        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());
	}

}
