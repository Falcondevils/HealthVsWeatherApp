package com.example.pramod.healthvsweatherapp;

import android.content.Intent;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSubmit, btnCancel;
    String[] languages={"Android ","java","IOS","SQL","JDBC","Web services"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnSubmit = (Button)findViewById((R.id.btn_Submit));
        btnCancel = (Button)findViewById((R.id.btn_Cancel));
        btnSubmit.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        AutoCompleteTextView states = (AutoCompleteTextView)findViewById(R.id.autoCompleteStates);
        AutoCompleteTextView cities = (AutoCompleteTextView)findViewById(R.id.autoCompleteCities);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,languages);
        states.setAdapter(adapter);
        states.setThreshold(1);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Submit:
                break;
            case R.id.btn_Cancel:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }

}
