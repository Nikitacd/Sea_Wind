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

public class ManagerAdapter extends RecyclerView.Adapter<ManagerAdapter.RecyclerViewHolder>{


    private ArrayList<FoodListingInfo> arrayList1 ;
    private Context ctx;


    public ManagerAdapter(ArrayList<FoodListingInfo> arrayList1,Context ctx)
    {
        this.arrayList1 = arrayList1;
        this.ctx = ctx;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_manager,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,ctx,arrayList1);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        FoodListingInfo MENU = arrayList1.get(position);


        holder.tNo.setText(MENU.getTable());
        holder.bill.setText(MENU.getOrder()   );
    }

    @Override
    public int getItemCount() {
        return (arrayList1 == null) ? 0 : arrayList1.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener {
        TextView tNo;
        TextView bill;
        ArrayList<FoodListingInfo> arrayList1;
        Context ctx;

        private DatabaseReference mref;
        String key;

        public RecyclerViewHolder(View itemView, Context ctx, final ArrayList<FoodListingInfo> arrayList1) {
            super(itemView);
            itemView.setOnLongClickListener(this);

            this.tNo = (TextView) itemView.findViewById(R.id.tableName);
            this.bill =  (TextView) itemView.findViewById(R.id.bill);

            this.ctx = ctx;
            this.arrayList1 = arrayList1;





        }


        @Override
        public boolean onLongClick(View v) {
            int pos = getAdapterPosition();
            FoodListingInfo ngo = arrayList1.get(pos);
            key = ngo.getKey();
            mref= FirebaseDatabase.getInstance().getReference().child("menuDetails").child(key).child("Mseen");
            mref.setValue("1");

            arrayList1.remove(pos);
            notifyItemRemoved(pos);
            notifyItemRangeChanged(pos, arrayList1.size());

            new ManagerAdapter(arrayList1,ctx);
            return false;
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
