package final_finally_finalize;

public class Finalize1 {

	public static void main(String[] args) {
		/*Finalize is the method in java which is used to performed cleaup processing		
		 * just before garbage collected 
		 */
				Finalize1 F1 = new Finalize1();
				F1.Demo();
				
				F1=null;
				
				System.gc();
			}
			
			public void Demo() {
				System.out.println("Demo Method");
			}

			public void finalize() {
				System.out.println("Finaled method executed");
			}
		}

	

