package com.atnt.demo.demo.basics;

// private
// public
// default
// package

// POJO --> Plain Old Java Object
// Model

// Take Inputs and respond with a respose
// Taking and excel and sending list of pupils with outstanding fee
// Control --> controller

// controller --> creates the POJO's, passes on the information to a handler
// handler --> service
// Services --> perform action on the list of POJO and gives a response
// Performing actions --> Business logic

// Get me the list of students having outstnadingfee for the department CS

// Controller --> departmentId
// service --> departmentId
// DB (Database) --> dao (data access object) layer
// DAO -> send List of Students to service
// We go through list of students, filter out for whom outstandingfee > 0
// We pass on the message to Controller
// Controller will respond with list of students


// Constructor
// this, super
// Composition
// inheritance
// Collections

// List or Array   (ArrayList)
// Map --> HashMap (Hashing)


// MVC Architecture

/*
Student

// lookup

dept
id             name
1               CS


id firstname lastname email              deptId
1   A          F          a@f.com         1
2   B          G          b@g.com         1
3   C          H                          1
4   D          I

* */

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Department department;
    private Address address;
    private int year;
    private String semester;
    private boolean isActiveInSports; // true or false
    private Double feeOutstanding; // float
    private boolean isAlumni;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student() {
    }

    public Student(int id, String firstName, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }


}
