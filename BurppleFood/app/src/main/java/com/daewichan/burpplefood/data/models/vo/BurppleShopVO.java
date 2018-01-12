package com.daewichan.burpplefood.data.models.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daewichan on 1/12/18.
 */

public class BurppleShopVO {

    @SerializedName( "burpple-shop-id")
    private String shopId;

    @SerializedName("burpple-shop-name")
    private String shopName;

    @SerializedName("burpple-shop-area")
    private String shopArea;

    public String getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopArea() {
        return shopArea;
    }
}
