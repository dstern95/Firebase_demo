package com.example.firebase_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View v)
    {
        Intent intent1 = new Intent(this, LoginTest.class);
        startActivity(intent1);
    }
    public void get(View v)
    {
        Intent intent1 = new Intent(this, getData.class);
        startActivity(intent1);
    }

}
