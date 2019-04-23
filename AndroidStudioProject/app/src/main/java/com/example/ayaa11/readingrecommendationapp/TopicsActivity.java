package com.example.ayaa11.readingrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


public class TopicsActivity extends Fragment {

    public TopicsActivity() {
        // empty public required
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_topics, container, false);

        ImageView imgEducation = (ImageView) view.findViewById(R.id.imgEducation);
        imgEducation.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EducationActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgHistory = (ImageView) view.findViewById(R.id.imgHistory);
        imgHistory.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgTechnology = (ImageView) view.findViewById(R.id.imgTechnology);
        imgTechnology.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TechnologyActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgHealth = (ImageView) view.findViewById(R.id.imgHealth);
        imgHealth.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HealthActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgCareer = (ImageView) view.findViewById(R.id.imgCareer);
        imgCareer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CareerDevelopmentActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgPsychology = (ImageView) view.findViewById(R.id.imgPsychology);
        imgPsychology.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PsychologyActivity.class);
                startActivity(intent);
            }
        });

        ImageView imgGeneral = (ImageView) view.findViewById(R.id.imgGeneral);
        imgGeneral.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeneralActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}