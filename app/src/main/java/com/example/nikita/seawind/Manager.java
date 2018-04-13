package com.example.nikita.seawind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Manager extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter1;
    RecyclerView.LayoutManager layoutManager1;
    DatabaseReference mref1;

    private  String tNo;
   private String bill;
    private ArrayList<FoodListingInfo> list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        list1 =  new ArrayList<>();

         recyclerView = (RecyclerView)findViewById(R.id.recyclerview1);


        mref1= FirebaseDatabase.getInstance().getReference().child("menuDetails");
        mref1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot shot: dataSnapshot.getChildren())
                {
                    String t= shot.child("Mseen").getValue().toString();

                    if(t.equals("0")) {

                        tNo = shot.child("tableNumber").getValue().toString();
                        bill = shot.child("bill").getValue().toString();

                        FoodListingInfo bc1 = new FoodListingInfo(tNo, bill,shot.getKey());
                        Log.d("check1", "" + bc1.getTable());
                        list1.add(bc1);
                    }

                }
                Log.d("check1",""+"name");
                adapter1 = new ManagerAdapter(list1,Manager.this);
                layoutManager1 = new LinearLayoutManager(Manager.this);
                recyclerView.setLayoutManager(layoutManager1);
                recyclerView.setAdapter(adapter1);
            //    Log.d("check1",""+list.size());


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });






    }

}
