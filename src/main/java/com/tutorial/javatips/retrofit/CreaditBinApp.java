package com.tutorial.javatips.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class CreaditBinApp {

    public static void main(String[] args) throws IOException {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://lookup.binlist.net")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        CreaditCardBinService service = retrofit.create(CreaditCardBinService.class);

        CreaditCardBin bin = service.get("45717360").execute().body();

        System.out.println(bin);

    }


}
