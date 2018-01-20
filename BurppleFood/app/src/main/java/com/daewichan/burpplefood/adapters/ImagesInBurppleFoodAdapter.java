package com.daewichan.burpplefood.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.data.models.vo.FeaturesVO;
import com.daewichan.burpplefood.viewitems.ImageInBurppleFoodViewItem;

import java.util.List;

import butterknife.BindView;

/**
 * Created by daewichan on 1/8/18.
 */

public class ImagesInBurppleFoodAdapter extends PagerAdapter {

    private List<FeaturesVO> mFeatureList = null;

    public ImagesInBurppleFoodAdapter() {

    }

    @Override
    public int getCount() {
        if (mFeatureList != null) {
            return mFeatureList.size();
        }else{
            return 0;
        }

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

        view.setData(mFeatureList.get(position));

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    public void setFeatures(List<FeaturesVO> featuresList){
       this.mFeatureList =featuresList;
        notifyDataSetChanged();
    }
}
