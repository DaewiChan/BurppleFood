package com.daewichan.burpplefood.data.models;

import com.daewichan.burpplefood.network.BurppleFoodDataAgent;
import com.daewichan.burpplefood.network.OkHttpDataAgent;
import com.daewichan.burpplefood.network.RetrofitDataAgent;

import okhttp3.OkHttpClient;

/**
 * Created by daewichan on 1/10/18.
 */

public class BurppleFoodMdel {
    private static BurppleFoodMdel sObjectInstance;

    private BurppleFoodDataAgent burppleFoodDataAgent;

    private BurppleFoodMdel() {
        //burppleFoodDataAgent= OkHttpDataAgent.getsObjectInstance();
        //burppleFoodDataAgent= RetrofitDataAgent.getsObjectInstance();
        burppleFoodDataAgent= OkHttpDataAgent.getsObjectInstance();
    }

    public static BurppleFoodMdel getsObjectInstance(){
        if (sObjectInstance==null){
            sObjectInstance=new BurppleFoodMdel();
        }
        return sObjectInstance;
    }
    public void loadBurppleFood(){
        burppleFoodDataAgent.loadBurppleFood();

    }
}
