package test.qat1;
import java.util.*;


public class ReverseElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ReverseStringElements obj = new  ReverseStringElements();
		 ArrayList<String> arrayli = new ArrayList<String>();
		 String s1 = new String("Akash");
		 String s2 = new String("Asha");
		 String s3 = new String("Bhuvaneshwar");
		 String s4 = new String("Virat Kohli");
		 arrayli.add(s1);
		 arrayli.add(s2);
		 arrayli.add(s3);
		 arrayli.add(s4);
		 System.out.print("Elements before reversing:");
	        obj.printElements(arrayli);
	        arrayli = obj.reverseArrayList(arrayli);
	        System.out.print("\nElements after reversing:");
	        obj.printElements(arrayli);

		
	       
	}

}
