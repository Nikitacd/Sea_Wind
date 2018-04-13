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

public class soup extends Fragment{
    public soup() {
    }

    static String[] menu1;
    static int[] price1;
    static int[] cnt1;
    static TextView p1;
    static TextView p2;
    static TextView p3;
    static TextView p4;
    static TextView p5;
    static TextView p6;
    static TextView p7;
    static TextView p8;
    static TextView p9;
    static TextView p10;
    ViewPager pager;
    Button binc11;
    Button binc12;
    Button binc13;
    Button binc14;
    Button binc15;
    Button binc16;
    Button binc17;
    Button binc18;
    Button binc19;
    Button binc110;

    Button bdec11;
    Button bdec12;
    Button bdec13;
    Button bdec14;
    Button bdec15;
    Button bdec16;
    Button bdec17;
    Button bdec18;
    Button bdec19;
    Button bdec110;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_soup,container,false);
        menu1 = new String[]{"Tomato Soup","Sweet Corn Soup","Hot And Sour Soup","Veg Manchow Soup","Veg Noodles Soup","Veg Clear Soup","Cream Of Palak Soup","Cream Of Mushroom Soup","Cream Of Veg Soup","Minestrone Soup"};
        price1=new int[]{70,80,75,65,80,70,80,70,70,75};

        p1 = (TextView) rootView.findViewById(R.id.p1);
        p2 = (TextView) rootView.findViewById(R.id.p2);
        p3 = (TextView) rootView.findViewById(R.id.p3);
        p4 = (TextView) rootView.findViewById(R.id.p4);
        p5 = (TextView) rootView.findViewById(R.id.p5);
        p6 = (TextView) rootView.findViewById(R.id.p6);
        p7 = (TextView) rootView.findViewById(R.id.p7);
        p8 = (TextView) rootView.findViewById(R.id.p8);
        p9 = (TextView) rootView.findViewById(R.id.p9);
        p10 = (TextView) rootView.findViewById(R.id.p10);
        pager=(ViewPager)rootView.findViewById(R.id.pager);
        cnt1=new int[9];

        if(ForTabData.flg1>0) {
            p1.setText(new Integer(ForTabData.cnt1[0]).toString());
            p2.setText(new Integer(ForTabData.cnt1[1]).toString());
            p3.setText(new Integer(ForTabData.cnt1[2]).toString());
            p4.setText(new Integer(ForTabData.cnt1[3]).toString());
            p5.setText(new Integer(ForTabData.cnt1[4]).toString());
            p6.setText(new Integer(ForTabData.cnt1[5]).toString());
            p7.setText(new Integer(ForTabData.cnt1[6]).toString());
            p8.setText(new Integer(ForTabData.cnt1[7]).toString());
            p9.setText(new Integer(ForTabData.cnt1[8]).toString());
            p10.setText(new Integer(ForTabData.cnt1[9]).toString());
        }

        binc11 = (Button) rootView.findViewById(R.id.binc11);
        binc12 = (Button) rootView.findViewById(R.id.binc12);
        binc13 = (Button) rootView.findViewById(R.id.binc13);
        binc14 = (Button) rootView.findViewById(R.id.binc14);
        binc15 = (Button) rootView.findViewById(R.id.binc15);
        binc16 = (Button) rootView.findViewById(R.id.binc16);
        binc17 = (Button) rootView.findViewById(R.id.binc17);
        binc18 = (Button) rootView.findViewById(R.id.binc18);
        binc19 = (Button) rootView.findViewById(R.id.binc19);
        binc110 = (Button) rootView.findViewById(R.id.binc110);

        bdec11 = (Button) rootView.findViewById(R.id.bdec11);
        bdec12 = (Button) rootView.findViewById(R.id.bdec12);
        bdec13 = (Button) rootView.findViewById(R.id.bdec13);
        bdec14 = (Button) rootView.findViewById(R.id.bdec14);
        bdec15 = (Button) rootView.findViewById(R.id.bdec15);
        bdec16 = (Button) rootView.findViewById(R.id.bdec16);
        bdec17 = (Button) rootView.findViewById(R.id.bdec17);
        bdec18 = (Button) rootView.findViewById(R.id.bdec18);
        bdec19 = (Button) rootView.findViewById(R.id.bdec19);
        bdec110 = (Button) rootView.findViewById(R.id.bdec110);

        binc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p1.getText());
                    iqty++;
                    ForTabData.cnt1[0]=iqty;
                    p1.setText(ForTabData.cnt1[0]+"");
                }
                catch (Exception e)
                {
                    p1.setText("Enter valid Number");
                }

            }
        });


        binc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p2.getText());
                    iqty++;
                    ForTabData.cnt1[1]=iqty;
                    p2.setText(ForTabData.cnt1[1]+"");
                }
                catch (Exception e)
                {
                    p2.setText("Enter valid Number");
                }

            }
        });


        binc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p3.getText());
                    iqty++;
                    ForTabData.cnt1[2]=iqty;
                    p3.setText(ForTabData.cnt1[2]+"");
                }
                catch (Exception e)
                {
                    p3.setText("Enter valid Number");
                }

            }
        });




        binc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p4.getText());
                    iqty++;
                    ForTabData.cnt1[3]=iqty;
                    p4.setText(ForTabData.cnt1[3]+"");
                }
                catch (Exception e)
                {
                    p4.setText("Enter valid Number");
                }

            }
        });



        binc15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p5.getText());
                    iqty++;
                    ForTabData.cnt1[4]=iqty;
                    p5.setText(ForTabData.cnt1[4]+"");
                }
                catch (Exception e)
                {
                    p5.setText("Enter valid Number");
                }

            }
        });


        binc16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p6.getText());
                    iqty++;
                    ForTabData.cnt1[5]=iqty;
                    p6.setText(ForTabData.cnt1[5]+"");
                }
                catch (Exception e)
                {
                    p6.setText("Enter valid Number");
                }

            }
        });


        binc17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p7.getText());
                    iqty++;
                    ForTabData.cnt1[6]=iqty;
                    p7.setText(ForTabData.cnt1[6]+"");
                }
                catch (Exception e)
                {
                    p7.setText("Enter valid Number");
                }

            }
        });






        binc18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p8.getText());
                    iqty++;
                    ForTabData.cnt1[7]=iqty;
                    p8.setText(ForTabData.cnt1[7]+"");
                }
                catch (Exception e)
                {
                    p8.setText("Enter valid Number");
                }

            }
        });




        binc19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p9.getText());
                    iqty++;
                    ForTabData.cnt1[8]=iqty;
                    p9.setText(ForTabData.cnt1[8]+"");
                }
                catch (Exception e)
                {
                    p9.setText("Enter valid Number");
                }

            }
        });



        binc110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg1=1;
                    int iqty=Integer.parseInt((String) p10.getText());
                    iqty++;
                    ForTabData.cnt1[9]=iqty;
                    p10.setText(ForTabData.cnt1[9]+"");
                }
                catch (Exception e)
                {
                    p10.setText("Enter valid Number");
                }

            }
        });

        bdec11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[0] == 0)
                        p1.setText(""+0);
                    else {
                        ForTabData.cnt1[0]--;
                        p1.setText(""+ForTabData.cnt1[0] );
                    }
                }catch (Exception e)
                {
                    p1.setText("Enter valid number");
                }
            }
        });
        bdec12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt1[1]== 0)
                        p2.setText(""+0);
                    else {
                        ForTabData.cnt1[1]--;
                        p2.setText(""+ForTabData.cnt1[1]);
                    }
                }catch (Exception e)
                {
                    p2.setText("Enter valid number");
                }
            }
        });
        bdec13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[2] == 0)
                        p3.setText(""+0);
                    else {
                        ForTabData.cnt1[2]--;
                        p3.setText(""+ForTabData.cnt1[2] );
                    }
                }catch (Exception e)
                {
                    p3.setText("Enter valid number");
                }
            }
        });
        bdec14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[3] == 0)
                        p4.setText(""+0);
                    else {
                        ForTabData.cnt1[3]--;
                        p4.setText(""+ForTabData.cnt1[3] );
                    }
                }catch (Exception e)
                {
                    p4.setText("Enter valid number");
                }
            }
        });
        bdec15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[4] == 0)
                        p5.setText(""+0);
                    else {
                        ForTabData.cnt1[4]--;
                        p5.setText(""+ForTabData.cnt1[4] );
                    }
                }catch (Exception e)
                {
                    p5.setText("Enter valid number");
                }
            }
        });
        bdec16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[5] == 0)
                        p6.setText(""+0);
                    else {
                        ForTabData.cnt1[5]--;
                        p6.setText(""+ForTabData.cnt1[5] );
                    }
                }catch (Exception e)
                {
                    p6.setText("Enter valid number");
                }
            }
        });
        bdec17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[6] == 0)
                        p7.setText(""+0);
                    else {
                        ForTabData.cnt1[6]--;
                        p7.setText(""+ForTabData.cnt1[6] );
                    }
                }catch (Exception e)
                {
                    p7.setText("Enter valid number");
                }
            }
        });
        bdec18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[7] == 0)
                        p8.setText(""+0);
                    else {
                        ForTabData.cnt1[7]--;
                        p8.setText(""+ForTabData.cnt1[7] );
                    }
                }catch (Exception e)
                {
                    p8.setText("Enter valid number");
                }
            }
        });
        bdec19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[8] == 0)
                        p9.setText(""+0);
                    else {
                        ForTabData.cnt1[8]--;
                        p9.setText(""+ForTabData.cnt1[8] );
                    }
                }catch (Exception e)
                {
                    p9.setText("Enter valid number");
                }
            }
        });
        bdec110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt1[9] == 0)
                        p10.setText(""+0);
                    else {
                        ForTabData.cnt1[9]--;
                        p10.setText(""+ForTabData.cnt1[9] );
                    }
                }catch (Exception e)
                {
                    p10.setText("Enter valid number");
                }
            }
        });

        setRetainInstance(true);
        return rootView;
    }

}
