package com.daewichan.burpplefood.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.daewichan.burpplefood.MMBurppleFoodApp;
import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.adapters.BurppleGuidesFoodAdapter;
import com.daewichan.burpplefood.adapters.ImagesInBurppleFoodAdapter;
import com.daewichan.burpplefood.adapters.NewlyOpenedAdapter;
import com.daewichan.burpplefood.adapters.PromotionFoodAdapter;
import com.daewichan.burpplefood.adapters.TrendingVenuesAdapter;
import com.daewichan.burpplefood.data.models.BurppleFoodMdel;
import com.daewichan.burpplefood.data.models.PromotionModel;
import com.daewichan.burpplefood.events.LoadedBurppleFoodEvent;
import com.daewichan.burpplefood.events.LoadedPromotionEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BurppleFoodMainActivity extends AppCompatActivity {

    @BindView(R.id.rv_promotion)
    RecyclerView rvPromottion;

    @BindView(R.id.rv_burpple_guides)
    RecyclerView rvBurppleGuides;

    @BindView(R.id.rv_newly_opened)
    RecyclerView rvNewlyOpened;

    @BindView(R.id.rv_trending_venues)
    RecyclerView rvTrendingVenues;

    @BindView(R.id.vp_burpple_food)
    ViewPager vpBurppleFood;

    private PromotionFoodAdapter promotionFoodAdapter;

    private BurppleGuidesFoodAdapter burppleGuidesFoodAdapter;

    private ImagesInBurppleFoodAdapter imagesInBurppleFoodAdapter;

    private NewlyOpenedAdapter newlyOpenedAdapter;

    private TrendingVenuesAdapter trendingVenuesAdapter;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burpple_food_main);

        ButterKnife.bind(this, this);

        promotionFoodAdapter = new PromotionFoodAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvPromottion.setLayoutManager(linearLayoutManager);
        rvPromottion.setAdapter(promotionFoodAdapter);


        burppleGuidesFoodAdapter=new BurppleGuidesFoodAdapter();
        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvBurppleGuides.setLayoutManager(linearLayoutManager1);
        rvBurppleGuides.setAdapter(burppleGuidesFoodAdapter);


        imagesInBurppleFoodAdapter=new ImagesInBurppleFoodAdapter();
        vpBurppleFood.setAdapter(imagesInBurppleFoodAdapter);


        newlyOpenedAdapter=new NewlyOpenedAdapter();
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        rvNewlyOpened.setAdapter(newlyOpenedAdapter);
        rvNewlyOpened.setLayoutManager(linearLayoutManager2);

        trendingVenuesAdapter=new TrendingVenuesAdapter();
        LinearLayoutManager linearLayoutManager3=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        rvTrendingVenues.setAdapter(trendingVenuesAdapter);
        rvTrendingVenues.setLayoutManager(linearLayoutManager3);

        BurppleFoodMdel.getsObjectInstance().loadBurppleFood();
        PromotionModel.getsObjectInstance().loadPromotion();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFeaturesLoaded(LoadedBurppleFoodEvent event){
        Log.d(MMBurppleFoodApp.LOG_TAG,"onFeaturesLoaded:"+event.getFeaturesList().size());
        imagesInBurppleFoodAdapter.setFeatures(event.getFeaturesList());
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFeaturesLoaded(LoadedPromotionEvent event){
        Log.d(MMBurppleFoodApp.LOG_TAG,"onFeaturesLoaded:"+event.getPromotionList().size());
        promotionFoodAdapter.setPromotion(event.getPromotionList());
    }
}
