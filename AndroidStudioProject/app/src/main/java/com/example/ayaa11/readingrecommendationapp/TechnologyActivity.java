package com.example.ayaa11.readingrecommendationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TechnologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);
    }

    public void title1(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.britannica.com/story/history-of-technology-timeline"));
        startActivity(browserIntent);
    }

    public void title2(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.technologyreview.com/s/612964/what-is-quantum-communications/"));
        startActivity(browserIntent);
    }

    public void title3(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.technologyreview.com/s/612244/for-data-savvy-marketers-theres-a-new-keyword-intent/"));
        startActivity(browserIntent);
    }

    public void title4(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.technologyreview.com/s/612818/reality-regained-an-inquiry-into-the-data-age/"));
        startActivity(browserIntent);
    }

    public void title5(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.bbc.co.uk/news/technology-47255380"));
        startActivity(browserIntent);
    }
}
