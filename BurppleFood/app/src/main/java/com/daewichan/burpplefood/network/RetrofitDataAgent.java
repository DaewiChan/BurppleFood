package com.daewichan.burpplefood.network;

import com.daewichan.burpplefood.events.LoadedBurppleFoodEvent;
import com.daewichan.burpplefood.network.responses.GetFeaturesResponse;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by daewichan on 1/10/18.
 */

public class RetrofitDataAgent implements BurppleFoodDataAgent {
    private static RetrofitDataAgent sObjectInstance;
    private RetrofitDataAgent(){

    }

    public static RetrofitDataAgent getsObjectInstance(){
        if (sObjectInstance==null){
            sObjectInstance=new RetrofitDataAgent();
        }
        return sObjectInstance;
    }
    @Override
    public void loadBurppleFood() {

        OkHttpClient httpClient=new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15,TimeUnit.SECONDS)
                .readTimeout(60,TimeUnit.SECONDS)
                .build();

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://padcmyanmar.com/padc-3/burpple-food-places/apis/v1/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(httpClient)
                .build();

        BurppleFoodApi burppleFoodApi=retrofit.create(BurppleFoodApi.class);

        Call<GetFeaturesResponse> getFeaturesResponseCall=burppleFoodApi.loadBurppleFood(1,"b002c7e1a528b7cb460933fc2875e916");
        getFeaturesResponseCall.enqueue(new Callback<GetFeaturesResponse>() {
            @Override
            public void onResponse(Call<GetFeaturesResponse> call, Response<GetFeaturesResponse> response) {
                GetFeaturesResponse getFeaturesResponse=response.body();
                if(getFeaturesResponse.getMmFeature()==null){
                    LoadedBurppleFoodEvent event=new LoadedBurppleFoodEvent(getFeaturesResponse.getMmFeature());
                    EventBus.getDefault().post(event);
                }

            }

            @Override
            public void onFailure(Call<GetFeaturesResponse> call, Throwable t) {

            }
        });


    }
}
