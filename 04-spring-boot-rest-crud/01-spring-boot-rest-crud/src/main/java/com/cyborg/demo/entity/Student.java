package com.cyborg.demo.entity;

public class Student {
    private String firstName;
    private String Lastname;

    public Student() {
    }

    public Student(String firstName, String lastname) {
        this.firstName = firstName;
        Lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
