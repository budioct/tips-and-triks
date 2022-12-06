package com.tutorial.javatips.retrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class HookBinApp {

    public static void main(String[] args) throws IOException {

        // https://hookb.in/2qkeWab0QJcdLKbdG7nV

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://hookb.in")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        HookBinService hookBinService = retrofit.create(HookBinService.class);

        HookBinRequest request = HookBinRequest.builder()
                .id("1")
                .firstname("oct")
                .build();

        Call<HookBinResponse> call = hookBinService.test(request); // asychronous
        HookBinResponse response = call.execute().body();// sychronous

        System.out.println(response);

    }



}
