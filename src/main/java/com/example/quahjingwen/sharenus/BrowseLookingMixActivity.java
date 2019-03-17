package com.example.quahjingwen.sharenus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class BrowseLookingMixActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView listview;
    ArrayList<ImageUploadInfo> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_looking_mix);

        listview=(ListView)findViewById(R.id.listView);
        final ImageUploadAdaptor adapter=new ImageUploadAdaptor(this, list);
        listview.setAdapter(adapter);
        dref= FirebaseDatabase.getInstance().getReference("LookingFor_Database");


        dref.orderByChild("eCourse").equalTo("Multidisciplinary").addChildEventListener(new ChildEventListener() {
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