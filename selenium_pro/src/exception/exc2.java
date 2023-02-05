package exception;

public class exc2 {

	public static void main(String[] args) {

		System.out.println("Java");

		int Number = 50;
		try {
			System.out.println(50 / 0); // THis code will throw ExceptionHere we have handle the exception
		} catch (Exception e) { //

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Python");

		String Name = null;
		try {
			System.out.println(Name.length());
		} catch (NullPointerException P) {
			System.out.println(P.getMessage());
			P.printStackTrace();
		}
		System.out.println("Execution completed");
		
		int arr []= new int[5];
		
		try {
		arr[6]=30;  //
		}
		catch(StringIndexOutOfBoundsException S) {
			System.out.println(S.getMessage());
			S.printStackTrace();
			System.out.println("Hello");
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Hello1");

		}
		
		catch (ArrayIndexOutOfBoundsException P) {
			System.out.println(P.getMessage());
			P.printStackTrace();
			System.out.println("Hello2");

 		}
		catch (ArithmeticException P) {
			System.out.println(P.getMessage());
			P.printStackTrace();	
			System.out.println("Hello3");
	
		}
	}
	
	


	}

