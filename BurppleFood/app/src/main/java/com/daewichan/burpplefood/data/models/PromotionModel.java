package com.daewichan.burpplefood.data.models;

import com.daewichan.burpplefood.network.BurppleFoodDataAgent;
import com.daewichan.burpplefood.network.OkHttpDataAgent;
import com.daewichan.burpplefood.network.PromotionDataAgent;
import com.daewichan.burpplefood.network.PromotionOkHttpDataAgent;

/**
 * Created by daewichan on 1/10/18.
 */

public class PromotionModel {
    private static PromotionModel sObjectInstance;

    private PromotionDataAgent promotionDataAgent;

    private PromotionModel() {
        //burppleFoodDataAgent= OkHttpDataAgent.getsObjectInstance();
        //burppleFoodDataAgent= RetrofitDataAgent.getsObjectInstance();
        promotionDataAgent= PromotionOkHttpDataAgent.getsObjectInstance();
    }

    public static PromotionModel getsObjectInstance(){
        if (sObjectInstance==null){
            sObjectInstance=new PromotionModel();
        }
        return sObjectInstance;
    }
    public void loadPromotion(){
        promotionDataAgent.loadPromotion();

    }
}
