package com.example.awesomefat.patientrecordexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PatientRecordAddNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_record_add_new);
    }

    public void onAddButtonPressed(View v)
    {
        EditText firstNameET = (EditText)this.findViewById(R.id.firstNameET);
        EditText lastNameET = (EditText)this.findViewById(R.id.lastNameET);
        EditText middleInitialET = (EditText)this.findViewById(R.id.middleInitialET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);

        String fname = firstNameET.getText().toString();
        String lname = lastNameET.getText().toString();
        char middleInitial = middleInitialET.getText().toString().charAt(0);
        int age = Integer.parseInt(ageET.getText().toString());
        PatientRecord pr = new PatientRecord(fname, lname, middleInitial, age);
        pr.display();
    }
}
