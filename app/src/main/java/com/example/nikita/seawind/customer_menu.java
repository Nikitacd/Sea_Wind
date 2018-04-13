package com.example.nikita.seawind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class customer_menu extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    DatabaseReference mref,mref2;
    String sp;
    //Query query;

    String name;
    String adr;
    private ArrayList<FoodListingInfo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_menu);

        //sp = getIntent().getStringExtra("EXTRA_SESSION_ID");

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
       list = new ArrayList<>();

//

        mref= FirebaseDatabase.getInstance().getReference().child("menuDetails");
        mref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot shot: dataSnapshot.getChildren())
                {

                    String t= shot.getKey();
                    shot.getChildren();
                    String p=shot.child("seen").getValue().toString();

                    Log.d("check1 ","seen "+t);
                    if(p.equals("0")) {


                        //Toast.makeText(customer_menu.this,"Order yet not completed",Toast.LENGTH_SHORT).show();

                        name = shot.child("tableNumber").getValue().toString();
                        adr = shot.child("Maharashtrian dish").getValue().toString();
                        String t1 = shot.child("Chawal ki Khushbu").getValue().toString();
                        String t2 = shot.child("Snacks").getValue().toString();
                        String t3 = shot.child("Soft Drinks").getValue().toString();
                        String t4 = shot.child("Soup").getValue().toString();
                        String t5 = shot.child("Tandoor").getValue().toString();
                        String t6 = shot.child("Taste Of vegitables").getValue().toString();
                        String t7 = shot.child("south Indian").getValue().toString();
                        String t8 = shot.child("Manchurian").getValue().toString();

                        adr = adr + "\n" + t8 + "\n" + t1 + "\n" + t2 + "\n" + t3 + "\n" + t4 + "\n" + t5 + "\n" + t6 + "\n" + t7;

                        FoodListingInfo bc = new FoodListingInfo(name, adr,t);

                        list.add(bc);
                    }
                    /*else
                    {
                        if(getItemCount() == 0)
                            Toast.makeText(customer_menu.this,"Order completed ..on the conveyer",Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(customer_menu.this,"no",Toast.LENGTH_SHORT).show();
                    }*/

                }
                Log.d("check1",""+"name");
                adapter = new FoodListingAdapter(list,customer_menu.this);
                layoutManager = new LinearLayoutManager(customer_menu.this);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);
                Log.d("check1",""+list.size());


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });






    }

    public int getItemCount(){
        return list.size();
    }
}
