package com.example.awesomefat.patientrecordexample2;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PatientRecordArrayAdapter extends ArrayAdapter
{

    private Context mContext;
    private PatientRecord[] patientRecordList = new PatientRecord[1000];
    private int textViewResourceId;
    public PatientRecordArrayAdapter(Context context, int textViewResourceId, PatientRecord[] list)
    {
        super(context, textViewResourceId , list);
        mContext = context;
        patientRecordList = list;
        this.textViewResourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(this.textViewResourceId,parent,false);

        PatientRecord pr = this.patientRecordList[position];
        TextView nameTV = (TextView)listItem.findViewById(R.id.nameTV);
        TextView ageTV = (TextView)listItem.findViewById(R.id.ageTV);

        nameTV.setText(pr.getNameString());
        ageTV.setText(pr.getAgeString());
        return listItem;
    }
}
