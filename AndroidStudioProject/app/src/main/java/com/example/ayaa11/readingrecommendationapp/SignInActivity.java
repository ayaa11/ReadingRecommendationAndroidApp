package com.example.ayaa11.readingrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {
    EditText ET_USER_EMAIL, ET_USER_PASS;
    String login_email, login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        ET_USER_EMAIL = (EditText)findViewById(R.id.email);
        ET_USER_PASS = (EditText)findViewById(R.id.password);
    }

    public void userLogin(View view) {
//        login_email = ET_USER_EMAIL.getText().toString();
//        login_password = ET_USER_PASS.getText().toString();
//
//        String method = "login";
//        BackgroundTask backgroundTask = new BackgroundTask(this);
//        backgroundTask.execute(method,login_email,login_password);

        startActivity(new Intent(this, StartActivity.class));
    }

    public void userReg(View view) {
        startActivity(new Intent(this, SignUpActivity.class));
    }
}