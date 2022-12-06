package com.tutorial.javatips.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface HookBinService {

    @POST("/2qkeWab0QJcdLKbdG7nV")
    Call<HookBinResponse> test(@Body HookBinRequest request);

}
