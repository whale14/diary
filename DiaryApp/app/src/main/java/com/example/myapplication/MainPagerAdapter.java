package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myapplication.fragments.WriteFragment;
import com.example.myapplication.fragments.HomeFragment;
import com.example.myapplication.fragments.MyPageFragment;

import java.util.ArrayList;

public class MainPagerAdapter extends FragmentPagerAdapter{
    private ArrayList<Fragment> mData;
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);

        mData = new ArrayList<>();
        mData.add(new WriteFragment());
        mData.add(new HomeFragment());
        mData.add(new MyPageFragment());
    }

    @Override
    public Fragment getItem(int i) {
        return mData.get(i);
    }

    @Override
    public int getCount() {
        return mData.size();
    }
}
