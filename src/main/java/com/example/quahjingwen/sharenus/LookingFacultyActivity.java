package com.example.quahjingwen.sharenus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LookingFacultyActivity extends AppCompatActivity {

    private TextView mbrowseFaculty;
    private Button mallFaculty;
    private Button mfass;
    private Button mbiz;
    private Button mcom;
    private Button msde;
    private Button mengine;
    private Button mlaw;
    private Button mmed;
    private Button mscience;
    private Button mgem;
    private Button mother;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looking_faculty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // initialise widgets
        mallFaculty = findViewById(R.id.allFaculty);
        mfass = findViewById(R.id.fass);
        mbiz = findViewById(R.id.biz);
        mcom = findViewById(R.id.com);
        msde = findViewById(R.id.sde);
        mengine = findViewById(R.id.engine);
        mlaw = findViewById(R.id.law);
        mmed = findViewById(R.id.med);
        mscience = findViewById(R.id.science);
        mgem = findViewById(R.id.gem);
        mother = findViewById(R.id.other);

        mallFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFacultyActivity.this, BrowseLookingActivity.class);
                startActivity(intent);
            }
        });

        mfass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFacultyActivity.this, LookingFASSCourseActivity.class);
                startActivity(intent);
            }
        });

        mbiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFacultyActivity.this, LookingBizCourseActivity.class);
                startActivity(intent);
            }
        });

        mcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFacultyActivity.this, LookingComputingActivity.class);
                startActivity(intent);
            }
        });

        msde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFacultyActivity.this, LookingSDECourseActivity.class);
                startActivity(intent);
            }
        });

        mengine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFacultyActivity.this, LookingEngineActivity.class);
                startActivity(intent);
            }
        });

        mmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFacultyActivity.this, LookingMedicineActivity.class);
                startActivity(intent);
            }
        });

        mscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingFacultyActivity.this, LookingScienceActivity.class);
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
