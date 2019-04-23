package com.example.ayaa11.readingrecommendationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    String name, email;
    TextView user_name, user_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        user_name = (TextView) findViewById(R.id.username);
        user_email = (TextView) findViewById(R.id.email);

        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");

        user_name.setText("Hello "+ name);
        user_email.setText("Your email is "+ email);
    }
}
