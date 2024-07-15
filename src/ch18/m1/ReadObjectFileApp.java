package ch18.m1;

import java.io.*;

public class ReadObjectFileApp {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			System.out.println("===== Start =====");

			fis = new FileInputStream("C:/Edu_Temp/person.dat");
			ois = new ObjectInputStream(ois);

			for(int i =0; i<2; i++) {
				String name = ois.readUTF();
				int age = ois.readInt();
				System.out.println("이름=" + name + "| 나이=" + age );
			}
			
			fis.close(); ois.close();
	
		} catch (IOException e) {
			System.out.println("\n===== catch() : IOException =====");
			e.printStackTrace();
		} 

	}

}
		
	
		
