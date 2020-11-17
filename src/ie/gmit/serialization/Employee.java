package ie.gmit.serialization;

import java.io.Serializable;

class Employee implements Serializable {
	/*Using during deserialization to verify that the sender and receiver 
	 * of a serialized object have loaded classes for that object that are compatible
	 * with respect to serialization. If the receiver has loaded a class for the object
	 * that has a different serialVerionUID that of corresponding
	 * senders class, than deserialization will result in InvalidClassException. 
	 */
	private static final long serialVersionUID =1L;
	
	//instance variable
	private String surname;
	private transient String ppsn; //transient - is not serialized because is pps number which we want keep private
	
	//constructor
	public Employee(String ppsn, String surname) {
		this.ppsn = ppsn;
		this.surname = surname;
	}
	//getters and setters
	public String getPpsn() {
		return ppsn;
	}
	public void setPpsn(String ppsn) {
		this.ppsn = ppsn;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Employee [ppsn=" + ppsn + ", surname=" + surname + "]";
	}
}//end class
