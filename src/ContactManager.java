import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;


public class ContactManager {
	// variables
	ArrayList<Contact> contactList;
	Scanner scnr = new Scanner(System.in); // for reading in info from user
	
	
	// constructor - just creates ArrayList when called
	public ContactManager() {
		contactList = new ArrayList<Contact>();
	}
	
	// add a contact
	// assuming that when calling method, user provides arguments for contact constructor
	public void addContact(String first, String last, String bday, String company, String phone, String email, String address, boolean fav, boolean block, boolean emergency) {
		Contact temp = new Contact(first, last, bday, company, phone, email, address, fav, block, emergency);
		contactList.add(temp);
	}

	public void addContact(ArrayList<Contact> contacts) {
		contactList.addAll(contacts);
	}
	
	// remove contact
	// assuming that when calling method, user provides the index of contact to remove
	public void removeContact(int index) {
		try {
			contactList.remove(index);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Please enter a valid index #.");
		}
	}

	public void readFile() throws FileNotFoundException {
		this.contactList.addAll(FileHandler.printFile());
	}
	
	// view contact
	// assuming that when calling method, user provides the index of contact to view
	public void viewContact(int index) {
		try {
			contactList.get(index).printInfo();
			System.out.println("----------------------------");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Please enter a valid index #.");
		}
	}
	
	// view all contacts
	public void viewAllContacts() {
		for (int i = 0; i < contactList.size(); i++) {
			contactList.get(i).printInfo();
			System.out.println("----------------------------");
		}
	}
	
	// edit contact
	// assuming that when calling method, user provides the index of contact to edit
	// when calling the method, user will be given choices
	public void editContact(int index) {
		System.out.println("Now editing the following contact..."); 
		this.viewContact(index);
		
		System.out.println("What info would you like to edit?");
		System.out.println("1: First Name");
		System.out.println("2: Last Name");
		System.out.println("3: Birthday");
		System.out.println("4: Company");
		System.out.println("5: Phone");
		System.out.println("6: Email");
		System.out.println("7: Address");


		// making sure they have a valid option
		// TODO: fix error checking
		int userNum;
		try {
			userNum = scnr.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Error! Please enter a valid number.");
			return;
		}
		
		// check range
		if (userNum < 0 || userNum > 7) {
			System.out.println("Error! Please enter a valid option.");
			return;
		}
		
		// now edit contact
		switch (userNum) {
			case 1:
				System.out.print("Enter new First Name: ");
				contactList.get(index).setFirstName( scnr.next() );
				break;
			case 2:
				System.out.print("Enter new Last Name: ");
				contactList.get(index).setLastName( scnr.next() );
				break;
			case 3:
				System.out.print("Enter new Birthday: ");
				contactList.get(index).setBirthday( scnr.next() );
				break;
			case 4:
				System.out.print("Enter new Company: ");
				contactList.get(index).setCompany( scnr.next() );
				break;
			case 5:
				System.out.print("Enter new Phone: ");
				contactList.get(index).setPhone( scnr.next() );
				break;
			case 6:
				System.out.print("Enter new Email: ");
				contactList.get(index).setEmail( scnr.next() );
				break;
			case 7:
				System.out.print("Enter new Address: ");
				contactList.get(index).setAddress( scnr.next() );
				break;
		}
	}
	
	// sort contactList
	// when calling method, will sort alphabetically
	public void sortContacts() {
		Collections.sort(contactList, (Contact c1, Contact c2) -> (c1.compareTo(c2)));
	}
	
	// search contactList
	// searches by first and last name 
	public boolean searchContacts(String first, String last) {
		
		for (int i = 0; i < contactList.size(); i++) {
			if ( contactList.get(i).getFirstName().equals(first) ) {
				if ( contactList.get(i).getLastName().equals(last) ) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	
}
