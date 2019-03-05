package com.example.awesomefat.patientrecordexample2;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Core
{
    public static PatientRecord[] thePatients = new PatientRecord[0];
    public static String[] thePatientStrings = new String[1000];
    private static int numberOfPatients = 0;
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef = database.getReference("patients");
    public static PatientRecordArrayAdapter aa;

    public static void listenForDatabaseChanges()
    {
        //async listener
        ValueEventListener prListener = new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                // Get Post object and use the values to update the UI
                System.out.println("****" + dataSnapshot.getValue());

                //goes through each json object contained within
                //the top level datasnapshot and turns it back
                //into a PatientRecord
                Core.numberOfPatients = 0;
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    PatientRecord pr = ds.getValue(PatientRecord.class);
                    Core.addPatientRecordLocal(pr);
                }
                Core.aa.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
                // Getting Post failed, log a message
                System.out.println("loadPost:onCancelled " + databaseError.toException());
            }
        };
        Core.myRef.addValueEventListener(prListener);
    }

    public static void writePatientRecordToFirebase(PatientRecord pr)
    {
        //static context
        Core.myRef.push().setValue(pr);
    }

    public static void addPatientRecordLocal(PatientRecord pr)
    {
        //encapsulated the logic of adding patient records here
        Core.thePatients[Core.numberOfPatients] = pr;
        Core.thePatientStrings[Core.numberOfPatients] = pr.toString();
        Core.numberOfPatients++;
    }

    public static void addPatientRecordDB(PatientRecord pr)
    {
        //Core.addPatientRecordLocal(pr);
        Core.writePatientRecordToFirebase(pr);
    }
}
