package com.daewichan.burpplefood.events;

import com.daewichan.burpplefood.data.models.vo.PromotionsVO;

import java.util.List;

/**
 * Created by daewichan on 1/10/18.
 */

public class LoadedPromotionEvent {

    private List<PromotionsVO> promotionList;

    public LoadedPromotionEvent(List<PromotionsVO> promotionList) {
        this.promotionList = promotionList;
    }

    public List<PromotionsVO> getPromotionList() {
        return promotionList;
    }
}
