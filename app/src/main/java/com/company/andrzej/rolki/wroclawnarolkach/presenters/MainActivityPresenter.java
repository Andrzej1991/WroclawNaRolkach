package com.company.andrzej.rolki.wroclawnarolkach.presenters;

import android.app.Activity;

import com.company.andrzej.rolki.wroclawnarolkach.interfaces.MainActivityOptions;

/**
 * Created by Andrzej on 2017-04-24.
 */

public class MainActivityPresenter extends Activity implements MainActivityOptions {

    @Override
    public void exitApp(Activity activity) {
    activity.finish();
    }

    @Override
    public void openDialogForAddTrack() {

    }

    @Override
    public void openDialogForShowTrack() {

    }

    @Override
    public void openSettingsSection() {

    }
}
