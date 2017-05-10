package com.company;

import java.util.Scanner;

/**
 * Created by BUBBABAIRD on 4/12/17.
 */
public class Person implements Comparable {

    int id;
    String lastName;
    String firstName;
    String email;
    String country;
    String ipAddress;

    public Person(int id, String firstName, String lastName, String email, String country, String ipAddress) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.country = country;
        this.ipAddress = ipAddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return lastName.compareTo(p.lastName);
    }
    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}
