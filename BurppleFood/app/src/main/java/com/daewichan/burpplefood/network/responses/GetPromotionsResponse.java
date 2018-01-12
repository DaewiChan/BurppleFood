package com.daewichan.burpplefood.network.responses;

import com.daewichan.burpplefood.data.models.vo.FeaturesVO;
import com.daewichan.burpplefood.data.models.vo.PromotionsVO;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daewichan on 1/10/18.
 */

public class GetPromotionsResponse {

    private int code;
    private String message;
    private String  apiVersion;
    private String page;

    @SerializedName( "promotions")
    private List<PromotionsVO> mmPromotion;


    public String getApiVersion(){
        return apiVersion;
    }
    public int getCode() {
        return code;
    }

    public String getMessage() {return message;}

    public String getPage() {
        return page;
    }

    public List<PromotionsVO> getMmPromotion() {
        return mmPromotion;
    }
}
