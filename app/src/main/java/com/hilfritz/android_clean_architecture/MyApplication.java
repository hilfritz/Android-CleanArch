package com.hilfritz.android_clean_architecture;

import android.app.Application;

import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // initiate Timber
        Timber.plant(new DebugTree());
    }
}
