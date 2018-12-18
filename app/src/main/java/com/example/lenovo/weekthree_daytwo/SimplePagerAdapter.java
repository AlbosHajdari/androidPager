package com.example.lenovo.weekthree_daytwo;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SimplePagerAdapter extends PagerAdapter {
    LayoutInflater inflater;

    public SimplePagerAdapter(LayoutInflater inflater){
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return 13;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View v = inflater.inflate(R.layout.pager_item, container, false);
        TextView textView = v.findViewById(R.id.page_pos);
        textView.setText(""+position);
        container.addView(v);
        return v;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
