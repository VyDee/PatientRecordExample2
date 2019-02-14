package com.example.awesomefat.patientrecordexample2;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Core
{
    public static PatientRecord[] thePatients = new PatientRecord[1000];
    public static String[] thePatientStrings = new String[1000];
    private static int numberOfPatients = 0;
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();

    public static void writePatientRecordToFirebase(PatientRecord pr)
    {
        DatabaseReference myRef = database.getReference("patients");
        myRef.push().setValue(pr);
    }
    
    public static void addPatientRecord(PatientRecord pr)
    {
        //encapsulated the logic of adding patient records here
        Core.thePatients[Core.numberOfPatients] = pr;
        Core.thePatientStrings[Core.numberOfPatients] = pr.toString();
        Core.numberOfPatients++;
    }
}
