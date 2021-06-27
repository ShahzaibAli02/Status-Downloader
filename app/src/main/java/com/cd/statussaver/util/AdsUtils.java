package com.cd.statussaver.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

import com.cd.statussaver.MyApplication;
import com.cd.statussaver.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

public class AdsUtils {



    private static  InterstitialAd mInterstitialAd;

    public static void showGoogleBannerAd(Context context, com.google.android.gms.ads.AdView googleAdView) {

        googleAdView.setVisibility(View.VISIBLE);
        //Load Banner Ad
        MobileAds.initialize(context, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        googleAdView.loadAd(adRequest);
    }



    public  static void prepareInterStatial()
    {
        mInterstitialAd=new InterstitialAd(MyApplication.context);
        mInterstitialAd.setAdUnitId(MyApplication.context.getString(R.string.admob_interstitial_ad));
    }
    public  static  void loadInterStatial()
    {

        mInterstitialAd.loadAd( new AdRequest.Builder().build());
    }

    public  static  InterstitialAd getInterStatial()
    {

        if(mInterstitialAd!=null && mInterstitialAd.isLoaded())
        {
            return  mInterstitialAd;
        }
        return null;

    }


    public  static void  showAd(Activity activity, Intent intent)
    {

        if(getInterStatial()!=null )
        {
            getInterStatial().setAdListener(new AdListener()
            {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();

                    activity.startActivity(intent);


                }
            });
            getInterStatial().show();

        }
        else
        {
            new StartAppAd(activity).showAd(new AdDisplayListener() {
            @Override
            public void adHidden(Ad ad) {
                activity.startActivity(intent);
            }
            @Override
            public void adDisplayed(Ad ad) {
            }
            @Override
            public void adClicked(Ad ad) {
            }
            @Override
            public void adNotDisplayed(Ad ad) {
                activity.startActivity(intent);
            }
        });



        }


        loadInterStatial();

    }





    public static AdView showFBBannerAd(Context context, LinearLayout adContainer) {
        adContainer.setVisibility(View.VISIBLE);
        AdView adView = new AdView(context);

        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId(context.getResources().getString(R.string.admob_banner_ad));
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        adContainer.addView(adView);

        return adView;

    }




}
