package AddressBook;

public class Person {
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String fullName;
	private Address address;
	
	
	public Person() {
	}
	
	
	
	public Person(String firstName, String lastName, String middleName, String fullName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.fullName = fullName;
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", fullName=" + fullName + ", address=" + address + "]";
	}
	
	
}
