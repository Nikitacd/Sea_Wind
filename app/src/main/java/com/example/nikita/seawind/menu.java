package com.example.nikita.seawind;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class menu extends AppCompatActivity {


    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new soup(),"Soups");
        viewPagerAdapter.addFragments(new manchurian(),"Manchurian");
        viewPagerAdapter.addFragments(new maharashtriandish(),"Maharashtrian Dish");
        viewPagerAdapter.addFragments(new southindian(),"South Indian Dish");
        viewPagerAdapter.addFragments(new tasteofvagitables(),"Taste of Vegitables ");
        viewPagerAdapter.addFragments(new tandoor(),"Tandoor");
        viewPagerAdapter.addFragments(new chawal(),"Chawal ki Khushbu");
        viewPagerAdapter.addFragments(new snacks(),"Snaks");
        viewPagerAdapter.addFragments(new softdrinks(),"Soft Drinks");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}


