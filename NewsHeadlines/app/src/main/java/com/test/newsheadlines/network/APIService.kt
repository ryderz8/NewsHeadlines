package com.test.newsheadlines.network

import com.test.newsheadlines.network.model.Headlines
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by amresh on 24/05/2019
 */

interface APIService{

    @GET("top-headlines")
    fun getArticles(@Query("country") country: String, @Query("apiKey") apiKey: String
    ): Observable<Headlines?>
}
