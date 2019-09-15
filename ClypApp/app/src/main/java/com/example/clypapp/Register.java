package com.example.clypapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerR = (Button) findViewById(R.id.registerR);
        registerR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText usernameInput = (EditText) findViewById(R.id.usernameR);
                EditText emailInput = (EditText) findViewById(R.id.emailR);
                EditText passwordInput = (EditText) findViewById(R.id.passwordR);
                //Create firebase database
                Intent startIntent = new Intent(getApplicationContext(),Lobby.class);
                String name = usernameInput.getText().toString();
                startIntent.putExtra("Username",name);
                startActivity(startIntent);
            }
        });
    }
}
