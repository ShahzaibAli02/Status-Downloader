package com.cd.statussaver;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;

import com.cd.statussaver.util.AdsUtils;
import com.cd.statussaver.util.AppLangSessionManager;


import com.google.firebase.messaging.FirebaseMessaging;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

import java.util.Locale;

public class MyApplication extends Application {
    AppLangSessionManager appLangSessionManager;

    public  static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseMessaging.getInstance().subscribeToTopic("all");


      //  StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);
        appLangSessionManager = new AppLangSessionManager(getApplicationContext());
        setLocale(appLangSessionManager.getLanguage());
        context=this;
        StartAppAd.disableAutoInterstitial();
        AdsUtils.prepareInterStatial();
        AdsUtils.loadInterStatial();
    }

    public void setLocale(String lang) {
        if (lang.equals("")){
            lang="en";
        }
        Log.d("Support",lang+"");
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);


    }




}
