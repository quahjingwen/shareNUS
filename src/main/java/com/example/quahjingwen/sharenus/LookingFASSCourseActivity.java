package com.example.quahjingwen.sharenus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LookingFASSCourseActivity extends AppCompatActivity {

    private Button asianstudies;
    private Button humanities;
    private Button socialsciences;
    private Button languages;
    private Button mix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looking_fasscourse);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        asianstudies = findViewById(R.id.asianstudies);
        humanities = findViewById(R.id.humanities);
        socialsciences = findViewById(R.id.socialsciences);
        languages = findViewById(R.id.languages);
        mix = findViewById(R.id.mix);

        asianstudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFASSCourseActivity.this, BrowseLookingAsianStudies.class);
                startActivity(intent);
            }
        });

        humanities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFASSCourseActivity.this, BrowseLookingHumanitiesActivity.class);
                startActivity(intent);
            }
        });

        socialsciences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFASSCourseActivity.this, BrowseLookingSocialActivity.class);
                startActivity(intent);
            }
        });

        languages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFASSCourseActivity.this, BrowseLookingLanguagesActivity.class);
                startActivity(intent);
            }
        });

        mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFASSCourseActivity.this, BrowseLookingMixActivity.class);
                startActivity(intent);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
