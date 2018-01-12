package com.daewichan.burpplefood.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.data.models.vo.PromotionsVO;
import com.daewichan.burpplefood.viewholder.ItemBurppleFoodViewHolder;

import java.util.List;

/**
 * Created by daewichan on 1/5/18.
 */

public class PromotionFoodAdapter extends RecyclerView.Adapter<ItemBurppleFoodViewHolder> {

    private List<PromotionsVO> mPromotionList = null;

    public PromotionFoodAdapter() {
    }

    @Override
    public ItemBurppleFoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context=parent.getContext();

        LayoutInflater inflater=LayoutInflater.from(context);

        View burppleFoodItemView=inflater.inflate(R.layout.item_promotion,parent,false);

        ItemBurppleFoodViewHolder itemBurppleFoodViewHolder=new ItemBurppleFoodViewHolder(burppleFoodItemView);

        return itemBurppleFoodViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemBurppleFoodViewHolder holder, int position) {
        holder.setPromotion(mPromotionList.get(position));
    }

    @Override
    public int getItemCount() {
       if (mPromotionList != null){
           return mPromotionList.size();
       }else{
           return 0;
       }
    }

    public void setPromotion(List<PromotionsVO> promotionList){
        this.mPromotionList=promotionList;
        notifyDataSetChanged();
    }
}
