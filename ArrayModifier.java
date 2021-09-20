package AddressBook;

public class ArrayModifier {

	
	
Person[] phoneBook = new Person[0];

	public void addcontact(Person newPerson) {
	          
		Person[] temp = new Person[phoneBook.length + 1];                                                                       
	          for (int i = 0; i < phoneBook.length; i++) {  
	          	temp[i] = phoneBook[i];                   
		      	                                     
		      }    
	          temp[temp.length - 1] = newPerson;                                                                               
	          phoneBook = temp;
	}		
	
	public Person[] getArrayModifier() {
		return phoneBook;
	}	
	





}

