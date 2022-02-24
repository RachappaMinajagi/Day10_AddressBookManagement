package addressbook;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to the address book system");
		ArrayList<Contacts> array = new ArrayList<Contacts>();
		try (Scanner sc = new Scanner(System.in)) {
			try (Scanner sc1 = new Scanner(System.in)) {
				int choice;
				do {
					System.out.println("1.INSERT" + "\n2.DISPLAY" + "\n3.EDIT");
					System.out.println("Enter your 1st choice");
					choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.print("Enter First Name: ");
						String firstName1 = sc1.nextLine();
						System.out.print("Enter last Name: ");
						String lastName = sc1.nextLine();
						System.out.print("Enter your address: ");
						String address = sc1.nextLine();
						System.out.print("Enter your city: ");
						String city = sc1.nextLine();
						System.out.print("Enter your state: ");
						String state = sc1.nextLine();
						System.out.print("Enter zip code : ");
						int zipcode = sc.nextInt();
						System.out.print("Enter phone number: ");
						String phoneNo = sc1.nextLine();
						System.out.print("Enter your email: ");
						String email = sc1.nextLine();
						Contacts contact = new Contacts(firstName1, lastName, address, city, state, zipcode, phoneNo,
								email);
						array.add(contact);
						break;
					case 2:
						System.out.println(array);
						break;
					case 3:
						boolean found = false;
						System.out.println("Enter first name of the person for update ");
						firstName1 = sc1.nextLine();
						System.out.println("------------------------------------");

						ListIterator<Contacts> listIterator = array.listIterator();
						/*
						 * It is a java iterator which is used to traverse all types of lists including
						 * ArrayList, Vector, LinkedList, Stack
						 */

						while (listIterator.hasNext()) {
							contact = listIterator.next();
							// condition if firstname matches
							if (contact.getFirstName().equals(firstName1)) {

								System.out.print("Enter new first Name: ");
								firstName1 = sc1.nextLine();
								
								System.out.print("Enter new last Name: ");
								lastName = sc1.nextLine();
								
								System.out.print("Enter your new address: ");
								address = sc1.nextLine();
								
								System.out.print("Enter your new city: ");
								city = sc1.nextLine();
								
								System.out.print("Enter your state: ");
								state = sc1.nextLine();
								
								System.out.print("Enter zip code : ");
								zipcode = sc.nextInt();
								
								System.out.print("Enter phone number: ");
								phoneNo = sc1.nextLine();
								
								System.out.print("Enter your eMail ID: ");
								email = sc1.nextLine();
								listIterator.set(new Contacts(firstName1, lastName, address, city, state, zipcode,
										phoneNo, email));
								found = true;
							}
						}
						System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

						if (!found) {
							System.out.println("Record not found");// o/p for mismatch first name
						} else {
							System.out.println("Record is updated successfully");
						}
						System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						break;
					default:
						System.out.println("default");

					}
				} while (choice != 0);
				System.out.println("Invalid Choice!!");
			}
		}
	}
}