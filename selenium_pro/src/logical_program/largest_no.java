package logical_program;

public class largest_no {

	public static void main(String[] args)
	{
		int arr[] = { 4, 3, 1045, 666, 22, 55, 234 };
		// System.out.println(arr.length);
		int maximum = arr[0];

		// 0<7 -- True
		// 1<7 -- True
		// 2<7 - True
		// 3<7 -- True

		for (int i = 0; i < arr.length; i++) {
			// 4>4 -- false
			// 3>4 -- False
			// 1045>4 -- True
			// 666>1045 - false
			if (arr[i] > maximum) {
				maximum = arr[i]; // 1045
			}
		}

		System.out.println("Largest number present in given array is :" + maximum);

	}
	}


