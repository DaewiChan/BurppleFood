package com.daewichan.burpplefood.network;

import android.os.AsyncTask;
import android.util.Log;

import com.daewichan.burpplefood.MMBurppleFoodApp;
import com.daewichan.burpplefood.events.LoadedBurppleFoodEvent;
import com.daewichan.burpplefood.events.LoadedPromotionEvent;
import com.daewichan.burpplefood.network.responses.GetFeaturesResponse;
import com.daewichan.burpplefood.network.responses.GetPromotionsResponse;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.TimeUnit;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * Created by daewichan on 1/10/18.
 */

public class PromotionOkHttpDataAgent implements PromotionDataAgent {

    private static PromotionOkHttpDataAgent sObjectInstance;
    private PromotionOkHttpDataAgent(){

    }

    public static PromotionOkHttpDataAgent getsObjectInstance(){
        if(sObjectInstance==null){
            sObjectInstance=new PromotionOkHttpDataAgent();
        }
        return sObjectInstance;
    }


    @Override
    public void loadPromotion() {
        new LoadedPromotionTask().execute("http://padcmyanmar.com/padc-3/burpple-food-places/apis/v1/getPromotions.php");
    }

    private static class LoadedPromotionTask extends AsyncTask<String, Void, String>{
        @Override
        protected String doInBackground(String... urls) {
            String url= urls[0];

            OkHttpClient httpClient=new OkHttpClient.Builder()//1
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .writeTimeout(15,TimeUnit.SECONDS)
                    .readTimeout(60,TimeUnit.SECONDS)
                    .build();


            RequestBody formBody=new FormBody.Builder()
                    .add("access_token","b002c7e1a528b7cb460933fc2875e916")
                    .add("page","1")
                    .build();

            Request request=new Request.Builder()
                    .url(url)
                    .post(formBody)
                    .build();

            String responseString=null;
            try{
                Response response = httpClient.newCall(request).execute();
            if (response.isSuccessful() && response.body()!=null){
                responseString=response.body().string();

            }

            }catch (Exception e){
                Log.e(MMBurppleFoodApp.LOG_TAG, e.getMessage());

            }

            return responseString;
        }

        @Override
        protected void onPostExecute(String response) {
            super.onPostExecute(response);

            Gson gson=new Gson();
            GetPromotionsResponse getPromotionsResponse=gson.fromJson(response,GetPromotionsResponse.class);

            LoadedPromotionEvent event=new LoadedPromotionEvent(getPromotionsResponse.getMmPromotion());
            EventBus eventBus=EventBus.getDefault();
            eventBus.post(event);
        }
    }


}
