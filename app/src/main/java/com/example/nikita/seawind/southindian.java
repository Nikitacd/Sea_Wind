package com.example.nikita.seawind;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class southindian extends Fragment{
        static String[] menu4;
        static int[] price4;
        static int[] cnt4;
        static TextView i1;
        static TextView i2;
        static TextView i3;
        static TextView i4;
        static TextView i5;
        static TextView i6;
        static TextView i7;
        static TextView i8;
        static TextView i9;
        static TextView i10;

        Button binc31;
        Button binc32;
        Button binc33;
        Button binc34;
        Button binc35;
        Button binc36;
        Button binc37;
        Button binc38;
        Button binc39;
        Button binc310;

        Button bdec31;
        Button bdec32;
        Button bdec33;
        Button bdec34;
        Button bdec35;
        Button bdec36;
        Button bdec37;
        Button bdec38;
        Button bdec39;
        Button bdec310;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_southindian, container, false);

            menu4 = new String[]{"Idali Sambar","Medu Wada","Idali Wada","Plain Dosa","Masala Dosa","Masala Uttappam","Tomato Uttappam","Paper Sadha Dosa ","Onion Uttappam"};
            price4 = new int[]{40,40,50,40,50,50,50,70,90,50};

            i1 = (TextView) rootView.findViewById(R.id.i1);
            i2 = (TextView) rootView.findViewById(R.id.i2);
            i3 = (TextView) rootView.findViewById(R.id.i3);
            i4 = (TextView) rootView.findViewById(R.id.i4);
            i5 = (TextView) rootView.findViewById(R.id.i5);
            i6 = (TextView) rootView.findViewById(R.id.i6);
            i7 = (TextView) rootView.findViewById(R.id.i7);
            i8 = (TextView) rootView.findViewById(R.id.i8);
            i9 = (TextView) rootView.findViewById(R.id.i9);
            i10= (TextView) rootView.findViewById(R.id.i10);

            binc31 = (Button) rootView.findViewById(R.id.binc31);
            binc32 = (Button) rootView.findViewById(R.id.binc32);
            binc33 = (Button) rootView.findViewById(R.id.binc33);
            binc34 = (Button) rootView.findViewById(R.id.binc34);
            binc35 = (Button) rootView.findViewById(R.id.binc35);
            binc36 = (Button) rootView.findViewById(R.id.binc36);
            binc37 = (Button) rootView.findViewById(R.id.binc37);
            binc38 = (Button) rootView.findViewById(R.id.binc38);
            binc39 = (Button) rootView.findViewById(R.id.binc39);
            binc310 =(Button) rootView.findViewById(R.id.binc310);

            bdec31 = (Button) rootView.findViewById(R.id.bdec31);
            bdec32 = (Button) rootView.findViewById(R.id.bdec32);
            bdec33 = (Button) rootView.findViewById(R.id.bdec33);
            bdec34 = (Button) rootView.findViewById(R.id.bdec34);
            bdec35 = (Button) rootView.findViewById(R.id.bdec35);
            bdec36 = (Button) rootView.findViewById(R.id.bdec36);
            bdec37 = (Button) rootView.findViewById(R.id.bdec37);
            bdec38 = (Button) rootView.findViewById(R.id.bdec38);
            bdec39 = (Button) rootView.findViewById(R.id.bdec39);
            bdec310 =(Button) rootView.findViewById(R.id.bdec310);
            cnt4 = new int[9];


            binc31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4 = 1;
                        int iqty = Integer.parseInt(i1.getText().toString());
                        iqty++;
                        ForTabData.cnt4[0] = iqty;
                        i1.setText("" + ForTabData.cnt4[0]);
                    }catch(Exception e)
                    {
                        i1.setText("Enter valid number");
                    }
                }
            });
            binc32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i2.getText());
                        iqty11++;
                        ForTabData.cnt4[1]=iqty11;
                        i2.setText(ForTabData.cnt4[1]+ "");
                    }
                    catch (Exception e)
                    {
                        i2.setText("Enter valid number");
                    }
                }
            });
            binc33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i3.getText());
                        iqty11++;
                        ForTabData.cnt4[2]=iqty11;
                        i3.setText(ForTabData.cnt4[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                    }
                    catch (Exception e)
                    {
                        i3.setText("Enter valid number");
                    }
                }
            });
            binc34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i4.getText());
                        iqty11++;
                        ForTabData.cnt4[3]=iqty11;
                        i4.setText(ForTabData.cnt4[3]+ "");
                    }
                    catch (Exception e)
                    {
                        i4.setText("Enter valid number");
                    }
                }
            });
            binc35.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i5.getText());
                        iqty11++;
                        ForTabData.cnt4[4]=iqty11;

                        i5.setText(ForTabData.cnt4[4]+ "");
                    }
                    catch (Exception e)
                    {
                        i5.setText("Enter valid number");
                    }
                }
            });
            binc36.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i6.getText());
                        iqty11++;
                        ForTabData.cnt4[5]=iqty11;
                        i6.setText(ForTabData.cnt4[5]+ "");
                    }
                    catch (Exception e)
                    {
                        i6.setText("Enter valid number");
                    }
                }
            });
            binc37.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i7.getText());
                        iqty11++;
                        ForTabData.cnt4[6]=iqty11;
                        i7.setText(ForTabData.cnt4[6]+ "");
                    }
                    catch (Exception e)
                    {
                        i7.setText("Enter valid number");
                    }
                }
            });
            binc38.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i8.getText());
                        iqty11++;
                        ForTabData.cnt4[7]=iqty11;
                        i8.setText(ForTabData.cnt4[7]+ "");
                    }
                    catch (Exception e)
                    {
                        i8.setText("Enter valid number");
                    }
                }
            });
            binc39.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i9.getText());
                        iqty11++;
                        ForTabData.cnt4[8]=iqty11;
                        i9.setText(ForTabData.cnt4[8]+ "");
                    }
                    catch (Exception e)
                    {
                        i9.setText("Enter valid number");
                    }
                }
            });

            binc310.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        ForTabData.flg4=1;
                        int iqty11 = Integer.parseInt((String) i10.getText());
                        iqty11++;
                        ForTabData.cnt4[9]=iqty11;
                        i10.setText(ForTabData.cnt4[9]+ "");
                    }
                    catch (Exception e)
                    {
                        i10.setText("Enter valid number");
                    }
                }
            });

            bdec31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[0] == 0)
                            i1.setText(""+0);
                        else {
                            ForTabData.cnt4[0]--;
                            i1.setText(""+ForTabData.cnt4[0] );
                        }
                    }catch (Exception e)
                    {
                        i1.setText("Enter valid number");
                    }
                }
            });
            bdec32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        // int dqty11 = Integer.parseInt((String) p2.getText());
                        if (ForTabData.cnt4[1]== 0)
                            i2.setText(""+0);
                        else {
                            ForTabData.cnt4[1]--;
                            i2.setText(""+ForTabData.cnt4[1]);
                        }
                    }catch (Exception e)
                    {
                        i2.setText("Enter valid number");
                    }
                }
            });
            bdec33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[2] == 0)
                            i3.setText(""+0);
                        else {
                            ForTabData.cnt4[2]--;
                            i3.setText(""+ForTabData.cnt4[2] );
                        }
                    }catch (Exception e)
                    {
                        i3.setText("Enter valid number");
                    }
                }
            });
            bdec34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[3] == 0)
                            i4.setText(""+0);
                        else {
                            ForTabData.cnt4[3]--;
                            i4.setText(""+ForTabData.cnt4[3] );
                        }
                    }catch (Exception e)
                    {
                        i4.setText("Enter valid number");
                    }
                }
            });
            bdec35.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[4] == 0)
                            i5.setText(""+0);
                        else {
                            ForTabData.cnt4[4]--;
                            i5.setText(""+ForTabData.cnt4[4] );
                        }
                    }catch (Exception e)
                    {
                        i5.setText("Enter valid number");
                    }
                }
            });
            bdec36.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[5] == 0)
                            i6.setText(""+0);
                        else {
                            ForTabData.cnt4[5]--;
                            i6.setText(""+ForTabData.cnt4[5] );
                        }
                    }catch (Exception e)
                    {
                        i6.setText("Enter valid number");
                    }
                }
            });
            bdec37.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[6] == 0)
                            i7.setText(""+0);
                        else {
                            ForTabData.cnt4[6]--;
                            i7.setText(""+ForTabData.cnt4[6] );
                        }
                    }catch (Exception e)
                    {
                        i7.setText("Enter valid number");
                    }
                }
            });
            bdec38.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[7] == 0)
                            i8.setText(""+0);
                        else {
                            ForTabData.cnt4[7]--;
                            i8.setText(""+ForTabData.cnt4[7] );
                        }
                    }catch (Exception e)
                    {
                        i8.setText("Enter valid number");
                    }
                }
            });
            bdec39.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[8] == 0)
                            i9.setText(""+0);
                        else {
                            ForTabData.cnt4[0]--;
                            i9.setText(""+ForTabData.cnt4[8] );
                        }
                    }catch (Exception e)
                    {
                        i9.setText("Enter valid number");
                    }
                }
            });


            bdec310.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try
                    {
                        //int dqty11 = Integer.parseInt((String) p1.getText());
                        if (ForTabData.cnt4[9] == 0)
                            i10.setText(""+0);
                        else {
                            ForTabData.cnt4[0]--;
                            i10.setText(""+ForTabData.cnt4[9] );
                        }
                    }catch (Exception e)
                    {
                        i10.setText("Enter valid number");
                    }
                }
            });



            return rootView;
        }


}
