package com.zikozee.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityOne extends AppCompatActivity {

    String TAG = "ActivityOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.i(TAG, "---onCreate--");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "---onStart--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "---onRestart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "---onResume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "---onPause--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "---onDestroy--");
    }
}