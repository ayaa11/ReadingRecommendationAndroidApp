package com.example.ayaa11.readingrecommendationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }


    public void title1(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.english-heritage.org.uk/learn/story-of-england/prehistory/"));
        startActivity(browserIntent);
    }

    public void title2(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.english-heritage.org.uk/learn/story-of-england/romans/"));
        startActivity(browserIntent);
    }

    public void title3(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.english-heritage.org.uk/learn/story-of-england/early-medieval/"));
        startActivity(browserIntent);
    }

    public void title4(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.english-heritage.org.uk/learn/story-of-england/victorian/"));
        startActivity(browserIntent);
    }

    public void title5(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.english-heritage.org.uk/learn/story-of-england/20th-century/"));
        startActivity(browserIntent);
    }
}