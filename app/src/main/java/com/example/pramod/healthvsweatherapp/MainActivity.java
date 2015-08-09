package com.example.pramod.healthvsweatherapp;

import android.content.Intent;
import android.renderscript.Int3;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    Button btnLogin, btnRegister;
    EditText txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById((R.id.btn_SignIn));
        btnRegister = (Button)findViewById((R.id.btn_Register));
        txtUsername = (EditText)findViewById((R.id.txtUsername));
        txtPassword = (EditText)findViewById((R.id.txtPassword));
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_SignIn:
                String strUsername = txtUsername.getText().toString();
                String strPwd = (txtPassword.getText()).toString();
                break;
            case R.id.btn_Register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
