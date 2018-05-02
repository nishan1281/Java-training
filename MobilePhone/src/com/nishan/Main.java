package com.nishan;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("01711 572 894");
    public static void main(String[] args) {
	boolean quit = false;
	startPhone();
	printAction();

	while (!quit)
    {
        System.out.println("\n Enter action. 6 to show available options");
        int action = scanner.nextInt();
        switch (action)
        {
            case 0 :
                System.out.println("Your phone is shutting down");
                quit = true;
                break;

            case 1:
                mobilePhone.printContacts();
                break;

            case 2:
                addNewContact();
                break;

            case 3:
                updateContact();
                break;

            case 4:
                removeContact();
                break;

            case 5:
                queryContact();
                break;

            case 6:
                printAction();
                break;

            default:
                System.out.println("Wrong option is selected. Again select from the below menu");
                printAction();
                break;
        }

    }

    }

    private static void startPhone()
    {
        System.out.println("Phone is loading .....");
    }

    private static void printAction()
    {
        System.out.println("\n available action: \n press");
        System.out.println("0 - to shutdown \n" +
                           "1 - to print contact" +
                           "2 - to add a new contact " +
                           "3 - to update an existing contact" +
                           "4 - to remove an existing contact" +
                           "5 - to query a contact" +
                           "6 - to print a list of available action ");
        System.out.println("Chose your acton: ");

    }
}
