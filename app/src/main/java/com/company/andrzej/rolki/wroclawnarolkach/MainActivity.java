package com.company.andrzej.rolki.wroclawnarolkach;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.company.andrzej.rolki.wroclawnarolkach.presenters.MainActivityPresenter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    private MainActivityPresenter presenter;

    @BindView(R.id.wyjdz)
    View exitApplication;
    @BindView(R.id.dodaj_trase)
    View addNewTrack;
    @BindView(R.id.pokaz_mapy)
    View showTracks;
    @BindView(R.id.opcje)
    View settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initializeAdMob();

        if (presenter == null) {
            presenter = new MainActivityPresenter();
        }
    }

    private void initializeAdMob() {
        MobileAds.initialize(this, "ca-app-pub-2389435775598003/7351545379");
        mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @OnClick(R.id.wyjdz)
    public void exitApplication() {
        presenter.exitApp(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}
