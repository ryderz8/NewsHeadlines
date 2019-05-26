package com.test.newsheadlines

import android.annotation.SuppressLint
import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.support.annotation.VisibleForTesting
import com.test.newsheadlines.data.DataManager
import com.test.newsheadlines.ui.NewsViewModel

class ViewModelFactory private constructor(private val application: Application,
                                           private val dataManager: DataManager
):ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>) =
            with(modelClass){
                when{
                    isAssignableFrom(NewsViewModel::class.java)->
                        NewsViewModel(application, dataManager)
                    else -> throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
                }
    }as T

    companion object {

        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: ViewModelFactory? = null

        fun getInstance(application: Application, dataManager: DataManager) =
                INSTANCE ?: synchronized(ViewModelFactory::class.java) {
                    INSTANCE
                            ?: ViewModelFactory(application, dataManager).also { INSTANCE = it }
                }


        @VisibleForTesting
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}