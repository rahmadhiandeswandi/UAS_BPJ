package com.informatika.rahmadhiandeswandi_19100016_parkir

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class koneksi {
    companion object{
        var retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.112.196/parkir/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var service: ApiService = retrofit.create(ApiService::class.java)
    }
}