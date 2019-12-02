package com.listenmybook.app.di.module

import com.listenmybook.app.MainActivity
import com.listenmybook.app.ScanResultActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    internal abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    internal abstract fun contributeScanResultActivity(): ScanResultActivity

}