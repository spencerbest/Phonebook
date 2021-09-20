package AddressBook;

public class Address {
	
	private String streetNumber;
	private String city;
	private String state;
	private String zipCode;
	private String fullAddress;
	
	public Address() {
	}
	
	
	
	public Address(String streetNumber, String city, String state, String zipCode, String fullAddress) {
		this.streetNumber = streetNumber;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.fullAddress = fullAddress;
	}



	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String street) {
		this.streetNumber = street;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = this.streetNumber + ", " + this.city + ", " + this.state + ", " + this.zipCode;
	}



	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", fullAddress=" + fullAddress + "]";
	}
	
	

	
	
	
}
