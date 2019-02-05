package com.example.awesomefat.patientrecordexample2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("****** ON CREATE!!!!!!");

        String[] bibleBooks = {"Matthew", "Mark", "Luke", "John", "Acts"};
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_view_row, bibleBooks);
        ListView lv = (ListView)this.findViewById(R.id.listView);
        lv.setAdapter(aa);
        lv.invalidateViews(); //this line forces a list view to refresh!!!! hint hint


    }

    @Override
    protected void onResume()
    {
        super.onResume();
        System.out.println("****** ON RESUME!!!!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("****** ON START!!!!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("****** ON PAUSE!!!!!!");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("****** ON STOP!!!!!!");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("****** ON RESTART!!!!!!");

    }

    public void onAddPatientRecordPressed(View v)
    {
        Intent i = new Intent(this, PatientRecordAddNewActivity.class);
        this.startActivity(i);
    }
}
