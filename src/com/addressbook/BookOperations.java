package com.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class BookOperations implements AddressBookInterface{
    HashMap<Long, ContactDetail> addressBookContainer = new HashMap<Long, ContactDetail>();
    Scanner input = new Scanner(System.in);

    public HashMap<Long, ContactDetail> save(long phoneNumber, ContactDetail newAddressBook) {
        addressBookContainer.put(phoneNumber, newAddressBook);
        return addressBookContainer;
    }

    @Override
    public ContactDetail newAddressBook() {
        ContactDetail newAddressBook = new ContactDetail();
        System.out.println("Enter the First Name");
        String firstName = input.next();
        System.out.println("Enter the Last Name");
        String lastName = input.next();
        System.out.println("Enter The Address");
        String address = input.next();
        System.out.println("Enter the city");
        String city = input.next();
        System.out.println("Enter the state");
        String state = input.next();
        System.out.println("Enter the zip Code");
        int zip = input.nextInt();
        System.out.println("Enter the Phone number");
        long phone = input.nextLong();
        newAddressBook.setFirstName(firstName);
        newAddressBook.setLastName(lastName);
        newAddressBook.setAddress(address);
        newAddressBook.setCity(city);
        newAddressBook.setState(state);
        newAddressBook.setZip(zip);
        newAddressBook.setPhone(phone);
        return newAddressBook;
    }

}

