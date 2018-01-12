package com.daewichan.burpplefood.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.data.models.vo.PromotionsVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by daewichan on 1/5/18.
 */

public class ItemBurppleFoodViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_item_promotion)
    ImageView ivItemPromotion;

    @BindView(R.id.tv_promotion_title)
    TextView tvPromotionTitle;

    public ItemBurppleFoodViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setPromotion(PromotionsVO promotion) {
        tvPromotionTitle.setText(promotion.getPromotionTitle());


//        Glide.with(ivItemPromotion.getContext())
//                .load(promotion.getPromotionImage())
//                .into(ivItemPromotion);


        if (promotion.getPromotionImage() != null) {
            ivItemPromotion.setVisibility(View.VISIBLE);
            Glide.with(ivItemPromotion.getContext())
                    .load(promotion.getPromotionImage())
                    .into(ivItemPromotion);
        }else {
            ivItemPromotion.setVisibility(View.GONE);
        }
    }
}
