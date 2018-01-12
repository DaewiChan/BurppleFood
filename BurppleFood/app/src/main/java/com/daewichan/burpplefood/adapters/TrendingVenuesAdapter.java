package com.daewichan.burpplefood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.viewholder.ItemTrendingVenues;

/**
 * Created by daewichan on 1/9/18.
 */

public class TrendingVenuesAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View trendingVenues=inflater.inflate(R.layout.item_trending_venues,parent,false);
        ItemTrendingVenues itemTrendingVenues=new ItemTrendingVenues(trendingVenues);
        return itemTrendingVenues;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
