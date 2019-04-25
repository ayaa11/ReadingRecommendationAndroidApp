package com.example.ayaa11.readingrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText ET_USER_NAME, ET_USER_EMAIL, ET_USER_PASS, ET_USER_CO_PASS;
    String username, email, password, co_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ET_USER_NAME = (EditText) findViewById(R.id.username);
        ET_USER_EMAIL = (EditText) findViewById(R.id.email);
        ET_USER_PASS = (EditText) findViewById(R.id.password);
        ET_USER_CO_PASS = (EditText) findViewById(R.id.co_password);
    }

//    public void userReg(View view) {
//        if (validate()) {
//            String method = "register";
//            BackgroundTask backgroundTask = new BackgroundTask(this);
//            backgroundTask.execute(method, username, email, password, co_password);
//
//            Toast.makeText(SignUpActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
//            finish();
//            startActivity(new Intent(this, StartActivity.class));
//        } else {
//            Toast.makeText(SignUpActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
//        }
//    }

    public void userReg(View view){

        username = ET_USER_NAME.getText().toString();
        email = ET_USER_EMAIL.getText().toString();
        password = ET_USER_PASS.getText().toString();
        co_password = ET_USER_CO_PASS.getText().toString();

        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, username, email, password, co_password);

//        if (!validate()) {
//            Toast.makeText(SignUpActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(SignUpActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show()
//            startActivity(new Intent(this, StartActivity.class));
//        }

    }

//    private boolean validate() {
//        boolean valid = true;
//
//        if (username.isEmpty()) {
//            ET_USER_NAME.setError("name required");
//            ET_USER_NAME.requestFocus();
//            valid = false;
//        }
//        if (email.isEmpty()) {
//            ET_USER_EMAIL.setError("email required");
//            ET_USER_EMAIL.requestFocus();
//            valid = false;
//        }
//        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
//            ET_USER_EMAIL.setError("enter a valid email");
//            ET_USER_EMAIL.requestFocus();
//            valid = false;
//        }
//        if (password.isEmpty()) {
//            ET_USER_PASS.setError("password required");
//            ET_USER_PASS.requestFocus();
//            valid = false;
//        }
//        if (password.length() < 6) {
//            ET_USER_PASS.setError("password should be at least 8 characters long");
//            ET_USER_PASS.requestFocus();
//            valid = false;
//        }
//        if (co_password != password) {
//            ET_USER_CO_PASS.setError("confirming password should be equal to the password");
//            ET_USER_CO_PASS.requestFocus();
//            valid = false;
//
//        } else {
//            valid = true;
//        }
//        return valid;
//    }

    public void userLogin(View view) {
        startActivity(new Intent(this, SignInActivity.class));
    }
}