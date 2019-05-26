package com.test.newsheadlines.network

import com.test.newsheadlines.data.Config
import com.test.newsheadlines.network.model.Headlines
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by amresh on 24/05/2019
 */
class AppApiHelper @Inject constructor(private val apiService: APIService) : ApiHelper{

    override fun getArticles(): Observable<Headlines?> {

        return apiService.getArticles("in", Config.API_KEY)
    }
}