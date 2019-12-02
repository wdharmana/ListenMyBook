package com.listenmybook.app

import com.listenmybook.app.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApp : DaggerApplication() {

    private val appComponent = DaggerAppComponent.builder()
        .application(this)
        .build()

    init {
        instance = this
    }
    companion object {
        private var instance: MainApp? = null
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)

    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return appComponent
    }
}