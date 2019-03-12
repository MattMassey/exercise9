package com.company.week1;

//Matthew Massey, 3/12/2019
//CSCI-1660, program demonstrates abstract classes

public class Main {

    public static void main(String[] args) {
        Contact me = new EmailContact("Matthew", "totallyRealEmail@yahoo.com"); //Don't @ me
        me.contact(); //Dangit
        Contact alsoMe = new PhoneContact("Matt", "614-123-3456");
        alsoMe.contact();
    }
}

abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public abstract void contact(); //Method to be filled in by subclasses
}


class EmailContact extends Contact{
    private String email;

    public EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("emailing " + email); //emails the address
    }
}


class PhoneContact extends Contact {
    private String phoneNum;

    public PhoneContact(String name, String phoneNum) {
        super(name);
        this.phoneNum = phoneNum;
    }

    @Override
    public void contact() {
        System.out.println("Calling " + phoneNum); //Calls the phone number
    }
}