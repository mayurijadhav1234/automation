package logical_program;

public class factorial_no {

	public static void main(String[] args) {
		//Example - 6*5*4*3*2*1 = 720
		
				int number = 6;
				int factorial =1;
				
				for(int i=1;i<=number;i++) {
					
					factorial =factorial*i;
					//1=1*1=1
					//1=1*2=2
					//2=2*3=6
					
				}
				System.out.println("Factoial of "+number+" is -->"+factorial);
			}
	}


