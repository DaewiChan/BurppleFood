package com.daewichan.burpplefood.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.viewitems.ImageInBurppleFoodViewItem;

/**
 * Created by daewichan on 1/8/18.
 */

public class ImagesInBurppleFoodAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
      return (view==(View) object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Context context=container.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        ImageInBurppleFoodViewItem view=(ImageInBurppleFoodViewItem)layoutInflater.inflate(R.layout.item_burpple_food_image,container,false);

        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }
}
