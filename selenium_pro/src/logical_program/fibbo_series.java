package logical_program;

public class fibbo_series {

	public static void main(String[] args)
	{
		// in FS next number is the sum of previous two number
		
				// Example  - 0 1 1 2 3 5 8 13 21 34
				
				int a=-1,b=1, c;
				
				for(int i=1;i<=10;i++) {
					
					c=a+b;   // -1+1 =0
					         //  1+0 =1
							
					System.out.print(" "+c); //0 1 2
					
					a=b;    //1  1
					b=c;    //0  1
				}
	}

}
