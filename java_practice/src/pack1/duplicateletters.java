package pack1;

import java.util.HashMap;
import java.util.Set;

public class duplicateletters {
  private static void dlmethod(String str) {
	  
	  HashMap<Character, Integer> ht=new HashMap<Character, Integer>() ;
	  char[] Ar=str.toCharArray();
	  
	  for(char ch:Ar) {
		  if(ht.containsKey(ch)) {
			  ht.put(ch, ht.get(ch)+1);
		  }
		  else
		  {
			ht.put(ch, 1)  ;
		  }
		 
	  }
	  System.out.println(str + ":" +ht );
	  Set<Character> charac= ht.keySet();
	  for(char c: charac) {
		  if(ht.get(c)>1) {
			  System.out.println(c + " : " + ht.get(c));
			 
		  }
	  }
  }
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dlmethod("Butter Better");
	}


}
