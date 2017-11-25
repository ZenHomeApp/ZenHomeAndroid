package com.eduvilar.zenhome.data;

import android.app.Application;
import android.content.Context;

/**
 * Created by eduardovilar10 on 22/11/2017.
 */

public class GetData extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }

}
