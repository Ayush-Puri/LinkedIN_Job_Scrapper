package com.REST.API.DEMO.REST.API.DEMO.Util;

public class Student {
    public String FirstName;
    public String LastName;


    public Student(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

}
