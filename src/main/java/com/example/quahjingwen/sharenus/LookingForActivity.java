package com.example.quahjingwen.sharenus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LookingForActivity extends AppCompatActivity {

    private Button mUploadLookingFor;
    private Button mBrowseLookingFor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looking_for);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // initialise widgets
        mUploadLookingFor = findViewById(R.id.uploadLookingFor);
        mBrowseLookingFor = findViewById(R.id.browseLookingFor);

        mUploadLookingFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingForActivity.this, UploadLookingActivity.class);
                startActivity(intent);
            }
        });

        mBrowseLookingFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LookingForActivity.this, LookingFacultyActivity.class);
                startActivity(intent);
            }
        });

    }

}
