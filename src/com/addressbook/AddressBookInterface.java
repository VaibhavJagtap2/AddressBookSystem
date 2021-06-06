package com.addressbook;

import java.util.HashMap;

public interface AddressBookInterface {
    public ContactDetail newAddressBook();
    public void printAllDetails();
    public HashMap<Long,ContactDetail> updateValue(long key,ContactDetail AddressBook);
    public void deleteAddress(long key);
}

