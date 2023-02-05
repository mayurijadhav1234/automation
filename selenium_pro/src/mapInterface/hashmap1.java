package mapInterface;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> HM = new HashMap<Integer, String>();

		HashMap HM1 = new HashMap<>();
		
		HM.put(1234, "Rahul");
		HM.put(1235, "Rohit");
		HM.put(1236, "Ketan");
		HM.put(1237, "Ketan");
		HM.put(1238, "David");
		HM.put(null, null);
		HM.put(null, "RRR");
		
		System.out.println(HM);
		
		//getmethod
		System.out.println(HM.get(1235));//it will return value
		
		System.out.println(HM.size());
		
		//Remove
		System.out.println(HM.remove(1236));
		
		System.out.println(HM);
		
		//ContiansKey
		System.out.println("contains keys");
		System.out.println(HM.containsKey(1234));
		System.out.println(HM.containsKey(1239));

		//ContainsValue
		System.out.println("contains value");
		System.out.println(HM.containsValue("Rahul"));

		System.out.println(HM.containsValue("Rahul12"));

	     //KeySet
		System.out.println();
		System.out.println(HM.keySet());
		
		//value
		System.out.println();
		System.out.println(HM.values());
		
		System.out.println(HM.entrySet());
		System.out.println();
		for(Object obj :HM.keySet()) {
			System.out.println(obj);
		}
		
		System.out.println();
		for(Object obj1 :HM.values()) {
			System.out.println(obj1);		
		}
		
		//  1234 Rahul
		//	1235 Rohit
		//	1237 Ketan
		//	1238 David	
		
		System.out.println();	
		for(Object Obj :HM.keySet()) {
			System.out.println(Obj +" "+HM.get(Obj));
		}
		}
		
	
	}

