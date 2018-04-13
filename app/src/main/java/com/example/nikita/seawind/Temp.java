package com.example.nikita.seawind;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Temp extends AppCompatActivity
{


    int bill=0;
    String str1="";
    String str2="";
    String str3="";
    String str4="";
    String str5="";
    String str6="";
    String str7="";
    String str8="";
    String str9="";
    String str="";
    static String s="";

    ViewPager vp;
    Button place;

    TabLayout tb;
    String tableNumber;
    private DatabaseReference mref;
    HashMap<String,String> hm;
    HashMap<String,String> hm1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        Log.d("Tabs","Error in temp");
        tb=findViewById(R.id.tl);
        vp=findViewById(R.id.vp);
        Intent intent=getIntent();
        tableNumber=intent.getExtras().getString("table");
        Toast.makeText(getApplicationContext(),tableNumber,Toast.LENGTH_SHORT).show();
        //Toolbar toolbar =findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
       // getSupportActionBar().setHomeButtonEnabled(true);


     mref = FirebaseDatabase.getInstance().getReference().child("menuDetails");

        MyAdapter adapter  = new MyAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        tb.setupWithViewPager(vp);
        Log.d("Tabs","Error in temp");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        int b1=0, b2=0, b3=0, b4=0, b5=0,b6=0,b7=0,b8=0,b9=0;
        if (id == R.id.action_order) {
            try
            {
                for (int i = 0; i < 10; i++) {
                    if (ForTabData.cnt1[i] != 0 ) {

                        b1 = b1 + soup.price1[i] * ForTabData.cnt1[i];
                        str1 += soup.menu1[i] + "(" + ForTabData.cnt1[i] + ")="+soup.price1[i] * ForTabData.cnt1[i]+",";
                        Log.e("Previous :",str1);

                    }
                    ForTabData.cnt1[i]=0;
                }
                for(int i=0;i<10;i++)
                {
                    if(ForTabData.cnt2[i] != 0)
                    {
                        b2 = b2 + manchurian.price2[i] * ForTabData.cnt2[i];
                        str2 += manchurian.menu2[i] + "(" + ForTabData.cnt2[i] + ")="+manchurian.price2[i] * ForTabData.cnt2[i]+",";
                    }
                    ForTabData.cnt2[i]=0;
                }
                for(int i=0;i<10;i++)
                {
                    if(ForTabData.cnt3[i] != 0)
                    {
                        b3 = b3 + maharashtriandish.price3[i] * ForTabData.cnt3[i];
                        str3 += maharashtriandish.menu3[i] + "(" + ForTabData.cnt3[i] + ")=" + maharashtriandish.price3[i] * ForTabData.cnt3[i]+",";
                    }
                    ForTabData.cnt3[i]=0;
                }
                for(int i=0;i<10;i++)
                {
                    if(ForTabData.cnt4[i] != 0)
                    {
                        b4 = b4 + southindian.price4[i] * ForTabData.cnt4[i];
                        str4 += southindian.menu4[i] + "(" + ForTabData.cnt4[i] + ")=" + southindian.price4[i] * ForTabData.cnt4[i]+",";
                    }
                    ForTabData.cnt4[i]=0;
                }
                for(int i=0;i<10;i++)
                {
                    if(ForTabData.cnt5[i] != 0)
                    {
                        b5 = b5 + tasteofvagitables.price5[i] * ForTabData.cnt5[i];
                        str5 += tasteofvagitables.menu5[i] + "(" + ForTabData.cnt5[i] + ")=" + tasteofvagitables.price5[i] * ForTabData.cnt5[i]+",";
                    }
                    ForTabData.cnt5[i]=0;
                }

                for(int i=0;i<10;i++)
                {
                    if(ForTabData.cnt6[i] != 0)
                    {
                        b6 = b6 + tandoor.price6[i] * ForTabData.cnt6[i];
                        str6 += tandoor.menu6[i] + "(" + ForTabData.cnt6[i] + ")=" + tandoor.price6[i] * ForTabData.cnt6[i]+",";
                    }
                    ForTabData.cnt6[i]=0;
                }

                for(int i=0;i<10;i++) {
                    if (ForTabData.cnt7[i] != 0) {
                        b7 = b7 + chawal.price7[i] * ForTabData.cnt7[i];
                        str7 += chawal.menu7[i] + "(" + ForTabData.cnt7[i] + ")=" + chawal.price7[i] * ForTabData.cnt7[i] + ",";
                    }
                    ForTabData.cnt7[i]=0;
                }

                    for(int i=0;i<10;i++)
                    {
                    if(ForTabData.cnt8[i] != 0)
                    {
                        b8 = b8 + snacks.price8[i] * ForTabData.cnt8[i];
                        str8 += snacks.menu8[i] + "(" + ForTabData.cnt8[i] + ")=" + snacks.price8[i] * ForTabData.cnt8[i]+",";
                    }
                        ForTabData.cnt8[i]=0;
                }

                    for(int i=0;i<10;i++)
                    {
                        if(ForTabData.cnt9[i] != 0)
                        {
                            b9 = b9 + softdrinks.price9[i] * ForTabData.cnt9[i];
                            str9 += softdrinks.menu9[i] + "(" + ForTabData.cnt9[i] + ")=" + softdrinks.price9[i] * ForTabData.cnt9[i]+",";
                        }
                        ForTabData.cnt9[i]=0;
                    }



                bill=b1+b2+b3+b4+b5+b6+b7+b8+b9;
                str = str1+str2+ str3+ str4+str5+str6+str7+str8+str9+"Bill="+bill;
                // Log.e("table no",""+MainActivity.tablno);
                s = "Table No:"+tableNumber+"\nSoup : "+b1+"\nManchurian : "+b2+"\nMaharashtrian Dish : "+b3+"\nSouth Indian : "+b4+"\nTaste Of vegitables  : "+b5+"\nTandoor :  "+b6+"\nChawal ki Khushabu :"+b7+"\nSnacks :"+b8+"\nSoft Drinks :"+b9+"\n\nTotal="+bill;
                //String s1= "Soup :"+str1+"\n\nManchurian :"+str2+"\n\nMaharashtrian Dish"+str3+"\n\nSouth Indin :"+str4+"\n\nTase of Vegitables"+str5+"\n\nTandoor :"+str6+"\n\nChawal :"+str7+"\n\nSnacks :"+str8+"\n\nSoft Drinks"+str9;
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("Selected menu:");
                ad.setMessage(s);
                //ad.setMessage(s1);




                ad.setPositiveButton("Place", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        hm = new HashMap<String, String>();
                        hm.put("Soup",str1);
                        hm.put("Manchurian",str2);
                        hm.put("Maharashtrian dish",str3);
                        hm.put("south Indian",str4);
                        hm.put("Taste Of vegitables",str5);
                        hm.put("Tandoor",str6);
                        hm.put("Chawal ki Khushbu",str7);
                        hm.put("Snacks",str8);
                        hm.put("Soft Drinks",str9);
                        hm.put("seen",Integer.toString(0));
                        hm.put("Mseen",Integer.toString(0));
                        hm.put("bill",Integer.toString(bill));
                        hm.put("tableNumber",tableNumber);
                        mref.push().setValue(hm);



                       /* hm1=new HashMap<String, String>();
                        hm1.put("Soup",str1);
                        hm1.put("Manchurian",str2);
                        hm1.put("Maharashtrian",str3);
                        hm1.put("South Indian",str4);
                        hm1.*/





                        dialog.dismiss();



                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        Toast.makeText(getApplicationContext(), "Order Placed !", Toast.LENGTH_LONG).show();
                        finish();

                        startActivity(new Intent(getApplicationContext(),thankyou.class));

                        //if(isConnected())
                        //    placeOrder(str);
                        // else
                        //Snackbar.make(findViewById(R.id.this), "Please check the data connection !", Snackbar.LENGTH_LONG).show();
                    }
                });
                ad.show();


            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            return true;
        }

        return super.onOptionsItemSelected(item);
    }







    /**
     *
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static Temp.PlaceholderFragment newInstance(int sectionNumber) {
            Temp.PlaceholderFragment fragment = new Temp.PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_soup, container, false);

            return rootView;
        }
    }


    //class2 end

    class MyAdapter extends FragmentStatePagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fm=null;
            if(position==0)
            {
                fm=new soup();
            }
            if(position==1)
            {
                fm=new manchurian();
            }
            if(position==2)
            {
                fm=new maharashtriandish();
            }
            if(position==3)
            {
                fm=new southindian();
            }
            if(position==4)
            {
                fm=new tasteofvagitables();
            }
            if(position==5)
            {
                fm=new tandoor();
            }
            if(position==6)
            {
                fm=new chawal();
            }
            if(position==7)
            {
                fm=new snacks();
            }
            if(position==8)
            {
                fm=new softdrinks();
            }
            return fm;
        }

        @Override
        public int getCount() {
            return 9;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title="";
            if(position==0)
            {   Log.d("Tabs","Error in temp");
                title="SOUP";
            }
            if(position==1)
            {
                Log.d("Tabs","Error in temp");
                title="MANCHURIAN";
            }
            if(position==2)
            { Log.d("Tabs","Error in temp");
                title="MAHARASHTRIAN";
            }
            if(position==3)
            {
                Log.d("Tabs","Error in temp");
                title="SOUTH INDIAN";
            }
            if(position==4)
            {
                Log.d("Tabs","Error in temp");
                title="TASTE OF VEGITABLES";
            }
            if(position==5)
            {
                Log.d("Tabs","Error in temp");
                title="TANDOOR";
            }
            if(position==6)
            {
                Log.d("Tabs","Error in temp");
                title="CHAWAL KI KHUSHBOO";
            }
            if(position==7)
            {
                Log.d("Tabs","Error in temp");
                title="SNACKS";
            }
            if(position==8)
            {
                Log.d("Tabs","Error in temp");
                title="SOFT DRINKS";
            }



            return title;
        }


    }
    public static boolean isConnected() {
        boolean res=false;
        try {
            String command = "ping -c 1 google.com";
            res = Runtime.getRuntime().exec(command).waitFor() == 0;
        }catch(Exception e){}
        return res;
    }


}

