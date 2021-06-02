package files;

import java.io.*;
public class FileInputStreamDemo {

	public static void main(String[] args) {
		File f =new File("E:\\Library.txt");
		FileInputStream fis ;
		ObjectInputStream ois;
		try {
			fis= new FileInputStream(f);
			ois= new ObjectInputStream(fis);
			Book b = (Book)ois.readObject();
			System.out.println(b.toString());
		}
		catch(Exception e ) {
			System.out.println("Terminated");
		}
		
			
			
	}

}
