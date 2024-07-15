package ch18.ex2;

import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");
			
			byte[] array = { 10, 20, 30 };
			
			os.write(array);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
