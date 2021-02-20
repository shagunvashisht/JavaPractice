package pack1;

public class ReverseString {
	private static String RecursiveMethod(String s) {
		if(s==null || s.length()<=1) {
			return s;
		
		}
		return(RecursiveMethod(s.substring(1))+s.charAt(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*StringBuffer sb=new StringBuffer("hello");//using String Buffer
System.out.println(sb.reverse());*/
	/*	//using iterative
		String str="Hello";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
		*/
		
		//without coverting string into char array
	/*	String str="shagun";
		int len=str.length();
		String rev= " ";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		*/
		//using recursion method
		
		System.out.println(RecursiveMethod("Shagun"));
		
}

}
