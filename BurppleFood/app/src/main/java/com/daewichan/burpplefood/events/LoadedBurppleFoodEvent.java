package com.daewichan.burpplefood.events;

import com.daewichan.burpplefood.data.models.vo.FeaturesVO;

import java.util.List;

/**
 * Created by daewichan on 1/10/18.
 */

public class LoadedBurppleFoodEvent {
    private List<FeaturesVO> featuresList;

    public LoadedBurppleFoodEvent(List<FeaturesVO> featuresList) {
        this.featuresList = featuresList;
    }

    public List<FeaturesVO> getFeaturesList() {
        return featuresList;
    }
}
