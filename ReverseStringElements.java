package test.qat1;
import java.util.*;

public class ReverseStringElements {
	 public ArrayList<String> reverseArrayList(ArrayList<String> alist)
	    {
		 ArrayList<String> revArrayList = new ArrayList<String>();
	        for (int i = alist.size() - 1; i >= 0; i--) {
	        	  revArrayList.add(alist.get(i));
	    }
	        return revArrayList;

}
	 public void printElements(ArrayList<String> alist)
	    {
	        for (int i = 0; i < alist.size(); i++) {
	            System.out.print(alist.get(i) + " ");
	        }
	    }
	}
	 