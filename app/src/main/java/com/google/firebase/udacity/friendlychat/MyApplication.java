package com.google.firebase.udacity.friendlychat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by JD on 12/27/2016.
 */
public class MyApplication extends Application {


    @Override
    public void onCreate()
    {
        super.onCreate();

        Firebase.setAndroidContext(getApplicationContext());
    }

}
