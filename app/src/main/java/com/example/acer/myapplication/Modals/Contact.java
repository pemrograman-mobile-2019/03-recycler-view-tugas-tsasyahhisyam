package com.example.acer.myapplication.Modals;

import java.util.ArrayList;

public class Contact {
    private String mNama;
    private Boolean mOnline;

    public Contact(String mNama, Boolean mOnline) {
        this.mNama = mNama;
        this.mOnline = mOnline;
    }

    public String getmNama() {
        return mNama;
    }

    public Boolean getmOnline() {
        return mOnline;
    }
    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }
}
