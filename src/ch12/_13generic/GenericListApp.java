package ch12._13generic;

import java.util.ArrayList;
import java.util.List;

public class GenericListApp {

	public static void main(String[] args) {
		/*
		System.out.println("===== List =====");
		List list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		for (int i = 0; i < list1.size(); i++) {
			
			Object obj = list1.get(i);
			Integer intObj = (Integer) obj;
			System.out.println("List[" + i + "]=" + intObj);
		}
		*/

		System.out.println("\n===== 제네릭(Generic) =====");

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(50);
		list2.add(60);

		for (int i = 0; i < list2.size(); i++) {
			
			Integer intObj = list2.get(i);

			System.out.println("list[" + i + "]=" + intObj); 
		}

	}

}
