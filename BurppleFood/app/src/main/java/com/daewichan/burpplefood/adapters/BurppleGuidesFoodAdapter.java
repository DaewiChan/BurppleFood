package com.daewichan.burpplefood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.viewholder.ItemBurppleGuidesFoodViewHolder;

/**
 * Created by daewichan on 1/6/18.
 */

public class BurppleGuidesFoodAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context=parent.getContext();

        LayoutInflater inflater=LayoutInflater.from(context);

        View burppleGuidesFoodItemView=inflater.inflate(R.layout.item_burpple_guide,parent,false);

        ItemBurppleGuidesFoodViewHolder itemBurppleGuidesFoodViewHolder=new ItemBurppleGuidesFoodViewHolder(burppleGuidesFoodItemView);

        return itemBurppleGuidesFoodViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
