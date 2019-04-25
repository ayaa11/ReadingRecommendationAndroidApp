package com.example.ayaa11.readingrecommendationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GeneralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
    }

    public void title1(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://edarticle.com/how-gambling-monopolies-work/"));
        startActivity(browserIntent);
    }

    public void title2(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.betterhelp.com/advice/psychologists/what-is-the-difference-between-a-therapist-and-a-psychologist/"));
        startActivity(browserIntent);
    }

    public void title3(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.betterhelp.com/advice/general/most-recommended-mindfulness-exercises/"));
        startActivity(browserIntent);
    }

    public void title4(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.betterhelp.com/advice/childhood/childhood-depression-prevalence-symptoms-and-treatment/"));
        startActivity(browserIntent);
    }

    public void title5(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.betterhelp.com/advice/body-language/22-body-language-examples-and-what-they-show/"));
        startActivity(browserIntent);
    }
}
