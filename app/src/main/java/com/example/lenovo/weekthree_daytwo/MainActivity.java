package com.example.lenovo.weekthree_daytwo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    Button fragment1Button;
    Button fragment2Button;
    Button fragment3Button;

//    Fragment1 fr1;
//    Fragment2 fr2;
//    Fragment3 fr3;
    ViewPager fragmentViewPager;
    LessonPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        System.out.println("commitNr1");
        //A

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1Button = findViewById(R.id.fragment_1_button);
        fragment2Button = findViewById(R.id.fragment_2_button);
        fragment3Button = findViewById(R.id.fragment_3_button);

//        fr1 = new Fragment1();
//        addFragment(fr1);
//        selectButton(0);

        fragmentViewPager = findViewById(R.id.fragment_pager);
        adapter = new LessonPagerAdapter(getSupportFragmentManager());
        fragmentViewPager.setAdapter(adapter);
        selectButton();

        fragmentViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                System.out.println("on moved" + i + " " + v + " " + i1);
            }

            @Override
            public void onPageSelected(int i) {
                selectButton();
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });



        fragment1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int pos = fragmentViewPager.getCurrentItem() - 1;
                if(pos>=0){
                    fragmentViewPager.setCurrentItem(pos);
                }

                //updateFragment(fr1);
                selectButton();
            }
        });

        fragment2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (fr2 == null) {
//                    fr2 = new Fragment2();
//                }
//                updateFragment(fr2);
                selectButton();
            }
        });

        fragment3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = fragmentViewPager.getCurrentItem() + 1;
                if(pos<=fragmentViewPager.getChildCount()){
                    fragmentViewPager.setCurrentItem(pos);
                }


//                if (fr3 == null) {
//                    fr3 = new Fragment3();
//                }
//                updateFragment(fr3);
                selectButton();
            }
        });
    }


//    public void updateFragment(Fragment fragment) {
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.fragment_holder, fragment)
//                .addToBackStack(fragment.getClass().getName())
//                .commit();
//    }
//
//    public void addFragment(Fragment fragment) {
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.fragment_holder, fragment)
//                .commit();
//    }

    private void selectButton() {
        fragment1Button.setTextColor(Color.BLACK);
        fragment1Button.setBackgroundColor(Color.GRAY);
        fragment2Button.setTextColor(Color.BLACK);
        fragment2Button.setBackgroundColor(Color.GRAY);
        fragment3Button.setTextColor(Color.BLACK);
        fragment3Button.setBackgroundColor(Color.GRAY);
        switch (fragmentViewPager.getCurrentItem()) {
            case 0: {
                fragment1Button.setTextColor(Color.WHITE);
                fragment1Button.setBackgroundColor(Color.BLACK);
            }
            break;
            case 1: {
                fragment2Button.setTextColor(Color.WHITE);
                fragment2Button.setBackgroundColor(Color.BLACK);
            }
            break;
            case 2: {
                fragment3Button.setTextColor(Color.WHITE);
                fragment3Button.setBackgroundColor(Color.BLACK);
            }
            break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //selectButton(getFragmentNumber());
    }

//    private int getFragmentNumber() {
//        String fragmentName;
//        int position = getSupportFragmentManager().getBackStackEntryCount();
//        if (position >= 1) {
//            fragmentName = getSupportFragmentManager().getBackStackEntryAt(position - 1).getName();
//        } else {
//            return 0;
//        }
//
//        if (fragmentName.equals(fr1.getClass().getName())) {
//            return 0;
//        } else if (fragmentName.equals(fr2.getClass().getName())) {
//            return 1;
//        } else if (fragmentName.equals(fr3.getClass().getName())) {
//            return 2;
//        } else return 0;
//    }
}
