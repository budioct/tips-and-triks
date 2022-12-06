package com.tutorial.javatips.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CreaditCardBinService {

    @GET("/{binNumber}")
    Call<CreaditCardBin> get(@Path("binNumber") String binNumber);

}
