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

public class softdrinks extends Fragment{
    public softdrinks() {
    }

    static String[] menu9;
    static int[] price9;
    static int[] cnt9;
    static TextView d1;
    static TextView d2;
    static TextView d3;
    static TextView d4;
    static TextView d5;
    static TextView d6;
    static TextView d7;
    static TextView d8;
    static TextView d9;
    static TextView d10;
    ViewPager pager;
    Button binc91;
    Button binc92;
    Button binc93;
    Button binc94;
    Button binc95;
    Button binc96;
    Button binc97;
    Button binc98;
    Button binc99;
    Button binc910;

    Button bdec91;
    Button bdec92;
    Button bdec93;
    Button bdec94;
    Button bdec95;
    Button bdec96;
    Button bdec97;
    Button bdec98;
    Button bdec99;
    Button bdec910;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_softdrinks,container,false);
        menu9 = new String[]{"Thumps UP","Sprite","Limca","Soda","Maza","Funta","Minral Water","Fresh Lime Soda","Appy","Fizz"};
        price9=new int[]{45,35,20,40,30,45,20,45,30,35};

        d1 = (TextView) rootView.findViewById(R.id.d1);
        d2 = (TextView) rootView.findViewById(R.id.d2);
        d3 = (TextView) rootView.findViewById(R.id.d3);
        d4 = (TextView) rootView.findViewById(R.id.d4);
        d5 = (TextView) rootView.findViewById(R.id.d5);
        d6 = (TextView) rootView.findViewById(R.id.d6);
        d7 = (TextView) rootView.findViewById(R.id.d7);
        d8 = (TextView) rootView.findViewById(R.id.d8);
        d9 = (TextView) rootView.findViewById(R.id.d9);
        d10 = (TextView) rootView.findViewById(R.id.d10);
        pager=(ViewPager)rootView.findViewById(R.id.pager);
        cnt9=new int[9];

        if(ForTabData.flg9>0) {
            d1.setText(new Integer(ForTabData.cnt9[0]).toString());
            d2.setText(new Integer(ForTabData.cnt9[1]).toString());
            d3.setText(new Integer(ForTabData.cnt9[2]).toString());
            d4.setText(new Integer(ForTabData.cnt9[3]).toString());
            d5.setText(new Integer(ForTabData.cnt9[4]).toString());
            d6.setText(new Integer(ForTabData.cnt9[5]).toString());
            d7.setText(new Integer(ForTabData.cnt9[6]).toString());
            d8.setText(new Integer(ForTabData.cnt9[7]).toString());
            d9.setText(new Integer(ForTabData.cnt9[8]).toString());
            d10.setText(new Integer(ForTabData.cnt9[9]).toString());
        }

        binc91 = (Button) rootView.findViewById(R.id.binc91);
        binc92 = (Button) rootView.findViewById(R.id.binc92);
        binc93 = (Button) rootView.findViewById(R.id.binc93);
        binc94 = (Button) rootView.findViewById(R.id.binc94);
        binc95 = (Button) rootView.findViewById(R.id.binc95);
        binc96 = (Button) rootView.findViewById(R.id.binc96);
        binc97 = (Button) rootView.findViewById(R.id.binc97);
        binc98 = (Button) rootView.findViewById(R.id.binc98);
        binc99 = (Button) rootView.findViewById(R.id.binc99);
        binc910 = (Button) rootView.findViewById(R.id.binc910);

        bdec91 = (Button) rootView.findViewById(R.id.bdec91);
        bdec92 = (Button) rootView.findViewById(R.id.bdec92);
        bdec93 = (Button) rootView.findViewById(R.id.bdec93);
        bdec94 = (Button) rootView.findViewById(R.id.bdec94);
        bdec95 = (Button) rootView.findViewById(R.id.bdec95);
        bdec96 = (Button) rootView.findViewById(R.id.bdec96);
        bdec97 = (Button) rootView.findViewById(R.id.bdec97);
        bdec98 = (Button) rootView.findViewById(R.id.bdec98);
        bdec99 = (Button) rootView.findViewById(R.id.bdec99);
        bdec910 = (Button) rootView.findViewById(R.id.bdec910);

        binc91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d1.getText());
                    iqty++;
                    ForTabData.cnt9[0]=iqty;
                    d1.setText(ForTabData.cnt9[0]+"");
                }
                catch (Exception e)
                {
                    d1.setText("Enter valid Number");
                }

            }
        });


        binc92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d2.getText());
                    iqty++;
                    ForTabData.cnt9[1]=iqty;
                    d2.setText(ForTabData.cnt9[1]+"");
                }
                catch (Exception e)
                {
                    d2.setText("Enter valid Number");
                }

            }
        });


        binc93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d3.getText());
                    iqty++;
                    ForTabData.cnt9[2]=iqty;
                    d3.setText(ForTabData.cnt9[2]+"");
                }
                catch (Exception e)
                {
                    d3.setText("Enter valid Number");
                }

            }
        });




        binc94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d4.getText());
                    iqty++;
                    ForTabData.cnt9[3]=iqty;
                    d4.setText(ForTabData.cnt9[3]+"");
                }
                catch (Exception e)
                {
                    d4.setText("Enter valid Number");
                }

            }
        });



        binc95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d5.getText());
                    iqty++;
                    ForTabData.cnt9[4]=iqty;
                    d5.setText(ForTabData.cnt9[4]+"");
                }
                catch (Exception e)
                {
                    d5.setText("Enter valid Number");
                }

            }
        });


        binc96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d6.getText());
                    iqty++;
                    ForTabData.cnt9[5]=iqty;
                    d6.setText(ForTabData.cnt9[5]+"");
                }
                catch (Exception e)
                {
                    d6.setText("Enter valid Number");
                }

            }
        });


        binc97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d7.getText());
                    iqty++;
                    ForTabData.cnt9[6]=iqty;
                    d7.setText(ForTabData.cnt9[6]+"");
                }
                catch (Exception e)
                {
                    d7.setText("Enter valid Number");
                }

            }
        });






        binc98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d8.getText());
                    iqty++;
                    ForTabData.cnt9[7]=iqty;
                    d8.setText(ForTabData.cnt9[7]+"");
                }
                catch (Exception e)
                {
                    d8.setText("Enter valid Number");
                }

            }
        });




        binc99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d9.getText());
                    iqty++;
                    ForTabData.cnt9[8]=iqty;
                    d9.setText(ForTabData.cnt9[8]+"");
                }
                catch (Exception e)
                {
                    d9.setText("Enter valid Number");
                }

            }
        });



        binc910.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg9=1;
                    int iqty=Integer.parseInt((String) d10.getText());
                    iqty++;
                    ForTabData.cnt9[9]=iqty;
                    d10.setText(ForTabData.cnt9[9]+"");
                }
                catch (Exception e)
                {
                    d10.setText("Enter valid Number");
                }

            }
        });

        bdec91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[0] == 0)
                        d1.setText(""+0);
                    else {
                        ForTabData.cnt9[0]--;
                        d1.setText(""+ForTabData.cnt9[0] );
                    }
                }catch (Exception e)
                {
                    d1.setText("Enter valid number");
                }
            }
        });
        bdec92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt9[1]== 0)
                        d2.setText(""+0);
                    else {
                        ForTabData.cnt9[1]--;
                        d2.setText(""+ForTabData.cnt9[1]);
                    }
                }catch (Exception e)
                {
                    d2.setText("Enter valid number");
                }
            }
        });
        bdec93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[2] == 0)
                        d3.setText(""+0);
                    else {
                        ForTabData.cnt9[2]--;
                        d3.setText(""+ForTabData.cnt9[2] );
                    }
                }catch (Exception e)
                {
                    d3.setText("Enter valid number");
                }
            }
        });
        bdec94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[3] == 0)
                        d4.setText(""+0);
                    else {
                        ForTabData.cnt9[3]--;
                        d4.setText(""+ForTabData.cnt9[3] );
                    }
                }catch (Exception e)
                {
                    d4.setText("Enter valid number");
                }
            }
        });
        bdec95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[4] == 0)
                        d5.setText(""+0);
                    else {
                        ForTabData.cnt9[4]--;
                        d5.setText(""+ForTabData.cnt9[4] );
                    }
                }catch (Exception e)
                {
                    d5.setText("Enter valid number");
                }
            }
        });
        bdec96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[5] == 0)
                        d6.setText(""+0);
                    else {
                        ForTabData.cnt9[5]--;
                        d6.setText(""+ForTabData.cnt9[5] );
                    }
                }catch (Exception e)
                {
                    d6.setText("Enter valid number");
                }
            }
        });
        bdec97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[6] == 0)
                        d7.setText(""+0);
                    else {
                        ForTabData.cnt9[6]--;
                        d7.setText(""+ForTabData.cnt9[6] );
                    }
                }catch (Exception e)
                {
                    d7.setText("Enter valid number");
                }
            }
        });
        bdec98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[7] == 0)
                        d8.setText(""+0);
                    else {
                        ForTabData.cnt9[7]--;
                        d8.setText(""+ForTabData.cnt9[7] );
                    }
                }catch (Exception e)
                {
                    d8.setText("Enter valid number");
                }
            }
        });
        bdec99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[8] == 0)
                        d9.setText(""+0);
                    else {
                        ForTabData.cnt9[8]--;
                        d9.setText(""+ForTabData.cnt9[8] );
                    }
                }catch (Exception e)
                {
                    d9.setText("Enter valid number");
                }
            }
        });
        bdec910.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt9[9] == 0)
                        d10.setText(""+0);
                    else {
                        ForTabData.cnt9[9]--;
                        d10.setText(""+ForTabData.cnt9[9] );
                    }
                }catch (Exception e)
                {
                    d10.setText("Enter valid number");
                }
            }
        });

        setRetainInstance(true);
        return rootView;
    }

}
