package com.example.t00053669.viewmodel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by t00053669 on 1/22/2018.
 */

public class ChronoModelView extends ViewModel {

    private Long mStartTimer;

    public Long getmStartTimer() {
        return mStartTimer;
    }

    public void setmStartTimer(Long mStartTimer) {
        this.mStartTimer = mStartTimer;
    }
}
