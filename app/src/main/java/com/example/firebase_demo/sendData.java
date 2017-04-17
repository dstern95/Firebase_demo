package com.example.firebase_demo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sendData extends AppCompatActivity {

    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;
    String user;
    private final String TAG = "sent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        user = sharedpreferences.getString("user","message");
        user = user.replace(".", "@");
        Log.d(TAG, user);

    }

    public void send(View v)
    {
        if (user != null) {
            Log.d(TAG, "correct info");

            EditText et = (EditText) findViewById(R.id.sentdata);
            String datatosend = et.getText().toString();

            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference(user);

            myRef.setValue(datatosend);
        }
        else {
            Log.d(TAG, "incorrect info");

        }
    }
}
