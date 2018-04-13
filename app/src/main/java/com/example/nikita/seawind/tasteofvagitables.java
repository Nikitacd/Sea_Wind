package com.example.nikita.seawind;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class tasteofvagitables extends Fragment{
    public tasteofvagitables() {
    }

    static String[] menu5;
    static int[] price5;
    static int[] cnt5;
    static TextView j1;
    static TextView j2;
    static TextView j3;
    static TextView j4;
    static TextView j5;
    static TextView j6;
    static TextView j7;
    static TextView j8;
    static TextView j9;
    static TextView j10;
    ViewPager pager;
    Button binc51;
    Button binc52;
    Button binc53;
    Button binc54;
    Button binc55;
    Button binc56;
    Button binc57;
    Button binc58;
    Button binc59;
    Button binc510;

    Button bdec51;
    Button bdec52;
    Button bdec53;
    Button bdec54;
    Button bdec55;
    Button bdec56;
    Button bdec57;
    Button bdec58;
    Button bdec59;
    Button bdec510;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_tasteofvagitables,container,false);
        menu5 = new String[]{"SeaWind Special Veg","Veg Chingari","Veg Hydrabadi","Veg Kolhapuri","Veg Handi","Veg Kadhai","Veg Maharani","Veg Maharaja","Veg Jaipuri","Veg Tawa"};
        price5=new int[]{200,130,140,130,140,130,140,140,140,160};

        j1 = (TextView) rootView.findViewById(R.id.j1);
        j2 = (TextView) rootView.findViewById(R.id.j2);
        j3 = (TextView) rootView.findViewById(R.id.j3);
        j4 = (TextView) rootView.findViewById(R.id.j4);
        j5 = (TextView) rootView.findViewById(R.id.j5);
        j6 = (TextView) rootView.findViewById(R.id.j6);
        j7 = (TextView) rootView.findViewById(R.id.j7);
        j8 = (TextView) rootView.findViewById(R.id.j8);
        j9 = (TextView) rootView.findViewById(R.id.j9);
        j10 = (TextView) rootView.findViewById(R.id.j10);
        pager=(ViewPager)rootView.findViewById(R.id.pager);
        cnt5=new int[9];

        if(ForTabData.flg5>0) {
            j1.setText(new Integer(ForTabData.cnt5[0]).toString());
            j2.setText(new Integer(ForTabData.cnt5[1]).toString());
            j3.setText(new Integer(ForTabData.cnt5[2]).toString());
            j4.setText(new Integer(ForTabData.cnt5[3]).toString());
            j5.setText(new Integer(ForTabData.cnt5[4]).toString());
            j6.setText(new Integer(ForTabData.cnt5[5]).toString());
            j7.setText(new Integer(ForTabData.cnt5[6]).toString());
            j8.setText(new Integer(ForTabData.cnt5[7]).toString());
            j9.setText(new Integer(ForTabData.cnt5[8]).toString());
            j10.setText(new Integer(ForTabData.cnt5[9]).toString());
        }

        binc51 = (Button) rootView.findViewById(R.id.binc51);
        binc52 = (Button) rootView.findViewById(R.id.binc52);
        binc53 = (Button) rootView.findViewById(R.id.binc53);
        binc54 = (Button) rootView.findViewById(R.id.binc54);
        binc55 = (Button) rootView.findViewById(R.id.binc55);
        binc56 = (Button) rootView.findViewById(R.id.binc56);
        binc57 = (Button) rootView.findViewById(R.id.binc57);
        binc58 = (Button) rootView.findViewById(R.id.binc58);
        binc59 = (Button) rootView.findViewById(R.id.binc59);
        binc510 = (Button) rootView.findViewById(R.id.binc510);

        bdec51 = (Button) rootView.findViewById(R.id.bdec51);
        bdec52 = (Button) rootView.findViewById(R.id.bdec52);
        bdec53 = (Button) rootView.findViewById(R.id.bdec53);
        bdec54 = (Button) rootView.findViewById(R.id.bdec54);
        bdec55 = (Button) rootView.findViewById(R.id.bdec55);
        bdec56 = (Button) rootView.findViewById(R.id.bdec56);
        bdec57 = (Button) rootView.findViewById(R.id.bdec57);
        bdec58 = (Button) rootView.findViewById(R.id.bdec58);
        bdec59 = (Button) rootView.findViewById(R.id.bdec59);
        bdec510 = (Button) rootView.findViewById(R.id.bdec510);

        binc51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j1.getText());
                    iqty++;
                    ForTabData.cnt5[0]=iqty;
                    j1.setText(ForTabData.cnt5[0]+"");
                }
                catch (Exception e)
                {
                    j1.setText("Enter valid Number");
                }

            }
        });


        binc52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j2.getText());
                    iqty++;
                    ForTabData.cnt5[1]=iqty;
                    j2.setText(ForTabData.cnt5[1]+"");
                }
                catch (Exception e)
                {
                    j2.setText("Enter valid Number");
                }

            }
        });


        binc53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j3.getText());
                    iqty++;
                    ForTabData.cnt5[2]=iqty;
                    j3.setText(ForTabData.cnt5[2]+"");
                }
                catch (Exception e)
                {
                    j3.setText("Enter valid Number");
                }

            }
        });




        binc54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j4.getText());
                    iqty++;
                    ForTabData.cnt5[3]=iqty;
                    j4.setText(ForTabData.cnt5[3]+"");
                }
                catch (Exception e)
                {
                    j4.setText("Enter valid Number");
                }

            }
        });



        binc55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j5.getText());
                    iqty++;
                    ForTabData.cnt5[4]=iqty;
                    j5.setText(ForTabData.cnt5[4]+"");
                }
                catch (Exception e)
                {
                    j5.setText("Enter valid Number");
                }

            }
        });


        binc56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j6.getText());
                    iqty++;
                    ForTabData.cnt5[5]=iqty;
                    j6.setText(ForTabData.cnt5[5]+"");
                }
                catch (Exception e)
                {
                    j6.setText("Enter valid Number");
                }

            }
        });


        binc57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j7.getText());
                    iqty++;
                    ForTabData.cnt5[6]=iqty;
                    j7.setText(ForTabData.cnt5[6]+"");
                }
                catch (Exception e)
                {
                    j7.setText("Enter valid Number");
                }

            }
        });






        binc58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j8.getText());
                    iqty++;
                    ForTabData.cnt5[7]=iqty;
                    j8.setText(ForTabData.cnt5[7]+"");
                }
                catch (Exception e)
                {
                    j8.setText("Enter valid Number");
                }

            }
        });




        binc59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j9.getText());
                    iqty++;
                    ForTabData.cnt5[8]=iqty;
                    j9.setText(ForTabData.cnt5[8]+"");
                }
                catch (Exception e)
                {
                    j9.setText("Enter valid Number");
                }

            }
        });



        binc510.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg5=1;
                    int iqty=Integer.parseInt((String) j10.getText());
                    iqty++;
                    ForTabData.cnt5[9]=iqty;
                    j10.setText(ForTabData.cnt5[9]+"");
                }
                catch (Exception e)
                {
                    j10.setText("Enter valid Number");
                }

            }
        });

        bdec51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[0] == 0)
                        j1.setText(""+0);
                    else {
                        ForTabData.cnt5[0]--;
                        j1.setText(""+ForTabData.cnt5[0] );
                    }
                }catch (Exception e)
                {
                    j1.setText("Enter valid number");
                }
            }
        });
        bdec52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt5[1]== 0)
                        j2.setText(""+0);
                    else {
                        ForTabData.cnt5[1]--;
                        j2.setText(""+ForTabData.cnt5[1]);
                    }
                }catch (Exception e)
                {
                    j2.setText("Enter valid number");
                }
            }
        });
        bdec53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[2] == 0)
                        j3.setText(""+0);
                    else {
                        ForTabData.cnt5[2]--;
                        j3.setText(""+ForTabData.cnt5[2] );
                    }
                }catch (Exception e)
                {
                    j3.setText("Enter valid number");
                }
            }
        });
        bdec54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[3] == 0)
                        j4.setText(""+0);
                    else {
                        ForTabData.cnt5[3]--;
                        j4.setText(""+ForTabData.cnt5[3] );
                    }
                }catch (Exception e)
                {
                    j4.setText("Enter valid number");
                }
            }
        });
        bdec55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[4] == 0)
                        j5.setText(""+0);
                    else {
                        ForTabData.cnt5[4]--;
                        j5.setText(""+ForTabData.cnt5[4] );
                    }
                }catch (Exception e)
                {
                    j5.setText("Enter valid number");
                }
            }
        });
        bdec56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[5] == 0)
                        j6.setText(""+0);
                    else {
                        ForTabData.cnt5[5]--;
                        j6.setText(""+ForTabData.cnt5[5] );
                    }
                }catch (Exception e)
                {
                    j6.setText("Enter valid number");
                }
            }
        });
        bdec57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[6] == 0)
                        j7.setText(""+0);
                    else {
                        ForTabData.cnt5[6]--;
                        j7.setText(""+ForTabData.cnt5[6] );
                    }
                }catch (Exception e)
                {
                    j7.setText("Enter valid number");
                }
            }
        });
        bdec58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[7] == 0)
                        j8.setText(""+0);
                    else {
                        ForTabData.cnt5[7]--;
                        j8.setText(""+ForTabData.cnt5[7] );
                    }
                }catch (Exception e)
                {
                    j8.setText("Enter valid number");
                }
            }
        });
        bdec59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[8] == 0)
                        j9.setText(""+0);
                    else {
                        ForTabData.cnt5[8]--;
                        j9.setText(""+ForTabData.cnt5[8] );
                    }
                }catch (Exception e)
                {
                    j9.setText("Enter valid number");
                }
            }
        });
        bdec510.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt5[9] == 0)
                        j10.setText(""+0);
                    else {
                        ForTabData.cnt5[9]--;
                        j10.setText(""+ForTabData.cnt5[9] );
                    }
                }catch (Exception e)
                {
                    j10.setText("Enter valid number");
                }
            }
        });

        setRetainInstance(true);
        return rootView;
    }

}
