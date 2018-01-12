package com.daewichan.burpplefood.data.models.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daewichan on 1/12/18.
 */

public class PromotionsVO {

    @SerializedName( "burpple-promotion-id")
    private String promotionId;

    @SerializedName("burpple-promotion-image")
    private String promotionImage;

    @SerializedName("burpple-promotion-title")
    private String promotionTitle;

    @SerializedName("burpple-promotion-until")
    private String promotionUntilDate;

    @SerializedName("burpple-promotion-shop")
    private BurppleShopVO promotionShop;

    @SerializedName( "is-burpple-exclusive")
    private Boolean promotionIsExclusive;

    @SerializedName( "burpple-promotion-terms")
    private List<String> promotionTerms;

    public String getPromotionId() {
        return promotionId;
    }

    public String getPromotionImage() {
        return promotionImage;
    }

    public String getPromotionTitle() {
        return promotionTitle;
    }

    public String getPromotionUntilDate() {
        return promotionUntilDate;
    }

    public BurppleShopVO getPromotionShop() {
        return promotionShop;
    }

    public Boolean getPromotionIsExclusive() {
        return promotionIsExclusive;
    }

    public List<String> getPromotionTerms() {
        return promotionTerms;
    }
}
