package com.company.andrzej.rolki.wroclawnarolkach.listeners;

/**
 * Created by Andrzej on 2017-04-24.
 */

public abstract class AdListener {
    public abstract void onAdLoaded();
    public abstract void onAdFailedToLoad(int errorCode);
    public abstract void onAdOpened();
    public abstract void onAdClosed();
    public abstract void onAdLeftApplication();
}
