package com.example.t00053669.viewmodel;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ChronoModelView vm;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Chronometer chrono = (Chronometer) findViewById(R.id.chronometer1);
        tv = (TextView) findViewById(R.id.textView);
        vm = ViewModelProviders.of(this).get(ChronoModelView.class);
        subscribe();

    }

    private void subscribe(){
        final Observer<Long> timeObserver = new Observer<Long>() {
            @Override
            public void onChanged(@Nullable Long aLong) {
                tv.setText(aLong + "");
            }
        };
        vm.getmStartTimer().observe(this, timeObserver);
    }
}
