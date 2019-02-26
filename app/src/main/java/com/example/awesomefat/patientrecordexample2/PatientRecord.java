package com.example.awesomefat.patientrecordexample2;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

//Serializable needed by Firebase - means this class can be converted to JSON
public class PatientRecord implements Serializable
{
    //Fields
    public String first_name;
    public String last_name;
    public int middle_initial; //Firebase doesn't support serializable chars
    public int age;

    //Constructor

    public PatientRecord(String first_name, String last_name, char middle_initial, int age)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_initial = middle_initial;
        this.age = age;
    }

    public PatientRecord()
    {
        this.first_name = "FNAME";
        this.middle_initial = 'I';
        this.last_name = "LNAME";
        this.age = 0;
    }


    @Exclude
    public String getNameString()
    {
        //non-static context
        return this.first_name + " " + this.middle_initial + " " + this.last_name;
    }

    @Exclude
    public String getAgeString()
    {
        return "Age: (" + this.age + ")";
    }


    @Exclude
    public String toString()
    {
        return this.first_name + " " + this.middle_initial + " " + this.last_name + " (" + this.age + ")";
    }

    @Exclude
    public void display()
    {
        System.out.println(this.first_name + " " + this.middle_initial + " " + this.last_name + " (" + this.age + ")");
        //System.out.format("%s %c %s (%d)", this.first_name, this.middle_initial, this.last_name, this.age);
    }

    //Getter/Setter Methods
    @Exclude
    public int getAge()
    {
        return this.age;
    }

    @Exclude
    public void setAge(int age)
    {
        if(age >= 1)
        {
            this.age = age;
        }
    }

    @Exclude
    public String getFirst_name() {
        return first_name;
    }

    @Exclude
    public String getLast_name() {
        return last_name;
    }

    @Exclude
    public char getMiddle_initial() {
        return (char)middle_initial;
    }
}
