package com.example.awesomefat.patientrecordexample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PatientRecord pr = new PatientRecord("Mike", "Litman", 'B', 41);
        pr.display();


    }

    public void onAddPatientRecordPressed(View v)
    {
        Intent i = new Intent(this, PatientRecordAddNewActivity.class);
        this.startActivity(i);
    }
}
