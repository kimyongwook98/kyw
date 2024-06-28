package ch07;

public class Array {

	public static void main(StringArray_1[] args) {
		int[] intArray;
		
		intArray = new int[2];
		
		intArray[0] = 1;
		intArray[1] = 2;
		
		System.out.println("-output-");
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		
		System.out.println("-output:length-");
		int arrayLength = intArray.length;
		System.out.println("배열길이=" + arrayLength);
		
		System.out.println("-for()-");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("intArray[" + i + "]");
			System.out.println(intArray[i]);
		}
	}

}
