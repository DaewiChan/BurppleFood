package com.daewichan.burpplefood.network;

import com.daewichan.burpplefood.network.responses.GetFeaturesResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by daewichan on 1/10/18.
 */

public interface BurppleFoodApi {
    @FormUrlEncoded
    @POST("getFeatured.php")
    Call<GetFeaturesResponse> loadBurppleFood(@Field("page") int page,
                                              @Field("access_token") String accessToken);
}
