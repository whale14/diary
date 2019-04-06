package com.example.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mainPager = findViewById(R.id.pager_main);
        MainPagerAdapter pagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        mainPager.setAdapter(pagerAdapter);

        TabLayout mainTab = findViewById(R.id.main_tab);
        mainTab.setupWithViewPager(mainPager);

        mainTab.getTabAt(0).setIcon(R.drawable.ic_edit_hover);
        mainTab.getTabAt(1).setIcon(R.drawable.ic_home_hover);
        mainTab.getTabAt(2).setIcon(R.drawable.ic_person_hover);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }


}
