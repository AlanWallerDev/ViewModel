package com.example.t00053669.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.SystemClock;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by t00053669 on 1/22/2018.
 */

public class ChronoModelView extends ViewModel {
    private MutableLiveData<Long> mStartTimer;

    public ChronoModelView() {
        mStartTimer = new MutableLiveData<>();
        final long currentTime = SystemClock.elapsedRealtime();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(
                new TimerTask() {
                    @Override
                    public void run() {
                        final long newTime = (SystemClock.elapsedRealtime() - currentTime / 1000);
                        mStartTimer.postValue(newTime);
                    }
                }
        , 1000, 1000);
    }



    public LiveData<Long> getmStartTimer() {
        return mStartTimer;
    }
}
