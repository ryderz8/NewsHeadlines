package com.test.newsheadlines.data.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.test.newsheadlines.network.model.Article

/**
 * Created by amresh on 25/05/2019
 */
@Dao
interface ArticleDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertArticles(articles: MutableList<Article>):List<Long>

    @Query("SELECT*FROM articles")
    fun selectArticles():List<Article>

    @Query("DELETE FROM articles")
    fun deleteArticles()
}