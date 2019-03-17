package com.example.quahjingwen.sharenus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class BowseLookingBAActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView listview;
    ArrayList<ImageUploadInfo> list=new ArrayList<>();
    private Button mclick2chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowse_looking_ba);

        mclick2chat = findViewById(R.id.click2chattt);
        listview=(ListView)findViewById(R.id.listView);
        final ImageUploadAdaptor adapter=new ImageUploadAdaptor(this, list);
        listview.setAdapter(adapter);
        dref= FirebaseDatabase.getInstance().getReference("LookingFor_Database");

        mclick2chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BowseLookingBAActivity.this, UsersActivity.class);
                startActivity(intent);
            }
        });


        dref.orderByChild("eCourse").equalTo("Business Analytics").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                list.add(dataSnapshot.getValue(ImageUploadInfo.class));
                adapter.notifyDataSetChanged();
            }
            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
            }
            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                list.remove(dataSnapshot.getValue(ImageUploadInfo.class));
                adapter.notifyDataSetChanged();
            }
            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
}