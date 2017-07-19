package com.hilfritz.android_clean_architecture;

import android.app.Application;
import android.content.Context;

import com.hilfritz.android_clean_architecture.presentation.MyApplication;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.io.File;

/**
 * Created by Hilfritz Camallere on 19/7/17.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class,
        application = MyApplication.class,
        sdk=22)
abstract public class AndroidTest {
    public class ApplicationStub extends Application {}
    public Context getContext(){
        return RuntimeEnvironment.application;
    }
    public File getCache(){
        return getContext().getCacheDir();
    }
}
