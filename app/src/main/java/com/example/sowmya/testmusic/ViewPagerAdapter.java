package com.example.sowmya.testmusic;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Sowmya on 20-05-2017.
 */

public class ViewPagerAdapter extends PagerAdapter {



    private Context mContext;
    private int images[];
    public ViewPagerAdapter(Context mContext,int images[]) {
        this.mContext = mContext;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View itemView = LayoutInflater.from(mContext).inflate(R.layout.pageritem, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.pager_image);
        imageView.setImageResource(images[position]);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
