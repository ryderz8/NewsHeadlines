package com.test.newsheadlines.data

import com.test.newsheadlines.network.model.Article

interface DbHelper {
    fun insertArticles(articles: MutableList<Article>): List<Long>

    fun selectArticles(): List<Article>

    fun deleteArticles()
}