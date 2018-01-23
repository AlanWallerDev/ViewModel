package com.example.t00053669.viewmodel;

import android.arch.lifecycle.ViewModelProviders;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    private ChronoModelView vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Chronometer chrono = (Chronometer) findViewById(R.id.chronometer1);

        vm = ViewModelProviders.of(this).get(ChronoModelView.class);
        if(vm.getmStartTimer() == null){
            long starttime = SystemClock.elapsedRealtime();
            vm.setmStartTimer(starttime);
            chrono.setBase(starttime);
        }else{
            chrono.setBase(vm.getmStartTimer());
        }
        chrono.start();
    }
}
