package pack1;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Set;

public class PhoneBook {
	
	private static void meth(String str) {
		 HashMap<String,Integer> ht=new HashMap<String,Integer>();
	       
	       ht.put( "Rahim",87867979);
	       ht.put( "Ram",7089967);
	       ht.put( "Rani",76658979);     
	       if(ht.containsKey(str)) {
	                System.out.println("Phonenumber of" + str + " : "  + ht.get(str)); 
	            }
	    	   else
	    	   {
	    		   System.out.println("Contact doesn't exist");
	    	   }
	       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       meth("Rani");
}
}
