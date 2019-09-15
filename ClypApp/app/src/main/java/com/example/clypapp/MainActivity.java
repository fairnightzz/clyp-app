package com.example.clypapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Register
        Button registerBtn = (Button) findViewById(R.id.registerBtn);
        //Assign an onclick listener for the button
        registerBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Register.class);
                //pass info
                startActivity(startIntent);
            }
        });


        //Logging In
        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),Lobby.class);
                //pass username
                EditText emailInput = (EditText) findViewById(R.id.emailInput);
                EditText passwordInput = (EditText) findViewById(R.id.passwordInput);
                //I need to pass this through the firebase API
                String user = emailInput.getText().toString();
                startIntent.putExtra("Username",user);
                startActivity(startIntent);
            }
        });
    }



}
