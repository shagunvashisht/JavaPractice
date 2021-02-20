package pack1;
import java.util.HashMap;
import java.util.Set;

public class EachCharCountInString {
	 
	
	    private static void characterCount(String inputString)
	    {
	        //Creating a HashMap containing char as a key and occurrences as a value
	  
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	  
	        //Converting given string to char array
	      String  InputStr= inputString.toUpperCase();
	        char[] strArray = InputStr.toCharArray();
	  
	        //checking each char of strArray
	  
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	                //If char 'c' is present in charCountMap, incrementing it's count by 1
	  
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                //If char 'c' is not present in charCountMap,
	                //putting 'c' into charCountMap with 1 as it's value
	  
	                charCountMap.put(c, 1);
	            }
	        }
	         
	        //Printing inputString and charCountMap 
	  
	       // System.out.println(InputStr+" : "+charCountMap);
	      //Getting a Set containing all keys of charCountMap
	        
	        Set<Character> charsInString = charCountMap.keySet();
	 
	        System.out.println("Duplicate Characters In "+inputString);
	 
	        //Iterating through Set 'charsInString'
	 
	        for (Character ch : charsInString)
	        {
	            if(charCountMap.get(ch) > 1)
	            {
	                //If any char has a count of more than 1, printing it's count
	 
	                System.out.println(ch +" : "+ charCountMap.get(ch));
	            }
	        }
	    }
	  
	   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       characterCount("Java J2EE Java JSP J2EE");
	  
	       characterCount("All Is Well");
	  
	      // characterCount("Done And Gone");
	}

}
