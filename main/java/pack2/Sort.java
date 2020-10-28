package pack2;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		  ArrayList<String> al = new ArrayList<String>(); 
	        al.add("Geeks For Geeks"); 
	        al.add("Friends2"); 
	        al.add("Friends1"); 
	        al.add("1234"); 
	        al.add("Superb"); 
	  
	        /* Collections.sort method is sorting the 
	        elements of ArrayList in ascending order. */
	        Collections.sort(al); 
	  
	        // Let us print the sorted list 
	        System.out.println("List after the use of" + 
	                           " Collection.sort() :\n" + al); 
	        
	        
	        
	        ArrayList<String> al2 = new ArrayList<String>(); 
	        al.add("Geeks For Geeks"); 
	        al.add("Friends"); 
	        al.add("Dear"); 
	        al.add("Is"); 
	        al.add("Superb"); 
	  
	        /* Collections.sort method is sorting the 
	        elements of ArrayList in ascending order. */
	        Collections.sort(al, Collections.reverseOrder()); 
	  
	        // Let us print the sorted list 
	        System.out.println("List after the use of" + 
	                           " Collection.sort() :\n" + al); 
	}

}
