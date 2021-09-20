package AddressBook;

import java.util.Scanner;

public class Application extends Person{
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
//		Corgie c1 = new Corgie();
//		c1.setAge(3);
//		c1.setBigEars(true);
//		c1.setCorgieHgt(8.8);
		Address a1 = new Address("123 Trenton St", "Cahokia", "IL", "62226", "123 Trenton St Cahokia IL 62226");
		PhoneNumber n1 = new PhoneNumber(17576457370l);
		Person p1 = new Person("Spencer", "Best", "Foxtrot", "Spencer Foxtrot Best", a1);

		System.out.print(p1.getAddress()); 
		System.out.print(n1.getPhoneNumber());
		
		
		
		
		
		menu();
		int menuChoice = input.nextInt();
		menuMain(menuChoice);
		String quit = "";

		do {
			quit = input.next();
			if(quit.equals("1, 2, 3, 4")) {
				menu();
				menuChoice = input.nextInt();
				menuMain(menuChoice);
			} else {
				System.out.println("Goodbye!");
			}
			
		} while (quit.equals("N"));

	}	
	public static void menu() {
		System.out.println("--------------Phonebook------------");
		System.out.println("-----Select From the Directory-----");
		System.out.println("1. Add Contact");		
		System.out.println("2. Search Database");
		System.out.println("3. Update Existing");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.print("Enter your choice here: ");
		System.out.print("___________");
		int menuChoice = input.nextInt();
	}
	public static void menuMain(int menuChoice) {
//		System.out.println("Enter the new contact information, or type 0 to exit: \n"
//				+ "Example (John Michael West Doe, 574 Pole Ave, St. Peters, MO, 63333, 5628592375)\n");			
//		String newEntryText = in.nextLine();
//		
//		if(newEntryText.charAt(0) == '0') {
//			selection = -1; 
//			break;
//			}
			switch (menuChoice) {
			case 1:
			System.out.println("Enter First Name: ");
			String newPerson = input.nextLine();
			Person p2 = new Person();
			
			
			
			
			
				
				
				break;
			case 2:
			
				
				
				
				break;
			case 3:
			
				
				
				
				
				
				break;
			case 4:
		
				
				
				
				
				break;
			default:
				System.out.println("Goodbye!");
	
	
}
		
		
		
		//		menu();
//		int menuChoice = input.nextInt();
//		menuMain(menuChoice);
//		String quit = "";
//
//		do {
//			
//			System.out.print("Are you satisfied with your selection? Enter 'Y' or 'N': ");
//			quit = input.next();
//			if(quit.equals("N")) {
//				menu();
//				menuChoice = input.nextInt();
//				menuMain(menuChoice);
//			} else {
//				System.out.println("Thank you for your selection!");
//			}
//			
//		} while (quit.equals("N"));
//		
//	}
//	public static void menu() {
//		System.out.println("-------Phone and Address Book-------");
//		System.out.println("--PLEASE SELECT FROM THE FOLLOWING--");
//		System.out.println("1. ADD A NEW PERSON!");
//		System.out.println("2. ADD");
//		System.out.println("3. Delete a dog from the registry");
//		System.out.println("4. Exit the program");
//		System.out.print("Enter your choice here: ");
//		int menuChoice = input.nextInt();
//		System.out.println();
//	}
//		public static void menuMain(int menuChoice) {
//			
//			switch (menuChoice) {
//			case 1:
//				System.out.println("*****DRINK CHOICES*****");
//				System.out.println("Enter 1 for Coca-Cola");
//				System.out.println("Enter 2 for Busch");
//				System.out.println("Enter 3 for Sweet Tea");
//				System.out.println("Enter 4 for Lemonade");
//				System.out.print("Enter your choice here: ");
//				int drinkChoice = input.nextInt();
//				break;
//			case 2:
//				System.out.println("*********************");
//				System.out.println("*****APPETIZERS*****");
//				System.out.println("Mozzarella Sticks");
//				System.out.println("Nachos Supreme");
//				System.out.println("Potato Skins");
//				System.out.println("Bloomin' Onion");
//				System.out.print("Enter your choice here: ");
//				int appChoice = input.nextInt();
//				break;
//			case 3:
//				System.out.println("*********************");
//				System.out.println("*****ENTREES*****");
//				System.out.println("Ribeye");
//				System.out.println("Impossible Burger");
//				System.out.println("Salmon");
//				System.out.println("Supreme Pizza");
//				System.out.print("Enter your choice here: ");
//				int entChoice = input.nextInt();
//				break;
//			case 4:
//				System.out.println("*********************");
//				System.out.println("******DESSERTS*******");
//				System.out.println("Chocolate Covered Cicadas");
//				System.out.println("New York Style Cheesecake");
//				System.out.println("Chocolate Lava Cake");
//				System.out.println("Pie a la Mode");
//				System.out.print("Enter your choice here: ");
//				int dessChoice = input.nextInt();
//				break;
//			case 5:
//				System.out.println("*********************");
//				System.out.println("******SPECIALS*******");
//				System.out.println("2 For 1 Special");
//				System.out.println("Chef's Choice");
//				System.out.println("Soup of the Day");
//				System.out.println("Happy Hour");
//				System.out.print("Enter your choice here: ");
//				int specChoice = input.nextInt();
//				break;
//			default:
//				System.out.println("*********************");
//				System.out.println("Please enter a value between 1 and 5");
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

		}
