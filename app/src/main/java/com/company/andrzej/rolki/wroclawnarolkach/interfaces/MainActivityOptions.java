package com.company.andrzej.rolki.wroclawnarolkach.interfaces;

import android.app.Activity;

/**
 * Created by Andrzej on 2017-04-24.
 */

public interface MainActivityOptions {
    void exitApp(Activity activity);
    void openDialogForAddTrack();
    void openDialogForShowTrack();
    void openSettingsSection();

}
