package com.test.newsheadlines.data.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.test.newsheadlines.network.model.Article

/**
 * Created by amresh on 25/05/2019
 */
@Database(entities = [Article::class] , version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase(){
    abstract fun articleDao() : ArticleDao
}