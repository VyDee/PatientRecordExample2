package com.example.awesomefat.patientrecordexample2;

public class Core
{
    private static PatientRecord[] thePatients = new PatientRecord[1000];
    private static int numberOfPatients = 0;

    public static void addPatientRecord(PatientRecord pr)
    {
        //encapsulated the logic of adding patient records here
        Core.thePatients[Core.numberOfPatients] = pr;
        Core.numberOfPatients++;
    }
}
