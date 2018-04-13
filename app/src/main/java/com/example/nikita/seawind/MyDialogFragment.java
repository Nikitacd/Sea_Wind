package com.example.nikita.seawind;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MyDialogFragment extends DialogFragment
{


    public MyDialogFragment() {
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {



        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Selected Menu:");
        //builder.setMessage(Home.s);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {


                // You don't have to do anything here if you just want it dismissed when clicked
/*
                onDismiss();
*/
             /*for(int i=0;i<9;i++)
             {
                 ForTabData.cnt1[i]=0;
                 ForTabData.cnt2[i]=0;
                 ForTabData.cnt3[i]=0;
                 ForTabData.cnt4[i]=0;
                 ForTabData.cnt5[i]=0;

             }*/
            }
        });

        // Create the AlertDialog object and return it
        return builder.create();
    }



}

