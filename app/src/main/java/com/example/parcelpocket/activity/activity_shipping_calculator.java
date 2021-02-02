package com.example.parcelpocket.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.parcelpocket.R;

public class activity_shipping_calculator extends AppCompatActivity {
    String[] country ={"India","Bangladesh","Sri-Lanka","US","UAE"};
    String[] type ={"Self","Business","Other"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping_calculator);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,country);
        AutoCompleteTextView actv =  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView_sc);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);

        ArrayAdapter<String> select = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,type);
        AutoCompleteTextView autoCompleteTextView_type =  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView_type);
        autoCompleteTextView_type.setThreshold(1);//will start working from first character
        autoCompleteTextView_type.setAdapter(select);
    }
}