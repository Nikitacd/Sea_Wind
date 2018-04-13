package com.example.nikita.seawind;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by nikita on 6/11/17.
 */

public class FoodListingAdapter extends RecyclerView.Adapter<FoodListingAdapter.RecyclerViewHolder>{


      private ArrayList<FoodListingInfo> arrayList;
      private Context ctx;


    public FoodListingAdapter(ArrayList<FoodListingInfo> arrayList,Context ctx)
    {
        this.arrayList = arrayList;
        this.ctx = ctx;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listing_item,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,ctx,arrayList);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

       FoodListingInfo MENU = arrayList.get(position);

        holder.foodname.setText(MENU.getTable());
        holder.utemquantity.setText(MENU.getOrder()   );
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener {
        TextView foodname;
        TextView utemquantity;
        ArrayList<FoodListingInfo> arrayList;
        Context ctx;
        String mkey;
        private DatabaseReference mref;

        public RecyclerViewHolder(View itemView, Context ctx, final ArrayList<FoodListingInfo> arrayList) {
            super(itemView);
            itemView.setOnLongClickListener(this);

            this.foodname = (TextView) itemView.findViewById(R.id.FoodName);
            this.utemquantity =  (TextView) itemView.findViewById(R.id.utemQuantity);

            this.ctx = ctx;
            this.arrayList = arrayList;





        }


        @Override
        public boolean onLongClick(View v) {
            int pos = getAdapterPosition();
            final FoodListingInfo ngo = arrayList.get(pos);
            mkey = ngo.getKey();

            arrayList.remove(pos);

            notifyItemRemoved(pos);
            notifyItemRangeChanged(pos, arrayList.size());


           mref= FirebaseDatabase.getInstance().getReference().child("menuDetails");//.child("seen");
            mref.child(mkey).child("seen").setValue("1");
            new FoodListingAdapter(arrayList,ctx);

//            mref.addValueEventListener(new ValueEventListener() {
//                @Overrde
//                public void onDataChange(DataSnapshot dataSnapshot) {
//                    for (DataSnapshot shot: dataSnapshot.getChildren()    ) {
//                        if(shot.getKey() == mref.child(mkey).toString())
//                        {
//                            mref.child(mkey).child("seen").setValue("1");
//                        }
//
//                    }
//
//
//                }
//
//                @Override
//                public void onCancelled(DatabaseError databaseError) {
//
//                }
//            });


            return true;
        }



    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


}
