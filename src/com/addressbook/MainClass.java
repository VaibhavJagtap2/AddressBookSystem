package com.addressbook;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Welcome To The AddressBook System");
        Scanner scan = new Scanner(System.in);
        ContactDetail contactPerson = new ContactDetail();
        BookOperations bookOperations = new BookOperations();
        boolean terminate = false;
        while (terminate != true) {
            System.out.println("1. for add new Address");
            System.out.println("2.: Print ALl information");
            System.out.println("3.: Update the Information");
            System.out.println("4. Number to Delete");
            int option = scan.nextInt();
            switch (option){
                case 1:
                    contactPerson = bookOperations.newAddressBook();
                    System.out.println(bookOperations.save(contactPerson.getPhone(),contactPerson));
                    break;
                case 2:
                    bookOperations.printAllDetails();
                    break;
                case 3:
                    System.out.println("Enter the Phone  Number to update:");
                    long key = scan.nextLong();
                    contactPerson = bookOperations.newAddressBook();
                    bookOperations.updateValue(key, contactPerson);
                    break;
                case 4:
                    System.out.println("Enter Number To Delete");
                    long phoneToDelete = scan.nextLong();
                    bookOperations.deleteAddress(phoneToDelete);
                    break;
                default:
                    System.out.println("Please Select valid option");
                    break;
            }
        }
    }
}

