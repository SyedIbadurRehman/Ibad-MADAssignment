package com.cs191088.assignment1.ui.news

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    private const val baseUrl = "https://newsapi.org/v2/"

    fun getInstance(): Retrofit {
        val gson = GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create()
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()
    }
}