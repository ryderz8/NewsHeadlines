package com.test.newsheadlines.network

import com.test.newsheadlines.network.model.Headlines
import io.reactivex.Observable


/**
 * Created by amresh on 24/05/2019
 */

interface ApiHelper {
    fun getArticles(): Observable<Headlines?>
}