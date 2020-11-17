package ie.gmit.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeEmployee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		Employee employeeObject1 = null;
		File inputByteFile = new File(".\\resources\\employeeByteFile.ser");
		FileInputStream inputByteFileStream = null;
		ObjectInputStream inputByteFileStreamForObjects = null;
		
		//serialization
		try {
			//saving of object to a file
			inputByteFileStream = new FileInputStream(inputByteFile);
			inputByteFileStreamForObjects = new ObjectInputStream(inputByteFileStream);
			
			//method for deserialization of object
			employeeObject1 = (Employee) inputByteFileStreamForObjects.readObject();
			
			inputByteFileStreamForObjects.close();
			inputByteFileStream.close();
			
			System.out.println("Object has been deserialized");	
			System.out.println(employeeObject1.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end try/catch
		
	}//end main
	
}//end class
