package pack1;

public class basic {
	int b =10;
		public void a() {
			System.out.println("hi");
		}
}
	class child extends basic{
	 public void b () {
		 System.out.println("bye");
		 b=20;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 child c= new child();
 System.out.println(c.b);
 c.b();
 

	}
	}

