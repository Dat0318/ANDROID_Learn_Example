package com.example.myapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MyAdapter(Context myContext, @NonNull FragmentManager fm, int totalTabs) {
        super(fm);
        this.myContext = myContext;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                SportFragment sportFragment = new SportFragment();
                return sportFragment;
            case 2:
                MovieFragment movieFragment = new MovieFragment();
                return movieFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
