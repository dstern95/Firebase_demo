package com.example.firebase_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class sendData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data);
    }

    public void send(View v)
    {
        EditText et = (EditText)findViewById(R.id.sentdata);
        String datatosend = et.getText().toString();


    }
}