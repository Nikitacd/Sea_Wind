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

public class snacks extends Fragment{
    public snacks() {
    }

    static String[] menu8;
    static int[] price8;
    static int[] cnt8;
    static TextView k1;
    static TextView k2;
    static TextView k3;
    static TextView k4;
    static TextView k5;
    static TextView k6;
    static TextView k7;
    static TextView k8;
    static TextView k9;
    static TextView k10;
    ViewPager pager;
    Button binc81;
    Button binc82;
    Button binc83;
    Button binc84;
    Button binc85;
    Button binc86;
    Button binc87;
    Button binc88;
    Button binc89;
    Button binc810;

    Button bdec81;
    Button bdec82;
    Button bdec83;
    Button bdec84;
    Button bdec85;
    Button bdec86;
    Button bdec87;
    Button bdec88;
    Button bdec89;
    Button bdec810;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_snacks,container,false);
        menu8 = new String[]{"Paneer Pakoda","Cheeze Paineapple Sticks","Onion Pakoda","Finger Chips","Roasted Papad","Fried Papad","Masala Papad","Green Salad","Cucumber Salad","Cheeze Pakoda"};
        price8=new int[]{80,130,50,60,15,20,30,60,40,70};

        k1 = (TextView) rootView.findViewById(R.id.k1);
        k2 = (TextView) rootView.findViewById(R.id.k2);
        k3 = (TextView) rootView.findViewById(R.id.k3);
        k4 = (TextView) rootView.findViewById(R.id.k4);
        k5 = (TextView) rootView.findViewById(R.id.k5);
        k6 = (TextView) rootView.findViewById(R.id.k6);
        k7 = (TextView) rootView.findViewById(R.id.k7);
        k8 = (TextView) rootView.findViewById(R.id.k8);
        k9 = (TextView) rootView.findViewById(R.id.k9);
        k10 = (TextView) rootView.findViewById(R.id.k10);
        pager=(ViewPager)rootView.findViewById(R.id.pager);
        cnt8=new int[9];

        if(ForTabData.flg8>0) {
            k1.setText(new Integer(ForTabData.cnt8[0]).toString());
            k2.setText(new Integer(ForTabData.cnt8[1]).toString());
            k3.setText(new Integer(ForTabData.cnt8[2]).toString());
            k4.setText(new Integer(ForTabData.cnt8[3]).toString());
            k5.setText(new Integer(ForTabData.cnt8[4]).toString());
            k6.setText(new Integer(ForTabData.cnt8[5]).toString());
            k7.setText(new Integer(ForTabData.cnt8[6]).toString());
            k8.setText(new Integer(ForTabData.cnt8[7]).toString());
            k9.setText(new Integer(ForTabData.cnt8[8]).toString());
            k10.setText(new Integer(ForTabData.cnt8[9]).toString());
        }

        binc81 = (Button) rootView.findViewById(R.id.binc81);
        binc82 = (Button) rootView.findViewById(R.id.binc82);
        binc83 = (Button) rootView.findViewById(R.id.binc83);
        binc84 = (Button) rootView.findViewById(R.id.binc84);
        binc85 = (Button) rootView.findViewById(R.id.binc85);
        binc86 = (Button) rootView.findViewById(R.id.binc86);
        binc87 = (Button) rootView.findViewById(R.id.binc87);
        binc88 = (Button) rootView.findViewById(R.id.binc88);
        binc89 = (Button) rootView.findViewById(R.id.binc89);
        binc810 = (Button) rootView.findViewById(R.id.binc810);

        bdec81 = (Button) rootView.findViewById(R.id.bdec81);
        bdec82 = (Button) rootView.findViewById(R.id.bdec82);
        bdec83 = (Button) rootView.findViewById(R.id.bdec83);
        bdec84 = (Button) rootView.findViewById(R.id.bdec84);
        bdec85 = (Button) rootView.findViewById(R.id.bdec85);
        bdec86 = (Button) rootView.findViewById(R.id.bdec86);
        bdec87 = (Button) rootView.findViewById(R.id.bdec87);
        bdec88 = (Button) rootView.findViewById(R.id.bdec88);
        bdec89 = (Button) rootView.findViewById(R.id.bdec89);
        bdec810 = (Button) rootView.findViewById(R.id.bdec810);

        binc81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k1.getText());
                    iqty++;
                    ForTabData.cnt8[0]=iqty;
                    k1.setText(ForTabData.cnt8[0]+"");
                }
                catch (Exception e)
                {
                    k1.setText("Enter valid Number");
                }

            }
        });


        binc82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k2.getText());
                    iqty++;
                    ForTabData.cnt8[1]=iqty;
                    k2.setText(ForTabData.cnt8[1]+"");
                }
                catch (Exception e)
                {
                    k2.setText("Enter valid Number");
                }

            }
        });


        binc83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k3.getText());
                    iqty++;
                    ForTabData.cnt8[2]=iqty;
                    k3.setText(ForTabData.cnt8[2]+"");
                }
                catch (Exception e)
                {
                    k3.setText("Enter valid Number");
                }

            }
        });




        binc84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k4.getText());
                    iqty++;
                    ForTabData.cnt8[3]=iqty;
                    k4.setText(ForTabData.cnt8[3]+"");
                }
                catch (Exception e)
                {
                    k4.setText("Enter valid Number");
                }

            }
        });



        binc85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k5.getText());
                    iqty++;
                    ForTabData.cnt8[4]=iqty;
                    k5.setText(ForTabData.cnt8[4]+"");
                }
                catch (Exception e)
                {
                    k5.setText("Enter valid Number");
                }

            }
        });


        binc86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k6.getText());
                    iqty++;
                    ForTabData.cnt8[5]=iqty;
                    k6.setText(ForTabData.cnt8[5]+"");
                }
                catch (Exception e)
                {
                    k6.setText("Enter valid Number");
                }

            }
        });


        binc87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k7.getText());
                    iqty++;
                    ForTabData.cnt8[6]=iqty;
                    k7.setText(ForTabData.cnt8[6]+"");
                }
                catch (Exception e)
                {
                    k7.setText("Enter valid Number");
                }

            }
        });






        binc88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k8.getText());
                    iqty++;
                    ForTabData.cnt8[7]=iqty;
                    k8.setText(ForTabData.cnt8[7]+"");
                }
                catch (Exception e)
                {
                    k8.setText("Enter valid Number");
                }

            }
        });




        binc89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k9.getText());
                    iqty++;
                    ForTabData.cnt8[8]=iqty;
                    k9.setText(ForTabData.cnt8[8]+"");
                }
                catch (Exception e)
                {
                    k9.setText("Enter valid Number");
                }

            }
        });



        binc810.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ForTabData.flg8=1;
                    int iqty=Integer.parseInt((String) k10.getText());
                    iqty++;
                    ForTabData.cnt8[9]=iqty;
                    k10.setText(ForTabData.cnt8[9]+"");
                }
                catch (Exception e)
                {
                    k10.setText("Enter valid Number");
                }

            }
        });

        bdec81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[0] == 0)
                        k1.setText(""+0);
                    else {
                        ForTabData.cnt8[0]--;
                        k1.setText(""+ForTabData.cnt8[0] );
                    }
                }catch (Exception e)
                {
                    k1.setText("Enter valid number");
                }
            }
        });
        bdec82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    // int dqty11 = Integer.parseInt((String) p2.getText());
                    if (ForTabData.cnt8[1]== 0)
                        k2.setText(""+0);
                    else {
                        ForTabData.cnt8[1]--;
                        k2.setText(""+ForTabData.cnt8[1]);
                    }
                }catch (Exception e)
                {
                    k2.setText("Enter valid number");
                }
            }
        });
        bdec83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[2] == 0)
                        k3.setText(""+0);
                    else {
                        ForTabData.cnt8[2]--;
                        k3.setText(""+ForTabData.cnt8[2] );
                    }
                }catch (Exception e)
                {
                    k3.setText("Enter valid number");
                }
            }
        });
        bdec84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[3] == 0)
                        k4.setText(""+0);
                    else {
                        ForTabData.cnt8[3]--;
                        k4.setText(""+ForTabData.cnt8[3] );
                    }
                }catch (Exception e)
                {
                    k4.setText("Enter valid number");
                }
            }
        });
        bdec85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[4] == 0)
                        k5.setText(""+0);
                    else {
                        ForTabData.cnt8[4]--;
                        k5.setText(""+ForTabData.cnt8[4] );
                    }
                }catch (Exception e)
                {
                    k5.setText("Enter valid number");
                }
            }
        });
        bdec86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[5] == 0)
                        k6.setText(""+0);
                    else {
                        ForTabData.cnt8[5]--;
                        k6.setText(""+ForTabData.cnt8[5] );
                    }
                }catch (Exception e)
                {
                    k6.setText("Enter valid number");
                }
            }
        });
        bdec87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[6] == 0)
                        k7.setText(""+0);
                    else {
                        ForTabData.cnt8[6]--;
                        k7.setText(""+ForTabData.cnt8[6] );
                    }
                }catch (Exception e)
                {
                    k7.setText("Enter valid number");
                }
            }
        });
        bdec88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[7] == 0)
                        k8.setText(""+0);
                    else {
                        ForTabData.cnt8[7]--;
                        k8.setText(""+ForTabData.cnt8[7] );
                    }
                }catch (Exception e)
                {
                    k8.setText("Enter valid number");
                }
            }
        });
        bdec89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[8] == 0)
                        k9.setText(""+0);
                    else {
                        ForTabData.cnt8[8]--;
                        k9.setText(""+ForTabData.cnt8[8] );
                    }
                }catch (Exception e)
                {
                    k9.setText("Enter valid number");
                }
            }
        });
        bdec810.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    //int dqty11 = Integer.parseInt((String) p1.getText());
                    if (ForTabData.cnt8[9] == 0)
                        k10.setText(""+0);
                    else {
                        ForTabData.cnt8[9]--;
                        k10.setText(""+ForTabData.cnt8[9] );
                    }
                }catch (Exception e)
                {
                    k10.setText("Enter valid number");
                }
            }
        });

        setRetainInstance(true);
        return rootView;
    }

}
