package exception;

public class exception2 {

	public static void main(String[] args) 
	{
        System.out.println("Java");
		int Number  = 50;
		
		try {
		System.out.println(50/0);  // THis code will throw ExceptionHere we have handle the exception
		}
		catch (NullPointerException e) { //
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Python");
	}

	
}


