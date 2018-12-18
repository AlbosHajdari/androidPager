package com.example.lenovo.weekthree_daytwo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LessonPagerAdapter extends FragmentPagerAdapter {
    public LessonPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return new Fragment1();
            }
            case 1:{
                return new Fragment2();
            }
            case 2:{
                return new Fragment3();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
