package files;

import java.io.*;

public class FileOutputStreamDemo{
	
	public static void main(String[] args) {
		
		Book b = new Book("vikas", "viaks", 2,2);
		File f = new File("E:\\Library.ser");
		try {
		f.createNewFile();
		FileOutputStream fosf = new FileOutputStream(f);
		ObjectOutputStream oosf = new ObjectOutputStream(fosf);
		oosf.writeObject(b);
		oosf.flush();
		oosf.close();
		System.out.println("Serialization is completed");
		}
		catch(Exception e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}
	}
	
}
