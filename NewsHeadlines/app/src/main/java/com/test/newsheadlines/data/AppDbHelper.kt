package com.test.newsheadlines.data

import com.test.newsheadlines.data.room.AppDatabase
import com.test.newsheadlines.network.model.Article
import javax.inject.Inject

class AppDbHelper @Inject constructor(private val appDatabase: AppDatabase): DbHelper {
    override fun insertArticles(articles: MutableList<Article>): List<Long> {
        return appDatabase.articleDao().insertArticles(articles)
    }

    override fun selectArticles(): List<Article> {
        return appDatabase.articleDao().selectArticles()
    }

    override fun deleteArticles() {
        return appDatabase.articleDao().deleteArticles()
    }

}