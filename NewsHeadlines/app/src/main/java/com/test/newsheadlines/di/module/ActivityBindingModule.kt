package com.test.newsheadlines.di.module

import com.test.newsheadlines.ui.MainActivity
import com.test.newsheadlines.ui.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity
}