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

public class maharashtriandish extends Fragment{
    static String[] menu3;
    static int[] price3;
    static int[] cnt3;
    static TextView so1;
    static TextView so2;
    static TextView so3;
    static TextView so4;
    static TextView so5;
    static TextView so6;
    static TextView so7;
    static TextView so8;


    Button binc41;
    Button binc42;
    Button binc43;
    Button binc44;
    Button binc45;
    Button binc46;
    Button binc47;
    Button binc48;


    Button bdec41;
    Button bdec42;
    Button bdec43;
    Button bdec44;
    Button bdec45;
    Button bdec46;
    Button bdec47;
    Button bdec48;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_maharashtriandish, container, false);


        menu3=new String[]{"Baigan Bharta","Baigan Masala","Bhendi Masala","Bhendi Kurkuri","Methi Besan","Zunka","Pithla","Aloo jeera"};
        price3=new int[]{100,100,100,100,90,90,90,90};

        so1 = (TextView) rootView.findViewById(R.id.so1);
        so2 = (TextView) rootView.findViewById(R.id.so2);
        so3 = (TextView) rootView.findViewById(R.id.so3);
        so4 = (TextView) rootView.findViewById(R.id.so4);
        so5 = (TextView) rootView.findViewById(R.id.so5);
        so6 = (TextView) rootView.findViewById(R.id.so6);
        so7 = (TextView) rootView.findViewById(R.id.so7);
        so8 = (TextView) rootView.findViewById(R.id.so8);


        binc41 = (Button) rootView.findViewById(R.id.binc41);
        binc42 = (Button) rootView.findViewById(R.id.binc42);
        binc43 = (Button) rootView.findViewById(R.id.binc43);
        binc44 = (Button) rootView.findViewById(R.id.binc44);
        binc45 = (Button) rootView.findViewById(R.id.binc45);
        binc46 = (Button) rootView.findViewById(R.id.binc46);
        binc47 = (Button) rootView.findViewById(R.id.binc47);
        binc48 = (Button) rootView.findViewById(R.id.binc48);


        bdec41 = (Button) rootView.findViewById(R.id.bdec41);
        bdec42 = (Button) rootView.findViewById(R.id.bdec42);
        bdec43 = (Button) rootView.findViewById(R.id.bdec43);
        bdec44 = (Button) rootView.findViewById(R.id.bdec44);
        bdec45 = (Button) rootView.findViewById(R.id.bdec45);
        bdec46 = (Button) rootView.findViewById(R.id.bdec46);
        bdec47 = (Button) rootView.findViewById(R.id.bdec47);
        bdec48 = (Button) rootView.findViewById(R.id.bdec48);


        cnt3 = new int[9];

        binc41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int qty = Integer.parseInt((String) so1.getText());
                    qty++;
                    ForTabData.cnt3[0]=qty;
                    so1.setText(ForTabData.cnt3[0]+ "");
                   /* Log.e("qty",""+p1.getText().toString());*/
                }
                catch (Exception e)
                {
                    so1.setText("Enter valid number");
                }
            }
        });
        binc42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) so2.getText());
                    iqty11++;
                    ForTabData.cnt3[1]=iqty11;
                    so2.setText(ForTabData.cnt3[1]+ "");
                }
                catch (Exception e)
                {
                    so2.setText("Enter valid number");
                }
            }
        });
        binc43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) so3.getText());
                    iqty11++;
                    ForTabData.cnt3[2]=iqty11;
                    so3.setText(ForTabData.cnt3[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                }
                catch (Exception e)
                {
                    so3.setText("Enter valid number");
                }
            }
        });
        binc44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) so4.getText());
                    iqty11++;
                    ForTabData.cnt3[3]=iqty11;
                    so4.setText(ForTabData.cnt3[3]+ "");
                }
                catch (Exception e)
                {
                    so4.setText("Enter valid number");
                }
            }
        });
        binc45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) so5.getText());
                    iqty11++;
                    ForTabData.cnt3[4]=iqty11;

                    so5.setText(ForTabData.cnt3[4]+ "");
                }
                catch (Exception e)
                {
                    so5.setText("Enter valid number");
                }
            }
        });
        binc46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) so6.getText());
                    iqty11++;
                    ForTabData.cnt3[5]=iqty11;
                    so6.setText(ForTabData.cnt3[5]+ "");
                }
                catch (Exception e)
                {
                    so6.setText("Enter valid number");
                }
            }
        });
        binc47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) so7.getText());
                    iqty11++;
                    ForTabData.cnt3[6]=iqty11;
                    so7.setText(ForTabData.cnt3[6]+ "");
                }
                catch (Exception e)
                {
                    so7.setText("Enter valid number");
                }
            }
        });
        binc48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg3=1;
                    int iqty11 = Integer.parseInt((String) so8.getText());
                    iqty11++;
                    ForTabData.cnt3[7]=iqty11;
                    so8.setText(ForTabData.cnt3[7]+ "");
                }
                catch (Exception e)
                {
                    so8.setText("Enter valid number");
                }
            }
        });


        bdec41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[0] == 0)
                        so1.setText(""+0);
                    else {
                        ForTabData.cnt3[0]--;
                        so1.setText(""+ForTabData.cnt3[0] );
                    }
                }catch (Exception e)
                {
                    so1.setText("Enter valid number");
                }
            }
        });
        bdec42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt3[1]== 0)
                        so2.setText(""+0);
                    else {
                        ForTabData.cnt3[1]--;
                        so2.setText(""+ForTabData.cnt3[1]);
                    }
                }catch (Exception e)
                {
                    so2.setText("Enter valid number");
                }
            }
        });
        bdec43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[2] == 0)
                        so3.setText(""+0);
                    else {
                        ForTabData.cnt3[2]--;
                        so3.setText(""+ForTabData.cnt3[2] );
                    }
                }catch (Exception e)
                {
                    so3.setText("Enter valid number");
                }
            }
        });
        bdec44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[3] == 0)
                        so4.setText(""+0);
                    else {
                        ForTabData.cnt3[3]--;
                        so4.setText(""+ForTabData.cnt3[3] );
                    }
                }catch (Exception e)
                {
                    so4.setText("Enter valid number");
                }
            }
        });
        bdec45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[4] == 0)
                        so5.setText(""+0);
                    else {
                        ForTabData.cnt3[4]--;
                        so5.setText(""+ForTabData.cnt3[4] );
                    }
                }catch (Exception e)
                {
                    so5.setText("Enter valid number");
                }
            }
        });
        bdec46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[5] == 0)
                        so6.setText(""+0);
                    else {
                        ForTabData.cnt3[5]--;
                        so6.setText(""+ForTabData.cnt3[5] );
                    }
                }catch (Exception e)
                {
                    so6.setText("Enter valid number");
                }
            }
        });
        bdec47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[6] == 0)
                        so7.setText(""+0);
                    else {
                        ForTabData.cnt3[6]--;
                        so7.setText(""+ForTabData.cnt3[6] );
                    }
                }catch (Exception e)
                {
                    so7.setText("Enter valid number");
                }
            }
        });
        bdec48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt3[7] == 0)
                        so8.setText(""+0);
                    else {
                        ForTabData.cnt3[7]--;
                        so8.setText(""+ForTabData.cnt3[7] );
                    }
                }catch (Exception e)
                {
                    so8.setText("Enter valid number");
                }
            }
        });


        return rootView;
    }
}

