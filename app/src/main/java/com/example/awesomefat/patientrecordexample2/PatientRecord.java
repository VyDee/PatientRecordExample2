package com.example.awesomefat.patientrecordexample2;

public class PatientRecord
{
    //Fields
    private String first_name;
    private String last_name;
    private char middle_initial;
    private int age;

    //Constructor
    public PatientRecord(String first_name, String last_name, char middle_initial, int age)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_initial = middle_initial;
        this.age = age;
    }

    public void display()
    {
        //System.out.println(this.first_name + " " + this.middle_initial + " " + this.last_name + " (" + this.age + ")");
        System.out.format("%s %c %s (%d)", this.first_name, this.middle_initial, this.last_name, this.age);
    }

    //Getter/Setter Methods
    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        if(age >= 1)
        {
            this.age = age;
        }
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public char getMiddle_initial() {
        return middle_initial;
    }
}
