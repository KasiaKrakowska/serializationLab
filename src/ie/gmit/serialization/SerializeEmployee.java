package ie.gmit.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeEmployee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		
		Employee employeeObject1 = new Employee("G1234566", "Green");
		File outputByteFile = new File(".\\resources\\employeeByteFile.ser");
		FileOutputStream outputByteFileStream = null;
		ObjectOutputStream outputByteFileStreamForObjects = null;
		//print out employee Fields
		System.out.println(employeeObject1.toString());
		
		//serialization
		try {
			//saving of object to a file
			outputByteFileStream = new FileOutputStream(outputByteFile);
			outputByteFileStreamForObjects = new ObjectOutputStream(outputByteFileStream);
			
			//method for serialization of object
			outputByteFileStreamForObjects.writeObject(employeeObject1);
			
			outputByteFileStreamForObjects.close();
			outputByteFileStream.close();
			System.out.println("Object has been serialized");			
		} catch (IOException ex) {
			System.out.println("IOException is cought");
		}//end try/catch
	}//end main
	

}//end class
