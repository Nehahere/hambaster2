package com.neha.hambaster;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class nehasIntentService extends IntentService {
    private static final String TAG="com.neha.hambaster";

    public nehasIntentService() {
        super("nehasIntentService");
    }

    @Override
    protected void onHandleIntent( Intent intent) {
        Log.i(TAG,"The service has now started");

    }
}
