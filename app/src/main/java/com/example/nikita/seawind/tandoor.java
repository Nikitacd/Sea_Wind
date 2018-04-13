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


public class tandoor extends Fragment {
    static String[] menu6;
    static int[] price6;
    static int[] cnt6;
    static TextView a1;
    static TextView a2;
    static TextView a3;
    static TextView a4;
    static TextView a5;
    static TextView a6;
    static TextView a7;
    static TextView a8;
    static TextView a9;
    static TextView a10;

    Button binc61;
    Button binc62;
    Button binc63;
    Button binc64;
    Button binc65;
    Button binc66;
    Button binc67;
    Button binc68;
    Button binc69;
    Button binc610;

    Button bdec61;
    Button bdec62;
    Button bdec63;
    Button bdec64;
    Button bdec65;
    Button bdec66;
    Button bdec67;
    Button bdec68;
    Button bdec69;
    Button bdec610;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.fragment_tandoor, container, false);


        menu6=new String[]{"Roti","Buttter Roti","Naan","Butter Naan","Garlic Naan","Paratha","Butter Paratha","Kulcha","Butter Kulcha","Masala Kulcha"};
        price6=new int[]{14,18,25,30,50,30,35,30,40,50};

        a1 = (TextView) rootView.findViewById(R.id.a1);
        a2 = (TextView) rootView.findViewById(R.id.a2);
        a3 = (TextView) rootView.findViewById(R.id.a3);
        a4 = (TextView) rootView.findViewById(R.id.a4);
        a5 = (TextView) rootView.findViewById(R.id.a5);
        a6 = (TextView) rootView.findViewById(R.id.a6);
        a7 = (TextView) rootView.findViewById(R.id.a7);
        a8 = (TextView) rootView.findViewById(R.id.a8);
        a9 = (TextView) rootView.findViewById(R.id.a9);
        a10= (TextView) rootView.findViewById(R.id.a10);

        binc61 = (Button) rootView.findViewById(R.id.binc61);
        binc62 = (Button) rootView.findViewById(R.id.binc62);
        binc63 = (Button) rootView.findViewById(R.id.binc63);
        binc64 = (Button) rootView.findViewById(R.id.binc64);
        binc65 = (Button) rootView.findViewById(R.id.binc65);
        binc66 = (Button) rootView.findViewById(R.id.binc66);
        binc67 = (Button) rootView.findViewById(R.id.binc67);
        binc68 = (Button) rootView.findViewById(R.id.binc68);
        binc69 = (Button) rootView.findViewById(R.id.binc69);
        binc610 =(Button) rootView.findViewById(R.id.binc610);

        bdec61 = (Button) rootView.findViewById(R.id.bdec61);
        bdec62 = (Button) rootView.findViewById(R.id.bdec62);
        bdec63 = (Button) rootView.findViewById(R.id.bdec63);
        bdec64 = (Button) rootView.findViewById(R.id.bdec64);
        bdec65 = (Button) rootView.findViewById(R.id.bdec65);
        bdec66 = (Button) rootView.findViewById(R.id.bdec66);
        bdec67 = (Button) rootView.findViewById(R.id.bdec67);
        bdec68 = (Button) rootView.findViewById(R.id.bdec68);
        bdec69 = (Button) rootView.findViewById(R.id.bdec69);
        bdec610 = (Button) rootView.findViewById(R.id.bdec610);


        cnt6 = new int[9];



        binc61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int qty = Integer.parseInt((String) a1.getText());
                    qty++;
                    ForTabData.cnt6[0]=qty;
                    a1.setText(ForTabData.cnt6[0]+ "");
                   /* Log.e("qty",""+p1.getText().toString());*/
                }
                catch (Exception e)
                {
                    a1.setText("Enter valid number");
                }
            }
        });

        binc62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a2.getText());
                    iqty11++;
                    ForTabData.cnt6[1]=iqty11;
                    a2.setText(ForTabData.cnt6[1]+ "");
                }
                catch (Exception e)
                {
                    a2.setText("Enter valid number");
                }
            }
        });
        binc63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a3.getText());
                    iqty11++;
                    ForTabData.cnt6[2]=iqty11;
                    a3.setText(ForTabData.cnt6[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                }
                catch (Exception e)
                {
                    a3.setText("Enter valid number");
                }
            }
        });
        binc64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a4.getText());
                    iqty11++;
                    ForTabData.cnt6[3]=iqty11;
                    a4.setText(ForTabData.cnt6[3]+ "");
                }
                catch (Exception e)
                {
                    a4.setText("Enter valid number");
                }
            }
        });
        binc65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a5.getText());
                    iqty11++;
                    ForTabData.cnt6[4]=iqty11;

                    a5.setText(ForTabData.cnt6[4]+ "");
                }
                catch (Exception e)
                {
                    a5.setText("Enter valid number");
                }
            }
        });
        binc66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a6.getText());
                    iqty11++;
                    ForTabData.cnt6[5]=iqty11;
                    a6.setText(ForTabData.cnt6[5]+ "");
                }
                catch (Exception e)
                {
                    a6.setText("Enter valid number");
                }
            }
        });
        binc67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a7.getText());
                    iqty11++;
                    ForTabData.cnt6[6]=iqty11;
                    a7.setText(ForTabData.cnt6[6]+ "");
                }
                catch (Exception e)
                {
                    a7.setText("Enter valid number");
                }
            }
        });
        binc68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a8.getText());
                    iqty11++;
                    ForTabData.cnt6[7]=iqty11;
                    a8.setText(ForTabData.cnt6[7]+ "");
                }
                catch (Exception e)
                {
                    a8.setText("Enter valid number");
                }
            }
        });
        binc69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a9.getText());
                    iqty11++;
                    ForTabData.cnt6[8]=iqty11;
                    a9.setText(ForTabData.cnt6[8]+ "");
                }
                catch (Exception e)
                {
                    a9.setText("Enter valid number");
                }
            }
        });


        binc610.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg6=1;
                    int iqty11 = Integer.parseInt((String) a10.getText());
                    iqty11++;
                    ForTabData.cnt6[9]=iqty11;
                    a10.setText(ForTabData.cnt6[9]+ "");
                }
                catch (Exception e)
                {
                    a10.setText("Enter valid number");
                }
            }
        });

        bdec61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[0] == 0)
                        a1.setText(""+0);
                    else {
                        ForTabData.cnt6[0]--;
                        a1.setText(""+ForTabData.cnt6[0] );
                    }
                }catch (Exception e)
                {
                    a1.setText("Enter valid number");
                }
            }
        });
        bdec62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt6[1]== 0)
                        a2.setText(""+0);
                    else {
                        ForTabData.cnt6[1]--;
                        a2.setText(""+ForTabData.cnt6[1]);
                    }
                }catch (Exception e)
                {
                    a2.setText("Enter valid number");
                }
            }
        });
        bdec63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[2] == 0)
                        a3.setText(""+0);
                    else {
                        ForTabData.cnt6[2]--;
                        a3.setText(""+ForTabData.cnt6[2] );
                    }
                }catch (Exception e)
                {
                    a3.setText("Enter valid number");
                }
            }
        });
        bdec64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[3] == 0)
                        a4.setText(""+0);
                    else {
                        ForTabData.cnt6[3]--;
                        a4.setText(""+ForTabData.cnt6[3] );
                    }
                }catch (Exception e)
                {
                    a4.setText("Enter valid number");
                }
            }
        });
        bdec65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[4] == 0)
                        a5.setText(""+0);
                    else {
                        ForTabData.cnt6[4]--;
                        a5.setText(""+ForTabData.cnt6[4] );
                    }
                }catch (Exception e)
                {
                    a5.setText("Enter valid number");
                }
            }
        });
        bdec66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[5] == 0)
                        a6.setText(""+0);
                    else {
                        ForTabData.cnt6[5]--;
                        a6.setText(""+ForTabData.cnt6[5] );
                    }
                }catch (Exception e)
                {
                    a6.setText("Enter valid number");
                }
            }
        });
        bdec67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[6] == 0)
                        a7.setText(""+0);
                    else {
                        ForTabData.cnt6[6]--;
                        a7.setText(""+ForTabData.cnt6[6] );
                    }
                }catch (Exception e)
                {
                    a7.setText("Enter valid number");
                }
            }
        });
        bdec68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[7] == 0)
                        a8.setText(""+0);
                    else {
                        ForTabData.cnt6[7]--;
                        a8.setText(""+ForTabData.cnt6[7] );
                    }
                }catch (Exception e)
                {
                    a8.setText("Enter valid number");
                }
            }
        });
        bdec69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[8] == 0)
                        a9.setText(""+0);
                    else {
                        ForTabData.cnt6[0]--;
                        a9.setText(""+ForTabData.cnt6[8] );
                    }
                }catch (Exception e)
                {
                    a9.setText("Enter valid number");
                }
            }
        });

        bdec610.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt6[9] == 0)
                        a10.setText(""+0);
                    else {
                        ForTabData.cnt6[0]--;
                        a10.setText(""+ForTabData.cnt6[9] );
                    }
                }catch (Exception e)
                {
                    a10.setText("Enter valid number");
                }
            }
        });

        return rootView;
    }


}
