package com.example.firebase_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View v)
    {

        EditText ut = (EditText)findViewById(R.id.usernamedata);
        String user = ut.getText().toString();


        EditText pt = (EditText)findViewById(R.id.passdata);
        String pass = pt.getText().toString();

    }

}
