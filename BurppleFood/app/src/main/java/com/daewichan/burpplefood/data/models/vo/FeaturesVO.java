package com.daewichan.burpplefood.data.models.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daewichan on 1/12/18.
 */

public class FeaturesVO {

    @SerializedName( "burpple-featured-id")
    private String burppleFeatureId;

    @SerializedName("burpple-featured-image")
    private String burppleFeaturedimages;

    @SerializedName("burpple-featured-title")
    private String burppleFeatureTitle;

    @SerializedName("burpple-featured-desc")
    private String burppleFeatureDesc;

    @SerializedName( "burpple-featured-tag")
    private String burppleFeatureTag;

    public String getBurppleFeatureId() {
        return burppleFeatureId;
    }

    public String getBurppleFeaturedImages() {
        return burppleFeaturedimages;
    }

    public String getBurppleFeatureTitle() {
        return burppleFeatureTitle;
    }

    public String getBurppleFeatureDesc() {
        return burppleFeatureDesc;
    }

    public String getBurppleFeatureTag() {
        return burppleFeatureTag;
    }
}
