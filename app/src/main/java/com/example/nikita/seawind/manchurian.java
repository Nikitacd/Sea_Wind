package com.example.nikita.seawind;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class manchurian extends Fragment
{
    static String[] menu2;
    static int[] price2;
    static int[]cnt2;
    static TextView s1;
    static TextView s2;
    static TextView s3;
    static TextView s4;
    static TextView s5;
    static TextView s6;
    static TextView s7;
    static TextView s8;
    static TextView s9;
    static TextView s10;

    Button binc21;
    Button binc22;
    Button binc23;
    Button binc24;
    Button binc25;
    Button binc26;
    Button binc27;
    Button binc28;
    Button binc29;
    Button binc210;

    Button bdec21;
    Button bdec22;
    Button bdec23;
    Button bdec24;
    Button bdec25;
    Button bdec26;
    Button bdec27;
    Button bdec28;
    Button bdec29;
    Button bdec210;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_manchurian,container,false);
        menu2 = new String[]{"Veg Manchurian","Gobhi Manchurian","Paneer Manchurian","Mushroom Manchurian","Baby-Corn Chilly","Lemon Gobhi Manchurian","Veg-65","Paneer-65","Veg Chilly Fry","Paneer Chilly Fry"};
        price2=new int[]{100,90,140,130,130,95,90,140,110,150};

        s1 = (TextView) rootView.findViewById(R.id.s1);
        s2 = (TextView) rootView.findViewById(R.id.s2);
        s3 = (TextView) rootView.findViewById(R.id.s3);
        s4 = (TextView) rootView.findViewById(R.id.s4);
        s5 = (TextView) rootView.findViewById(R.id.s5);
        s6 = (TextView) rootView.findViewById(R.id.s6);
        s7 = (TextView) rootView.findViewById(R.id.s7);
        s8 = (TextView) rootView.findViewById(R.id.s8);
        s9 = (TextView) rootView.findViewById(R.id.s9);
        s10 = (TextView) rootView.findViewById(R.id.s10);

        cnt2=new int[9];


        binc21 = (Button) rootView.findViewById(R.id.binc21);
        binc22 = (Button) rootView.findViewById(R.id.binc22);
        binc23 = (Button) rootView.findViewById(R.id.binc23);
        binc24 = (Button) rootView.findViewById(R.id.binc24);
        binc25 = (Button) rootView.findViewById(R.id.binc25);
        binc26 = (Button) rootView.findViewById(R.id.binc26);
        binc27 = (Button) rootView.findViewById(R.id.binc27);
        binc28 = (Button) rootView.findViewById(R.id.binc28);
        binc29 = (Button) rootView.findViewById(R.id.binc29);
        binc210 = (Button) rootView.findViewById(R.id.binc210);

        bdec21 = (Button) rootView.findViewById(R.id.bdec21);
        bdec22 = (Button) rootView.findViewById(R.id.bdec22);
        bdec23 = (Button) rootView.findViewById(R.id.bdec23);
        bdec24 = (Button) rootView.findViewById(R.id.bdec24);
        bdec25 = (Button) rootView.findViewById(R.id.bdec25);
        bdec26 = (Button) rootView.findViewById(R.id.bdec26);
        bdec27 = (Button) rootView.findViewById(R.id.bdec27);
        bdec28 = (Button) rootView.findViewById(R.id.bdec28);
        bdec29 = (Button) rootView.findViewById(R.id.bdec29);
        bdec210 = (Button) rootView.findViewById(R.id.bdec210);

        binc21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int qty = Integer.parseInt((String) s1.getText());
                    qty++;
                    ForTabData.cnt2[0]=qty;
                    s1.setText(ForTabData.cnt2[0]+ "");
                   /* Log.e("qty",""+p1.getText().toString());*/
                }
                catch (Exception e)
                {
                    s1.setText("Enter valid number");
                }
            }
        });
        binc22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s2.getText());
                    iqty11++;
                    ForTabData.cnt2[1]=iqty11;
                    s2.setText(ForTabData.cnt2[1]+ "");
                }
                catch (Exception e)
                {
                    s2.setText("Enter valid number");
                }
            }
        });
        binc23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s3.getText());
                    iqty11++;
                    ForTabData.cnt2[2]=iqty11;
                    s3.setText(ForTabData.cnt2[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                }
                catch (Exception e)
                {
                    s3.setText("Enter valid number");
                }
            }
        });
        binc24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s4.getText());
                    iqty11++;
                    ForTabData.cnt2[3]=iqty11;
                    s4.setText(ForTabData.cnt2[3]+ "");
                }
                catch (Exception e)
                {
                    s4.setText("Enter valid number");
                }
            }
        });
        binc25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s5.getText());
                    iqty11++;
                    ForTabData.cnt2[4]=iqty11;

                    s5.setText(ForTabData.cnt2[4]+ "");
                }
                catch (Exception e)
                {
                    s5.setText("Enter valid number");
                }
            }
        });
        binc26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s6.getText());
                    iqty11++;
                    ForTabData.cnt2[5]=iqty11;
                    s6.setText(ForTabData.cnt2[5]+ "");
                }
                catch (Exception e)
                {
                    s6.setText("Enter valid number");
                }
            }
        });
        binc27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s7.getText());
                    iqty11++;
                    ForTabData.cnt2[6]=iqty11;
                    s7.setText(ForTabData.cnt2[6]+ "");
                }
                catch (Exception e)
                {
                    s7.setText("Enter valid number");
                }
            }
        });
        binc28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s8.getText());
                    iqty11++;
                    ForTabData.cnt2[7]=iqty11;
                    s8.setText(ForTabData.cnt2[7]+ "");
                }
                catch (Exception e)
                {
                    s8.setText("Enter valid number");
                }
            }
        });
        binc29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s9.getText());
                    iqty11++;
                    ForTabData.cnt2[8]=iqty11;
                    s9.setText(ForTabData.cnt2[8]+ "");
                }
                catch (Exception e)
                {
                    s9.setText("Enter valid number");
                }
            }
        });

        binc210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg2=1;
                    int iqty11 = Integer.parseInt((String) s10.getText());
                    iqty11++;
                    ForTabData.cnt2[9]=iqty11;
                    s10.setText(ForTabData.cnt2[9]+ "");
                }
                catch (Exception e)
                {
                    s10.setText("Enter valid number");
                }
            }
        });

        bdec21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[0] == 0)
                        s1.setText(""+0);
                    else {
                        ForTabData.cnt2[0]--;
                        s1.setText(""+ForTabData.cnt2[0] );
                    }
                }catch (Exception e)
                {
                    s1.setText("Enter valid number");
                }
            }
        });
        bdec22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt2[1]== 0)
                        s2.setText(""+0);
                    else {
                        ForTabData.cnt2[1]--;
                        s2.setText(""+ForTabData.cnt2[1]);
                    }
                }catch (Exception e)
                {
                    s2.setText("Enter valid number");
                }
            }
        });
        bdec23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[2] == 0)
                        s3.setText(""+0);
                    else {
                        ForTabData.cnt2[2]--;
                        s3.setText(""+ForTabData.cnt2[2] );
                    }
                }catch (Exception e)
                {
                    s3.setText("Enter valid number");
                }
            }
        });
        bdec24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[3] == 0)
                        s4.setText(""+0);
                    else {
                        ForTabData.cnt2[3]--;
                        s4.setText(""+ForTabData.cnt2[3] );
                    }
                }catch (Exception e)
                {
                    s4.setText("Enter valid number");
                }
            }
        });
        bdec25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[4] == 0)
                        s5.setText(""+0);
                    else {
                        ForTabData.cnt2[4]--;
                        s5.setText(""+ForTabData.cnt2[4] );
                    }
                }catch (Exception e)
                {
                    s5.setText("Enter valid number");
                }
            }
        });
        bdec26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[5] == 0)
                        s6.setText(""+0);
                    else {
                        ForTabData.cnt2[5]--;
                        s6.setText(""+ForTabData.cnt2[5] );
                    }
                }catch (Exception e)
                {
                    s6.setText("Enter valid number");
                }
            }
        });
        bdec27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[6] == 0)
                        s7.setText(""+0);
                    else {
                        ForTabData.cnt2[6]--;
                        s7.setText(""+ForTabData.cnt2[6] );
                    }
                }catch (Exception e)
                {
                    s7.setText("Enter valid number");
                }
            }
        });
        bdec28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[7] == 0)
                        s8.setText(""+0);
                    else {
                        ForTabData.cnt2[7]--;
                        s8.setText(""+ForTabData.cnt2[7] );
                    }
                }catch (Exception e)
                {
                    s8.setText("Enter valid number");
                }
            }
        });
        bdec29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[8] == 0)
                        s9.setText(""+0);
                    else {
                        ForTabData.cnt2[0]--;
                        s9.setText(""+ForTabData.cnt2[8] );
                    }
                }catch (Exception e)
                {
                    s9.setText("Enter valid number");
                }
            }
        });

        bdec210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt2[9] == 0)
                        s10.setText(""+0);
                    else {
                        ForTabData.cnt2[0]--;
                        s10.setText(""+ForTabData.cnt2[9] );
                    }
                }catch (Exception e)
                {
                    s10.setText("Enter valid number");
                }
            }
        });
        return rootView;
    }

    }
