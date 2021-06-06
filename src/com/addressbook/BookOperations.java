package com.addressbook;

import java.util.*;

public class BookOperations implements AddressBookInterface {
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
        @Override
        public void printAllDetails(){
            Set keys = addressBookContainer.keySet();
            Iterator iterate = keys.iterator();
            Collection<ContactDetail> getValues = addressBookContainer.values();
            iterate = getValues.iterator();
            while (iterate.hasNext()){
                System.out.println("Details are : " + iterate.next());
            }
        }
        @Override
        public HashMap updateValue(long key, ContactDetail newaddressBook){
            if(addressBookContainer.containsKey(key) == false){
                System.out.println("Key Not Found");
            }
            else if (addressBookContainer.containsKey(key) == true){
                addressBookContainer.put(key, newaddressBook);
                System.out.println("Values Updated");
            }
            return addressBookContainer;
        }
        @Override
        public void deleteAddress(long key){
            if (addressBookContainer.containsKey(key) == false){
                System.out.println("Invalid Key !!!!");
            }
            else {
                addressBookContainer.remove(key);
                System.out.println(key + "Delete Successfully");
            }
        }
}
