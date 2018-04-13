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

public class chawal extends Fragment{
    static String[] menu7;
    static int[] price7;
    static int[] cnt7;
    static TextView o1;
    static TextView o2;
    static TextView o3;
    static TextView o4;
    static TextView o5;
    static TextView o6;
    static TextView o7;
    static TextView o8;
    static TextView o9;




    Button binc71;
    Button binc72;
    Button binc73;
    Button binc74;
    Button binc75;
    Button binc76;
    Button binc77;
    Button binc78;
    Button binc79;



    Button bdec71;
    Button bdec72;
    Button bdec73;
    Button bdec74;
    Button bdec75;
    Button bdec76;
    Button bdec77;
    Button bdec78;
    Button bdec79;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chawal, container, false);


        menu7=new String[]{"SeaWind Special Biryani","Veg Biryani","Hydrabadi Biryani","Kashmiri Pulav","Curd Rice","Veg Pulav","Daal Khichadi","Jeera Rice","Plain Rice"};
        price7=new int[]{150,130,140,150,100,110,120,75,65};

        o1 = (TextView) rootView.findViewById(R.id.o1);
        o2 = (TextView) rootView.findViewById(R.id.o2);
        o3 = (TextView) rootView.findViewById(R.id.o3);
        o4 = (TextView) rootView.findViewById(R.id.o4);
        o5 = (TextView) rootView.findViewById(R.id.o5);
        o6 = (TextView) rootView.findViewById(R.id.o6);
        o7 = (TextView) rootView.findViewById(R.id.o7);
        o8 = (TextView) rootView.findViewById(R.id.o8);
        o9 = (TextView) rootView.findViewById(R.id.o9);



        binc71 = (Button) rootView.findViewById(R.id.binc71);
        binc72 = (Button) rootView.findViewById(R.id.binc72);
        binc73 = (Button) rootView.findViewById(R.id.binc73);
        binc74 = (Button) rootView.findViewById(R.id.binc74);
        binc75 = (Button) rootView.findViewById(R.id.binc75);
        binc76 = (Button) rootView.findViewById(R.id.binc76);
        binc77 = (Button) rootView.findViewById(R.id.binc77);
        binc78 = (Button) rootView.findViewById(R.id.binc78);
        binc79 = (Button) rootView.findViewById(R.id.binc79);


        bdec71 = (Button) rootView.findViewById(R.id.bdec71);
        bdec72 = (Button) rootView.findViewById(R.id.bdec72);
        bdec73 = (Button) rootView.findViewById(R.id.bdec73);
        bdec74 = (Button) rootView.findViewById(R.id.bdec74);
        bdec75 = (Button) rootView.findViewById(R.id.bdec75);
        bdec76 = (Button) rootView.findViewById(R.id.bdec76);
        bdec77 = (Button) rootView.findViewById(R.id.bdec77);
        bdec78 = (Button) rootView.findViewById(R.id.bdec78);
        bdec79 = (Button) rootView.findViewById(R.id.bdec79);

        cnt7 = new int[9];

        binc71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int qty = Integer.parseInt((String) o1.getText());
                    qty++;
                    ForTabData.cnt7[0]=qty;
                    o1.setText(ForTabData.cnt7[0]+ "");
                   /* Log.e("qty",""+p1.getText().toString());*/
                }
                catch (Exception e)
                {
                    o1.setText("Enter valid number");
                }
            }
        });
        binc72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int iqty11 = Integer.parseInt((String) o2.getText());
                    iqty11++;
                    ForTabData.cnt7[1]=iqty11;
                    o2.setText(ForTabData.cnt7[1]+ "");
                }
                catch (Exception e)
                {
                    o2.setText("Enter valid number");
                }
            }
        });
        binc73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int iqty11 = Integer.parseInt((String) o3.getText());
                    iqty11++;
                    ForTabData.cnt7[2]=iqty11;
                    o3.setText(ForTabData.cnt7[2]+ "");
                   /* Log.e("iqty13",""+""+p3.getText().toString());*/
                }
                catch (Exception e)
                {
                    o3.setText("Enter valid number");
                }
            }
        });
        binc74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int iqty11 = Integer.parseInt((String) o4.getText());
                    iqty11++;
                    ForTabData.cnt7[3]=iqty11;
                    o4.setText(ForTabData.cnt7[3]+ "");
                }
                catch (Exception e)
                {
                    o4.setText("Enter valid number");
                }
            }
        });
        binc75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int iqty11 = Integer.parseInt((String) o5.getText());
                    iqty11++;
                    ForTabData.cnt7[4]=iqty11;

                    o5.setText(ForTabData.cnt7[4]+ "");
                }
                catch (Exception e)
                {
                    o5.setText("Enter valid number");
                }
            }
        });
        binc76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int iqty11 = Integer.parseInt((String) o6.getText());
                    iqty11++;
                    ForTabData.cnt7[5]=iqty11;
                    o6.setText(ForTabData.cnt7[5]+ "");
                }
                catch (Exception e)
                {
                    o6.setText("Enter valid number");
                }
            }
        });
        binc77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int iqty11 = Integer.parseInt((String) o7.getText());
                    iqty11++;
                    ForTabData.cnt7[6]=iqty11;
                    o7.setText(ForTabData.cnt7[6]+ "");
                }
                catch (Exception e)
                {
                    o7.setText("Enter valid number");
                }
            }
        });
        binc78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int iqty11 = Integer.parseInt((String) o8.getText());
                    iqty11++;
                    ForTabData.cnt7[7]=iqty11;
                    o8.setText(ForTabData.cnt7[7]+ "");
                }
                catch (Exception e)
                {
                    o8.setText("Enter valid number");
                }
            }
        });


        binc79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ForTabData.flg7=1;
                    int iqty11 = Integer.parseInt((String) o9.getText());
                    iqty11++;
                    ForTabData.cnt7[8]=iqty11;
                    o9.setText(ForTabData.cnt7[8]+ "");
                }
                catch (Exception e)
                {
                    o9.setText("Enter valid number");
                }
            }
        });



        bdec71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt7[0] == 0)
                        o1.setText(""+0);
                    else {
                        ForTabData.cnt7[0]--;
                        o1.setText(""+ForTabData.cnt7[0] );
                    }
                }catch (Exception e)
                {
                    o1.setText("Enter valid number");
                }
            }
        });
        bdec72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt7[1]== 0)
                        o2.setText(""+0);
                    else {
                        ForTabData.cnt7[1]--;
                        o2.setText(""+ForTabData.cnt7[1]);
                    }
                }catch (Exception e)
                {
                    o2.setText("Enter valid number");
                }
            }
        });
        bdec73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt7[2] == 0)
                        o3.setText(""+0);
                    else {
                        ForTabData.cnt7[2]--;
                        o3.setText(""+ForTabData.cnt7[2] );
                    }
                }catch (Exception e)
                {
                    o3.setText("Enter valid number");
                }
            }
        });
        bdec74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt7[3] == 0)
                        o4.setText(""+0);
                    else {
                        ForTabData.cnt7[3]--;
                        o4.setText(""+ForTabData.cnt7[3] );
                    }
                }catch (Exception e)
                {
                    o4.setText("Enter valid number");
                }
            }
        });
        bdec75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt7[4] == 0)
                        o5.setText(""+0);
                    else {
                        ForTabData.cnt7[4]--;
                        o5.setText(""+ForTabData.cnt7[4] );
                    }
                }catch (Exception e)
                {
                    o5.setText("Enter valid number");
                }
            }
        });
        bdec76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt7[5] == 0)
                        o6.setText(""+0);
                    else {
                        ForTabData.cnt7[5]--;
                        o6.setText(""+ForTabData.cnt7[5] );
                    }
                }catch (Exception e)
                {
                    o6.setText("Enter valid number");
                }
            }
        });
        bdec77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt7[6] == 0)
                        o7.setText(""+0);
                    else {
                        ForTabData.cnt7[6]--;
                        o7.setText(""+ForTabData.cnt7[6] );
                    }
                }catch (Exception e)
                {
                    o7.setText("Enter valid number");
                }
            }
        });
        bdec78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt7[7] == 0)
                        o8.setText(""+0);
                    else {
                        ForTabData.cnt7[7]--;
                        o8.setText(""+ForTabData.cnt7[7] );
                    }
                }catch (Exception e)
                {
                    o8.setText("Enter valid number");
                }
            }
        });


        bdec79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt7[8] == 0)
                        o9.setText(""+0);
                    else {
                        ForTabData.cnt7[8]--;
                        o9.setText(""+ForTabData.cnt7[8] );
                    }
                }catch (Exception e)
                {
                    o9.setText("Enter valid number");
                }
            }
        });

        return rootView;
    }
}

