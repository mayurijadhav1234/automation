package exception;

public class exception3 {

	public static void main(String[] args) {
String Name = null;
		
		try {
			System.out.println(Name.length());// Null pointer 
		} catch (NullPointerException P) {
			System.out.println(P.getMessage());
			P.printStackTrace();
			System.out.println("Hi");
		}		
		finally {
			System.out.println("This is finally blocks");
		}
		
	}
//	

	}

