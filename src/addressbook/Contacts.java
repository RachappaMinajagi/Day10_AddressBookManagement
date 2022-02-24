package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

	public Contacts(String firstName, String lastName, String address, String city, String state, int zipcode,
			String phoneNo, String email) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the address book system");
		ArrayList<Contacts> array = new ArrayList<Contacts>();
		try (Scanner sc = new Scanner(System.in)) {
			try (Scanner sc1 = new Scanner(System.in)) {
				int choice;
				do {
					System.out.println("1.INSERT");
					System.out.println("2.DISPLAY");
					System.out.println("Enter your choice");
					choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.print("Enter First Name: ");
						String firstName = sc1.nextLine();
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
						Contacts contact = new Contacts(firstName, lastName, address, city, state, zipcode, phoneNo,
								email);
						array.add(contact);
						break;
					case 2:
						System.out.println(array);
						break;
					}
				} while (choice != 0);
				System.out.println("Invalid Choice!!!");
			}
		}
	}
}