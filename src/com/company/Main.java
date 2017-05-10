package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> listOfPeople = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(new File("people.csv")));
        String eachLine;

        br.readLine();

        while ((eachLine = br.readLine()) != null) {
            String[] columns = eachLine.split(",");
            Person sim = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            listOfPeople.add(sim);
        }
        Collections.sort(listOfPeople);
        System.out.println(listOfPeople);
    }
}

    // PPAndSorting - Instructions:
    // Create a Person class to store all the columns in the csv file.
    // Create an ArrayList<Person> that stores a list of people from the CSV file.

    // Sort the ArrayList by last name.
    // Override toString in the Person class to print out a nicely-formatted string
    // for that person (something like "Martha Jenkins from France").
    // Print out each element in the ArrayList


    // is sim1 supposed to be the same as sim2?
    // %s, %d, etc
    // understand what's going on in the code during the while statement
