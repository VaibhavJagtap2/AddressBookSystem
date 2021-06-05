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
             int option = scan.nextInt();
             switch (option){
                 case 1:
                     contactPerson = bookOperations.newAddressBook();
                     System.out.println(bookOperations.save(contactPerson.getPhone(),contactPerson));
                     break;

                 default:
                     System.out.println("Please Select valid option");
                     break;
             }
         }
    }
}
