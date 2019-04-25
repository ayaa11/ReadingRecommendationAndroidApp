package com.example.ayaa11.readingrecommendationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CareerDevelopmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_development);
    }

    public void title1(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.britannica.com/topic/industrial-relations/The-changing-work-force#ref539963"));
        startActivity(browserIntent);
    }

    public void title2(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.thebalancecareers.com/improving-career-development-4058289"));
        startActivity(browserIntent);
    }

    public void title3(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.betterhelp.com/advice/teamwork/understanding-the-teamwork-definition-in-relationships/"));
        startActivity(browserIntent);
    }

    public void title4(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.betterhelp.com/advice/teamwork/7-tips-to-help-you-improve-your-teamwork-skills/"));
        startActivity(browserIntent);
    }

    public void title5(View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.betterhelp.com/advice/careers/setting-healthy-career-goals-and-working-toward-them/"));
        startActivity(browserIntent);
    }
}
