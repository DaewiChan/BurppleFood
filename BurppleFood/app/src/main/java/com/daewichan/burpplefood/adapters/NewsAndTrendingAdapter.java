package com.daewichan.burpplefood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.viewholder.ItemNewsAndTrendingViewHolder;

/**
 * Created by daewichan on 1/7/18.
 */

public class NewsAndTrendingAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsAndTrendingItemView=inflater.inflate(R.layout.item_news_and_trending,parent,false);
        ItemNewsAndTrendingViewHolder itemNewsAndTrendingViewHolder=new ItemNewsAndTrendingViewHolder(newsAndTrendingItemView);
        return itemNewsAndTrendingViewHolder;


    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

}