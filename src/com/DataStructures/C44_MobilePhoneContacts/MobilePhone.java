package com.DataStructures.C44_MobilePhoneContacts;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) return false;
        return myContacts.add(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact)  < 0) return false;
        else if (findContact(oldContact.getName()) < 0) return false;
        myContacts.set(myContacts.indexOf(oldContact), newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) < 0) return false;
        return myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name))
                return i;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name))
                return contact;
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.printf("%d. %s -> %s%n", i + 1, contact.getName(), contact.getPhoneNumber());
        }
    }
}
