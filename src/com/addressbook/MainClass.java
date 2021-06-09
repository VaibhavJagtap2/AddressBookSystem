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
            System.out.println("4.: Number to Delete");
            System.out.println("5.: To Sort The Contacts By First Name");
            System.out.println("6.: To Sort By Zip ");
            System.out.println("7.: Search by City");
            System.out.println("8.: Search Cy State");
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
                case 5:
                    bookOperations.sortByfirstName();
                    break;
                case 6:
                    bookOperations.sortByZip();
                    break;
                case 7:
                    System.out.println("enter the City to Search");
                    String inputcity = scan.next();
                    bookOperations.searchByCity(inputcity,contactPerson);
                    break;
                case 8:
                    System.out.println("Enter the State to Search");
                    String inputState = scan.next();
                    bookOperations.searchByState(inputState,contactPerson);
                    break;
                    default:
                    System.out.println("Please Select valid option");
                    break;

            }
        }
    }
}

