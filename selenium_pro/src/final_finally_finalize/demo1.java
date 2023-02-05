package final_finally_finalize;

public class demo1 {
		/*Final is the keyword and access modifier which is used to restrications
		on variables,methods and classes
		1. Final class can not be inherited to child class
		2. Final method means can not overridden  by subclass
		3. Once we declared as a final variable we can not chage/modified.
		*/
		public static void main(String[] args) {
			
			int i = 200;
			System.out.println(i);
			
			i = 300;
			System.out.println(i);
			System.out.println(i);
			
			
			final int a = 100;
			System.out.println(a);
			
			//a=200;
		}

		public final void Main() {
			System.out.println("Final Method");
		}
	}
