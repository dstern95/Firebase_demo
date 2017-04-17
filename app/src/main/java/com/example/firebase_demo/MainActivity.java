package com.example.firebase_demo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("user", "message");
        editor.commit();

    }

    public void send(View v)
    {
        Intent intent1 = new Intent(this, sendData.class);
        startActivity(intent1);
    }
    public void get(View v)
    {
        Intent intent1 = new Intent(this, getData.class);
        startActivity(intent1);
    }
    public void login(View v)
    {
        Intent intent1 = new Intent(this, login.class);
        startActivity(intent1);
    }

}
