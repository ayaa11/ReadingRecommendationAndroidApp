package com.example.ayaa11.readingrecommendationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

//        ImageButton imageBtn = (ImageButton) findViewById(R.id.imageBtn);
//        ImageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TopicsActivity fragment = new TopicsActivity();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.fragment_container, fragment);
//                transaction.commit();
//            }
//        });

    }

    public void title1(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://edarticle.com/strategies-for-teaching-adhd-students-at-home/"));
        startActivity(browserIntent);
    }

    public void title2(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://edarticle.com/strategies-for-teaching-adhd-students-at-home/"));
        startActivity(browserIntent);
    }

    public void title3(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facultyfocus.com/articles/teaching-and-learning/using-metacognition-reframe-thinking-learning-styles/"));
        startActivity(browserIntent);
    }

    public void title4(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facultyfocus.com/articles/effective-teaching-strategies/activity-promotes-engagement-required-readings-even-large-classes/"));
        startActivity(browserIntent);
    }

    public void title5(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facultyfocus.com/articles/effective-classroom-management/towards-positive-u/"));
        startActivity(browserIntent);
    }

}