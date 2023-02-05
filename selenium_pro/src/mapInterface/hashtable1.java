package mapInterface;

import java.util.Hashtable;

public class hashtable1 {

	public static void main(String[] args) {
		
		

		Hashtable<Integer, String>  HT = new Hashtable<Integer, String>();
		Hashtable<Integer, String>  HT1 = new Hashtable<Integer, String>();

			//Default size -11 and load factor - 0.75%

		HT.put(33, "Sumit");
		HT.put(29, "Amit");
		HT.put(55, "Java");
		HT.put(67, "Python");
		HT.put(55, "Automation");
		//HT.put(21, null);     //  NullPointerException
		//HT.put(null, "ABC");  //  NullPointerException
		
		
		System.out.println(HT);
		
//		System.out.println(HT.remove(55));
		System.out.println(HT);
		
		HT.put(99, "Amit");
		System.out.println(HT);
		
		//Contians key
		System.out.println(HT.containsKey(55));
		System.out.println(HT.containsKey(551));

		//Conatins value
		System.out.println(HT.containsValue("Automation"));
		System.out.println(HT.containsValue("Automation1"));

		System.out.println(HT.isEmpty());
		System.out.println(HT1.isEmpty());
		
		System.out.println();
		//KeySet
		System.out.println(HT.keySet());
		//get
	    System.out.println(HT.get(33));
	    
	    //value
	    System.out.println(HT.values());
	    
	    //Entryset
	    System.out.println(HT.entrySet());
	    
	    System.out.println();
	    for(Object obj :HT.keySet()) {
	    	
	    	System.out.println(obj +" "+HT.get(obj));
	    }
		}	


	}

