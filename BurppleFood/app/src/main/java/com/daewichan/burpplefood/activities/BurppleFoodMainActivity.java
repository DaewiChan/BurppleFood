package com.daewichan.burpplefood.activities;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;

import com.daewichan.burpplefood.R;
import com.daewichan.burpplefood.adapters.BurppleGuidesFoodAdapter;
import com.daewichan.burpplefood.adapters.ImagesInBurppleFoodAdapter;
import com.daewichan.burpplefood.adapters.NewsAndTrendingAdapter;
import com.daewichan.burpplefood.adapters.PromotionFoodAdapter;
import com.daewichan.burpplefood.viewitems.ImageInBurppleFoodViewItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BurppleFoodMainActivity extends AppCompatActivity {

    @BindView(R.id.rv_promotion)
    RecyclerView rvPromottion;

    @BindView(R.id.rv_burpple_guides)
    RecyclerView rvBurppleGuides;

    @BindView(R.id.rv_news_and_trending)
    RecyclerView rvNewsAndTrendin;

    @BindView(R.id.vp_burpple_food)
    ViewPager vpBurppleFood;

    private PromotionFoodAdapter promotionFoodAdapter;

    private BurppleGuidesFoodAdapter burppleGuidesFoodAdapter;

    private NewsAndTrendingAdapter newsAndTrendingAdapter;

    private ImagesInBurppleFoodAdapter imagesInBurppleFoodAdapter;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burpple_food_main);

        ButterKnife.bind(this, this);

       // ActionBar actionBar = getSupportActionBar();
       // actionBar.setDisplayShowTitleEnabled(false);

        promotionFoodAdapter = new PromotionFoodAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        rvPromottion.setLayoutManager(linearLayoutManager);

        rvPromottion.setAdapter(promotionFoodAdapter);


        burppleGuidesFoodAdapter=new BurppleGuidesFoodAdapter();

        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        rvBurppleGuides.setLayoutManager(linearLayoutManager1);

        rvBurppleGuides.setAdapter(burppleGuidesFoodAdapter);



        newsAndTrendingAdapter=new NewsAndTrendingAdapter();

        GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);

        rvNewsAndTrendin.setAdapter(newsAndTrendingAdapter);

        rvNewsAndTrendin.setLayoutManager(gridLayoutManager);



        imagesInBurppleFoodAdapter=new ImagesInBurppleFoodAdapter();

        vpBurppleFood.setAdapter(imagesInBurppleFoodAdapter);
    }

}
