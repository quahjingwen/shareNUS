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

public class SellingFacultyActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_selling_faculty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // initialise widgets
        mallFaculty = findViewById(R.id.allSelling);
        mfass = findViewById(R.id.fassS);
        mbiz = findViewById(R.id.bizS);
        mcom = findViewById(R.id.comS);
        msde = findViewById(R.id.sdeS);
        mengine = findViewById(R.id.engineS);
        mlaw = findViewById(R.id.lawS);
        mmed = findViewById(R.id.medS);
        mscience = findViewById(R.id.scienceS);
        mgem = findViewById(R.id.gemS);
        mother = findViewById(R.id.otherS);

        mallFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellingFacultyActivity.this, BrowseSellingActivity.class);
                startActivity(intent);
            }
        });

        mfass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellingFacultyActivity.this, SellingFASSCourseActivity.class);
                startActivity(intent);
            }
        });

        mbiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellingFacultyActivity.this, SellingBizCourseActivity.class);
                startActivity(intent);
            }
        });

        mcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellingFacultyActivity.this, SellingComputingCourseActivity.class);
                startActivity(intent);
            }
        });

        msde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellingFacultyActivity.this, SellingSDECourseActivity.class);
                startActivity(intent);
            }
        });

        mengine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellingFacultyActivity.this, SellingEngineActivity.class);
                startActivity(intent);
            }
        });

        mmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellingFacultyActivity.this, SellingMedicineActivity.class);
                startActivity(intent);
            }
        });

        mscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellingFacultyActivity.this, SellingScienceActivity.class);
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
