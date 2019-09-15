package com.example.clypapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Lobby extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        //Get the name of the user
        if (getIntent().hasExtra("Username")){
            //Set the text
            TextView welcomeT = (TextView) findViewById (R.id.welcomeT);

            String name = getIntent().getExtras().getString("Username");
            welcomeT.setText("Welcome " + name + "!");
        }
    }
}
