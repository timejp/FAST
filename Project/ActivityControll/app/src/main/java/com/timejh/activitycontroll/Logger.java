package com.timejh.activitycontroll;

import android.util.Log;

/**
 * Created by tokijh on 2017. 1. 26..
 */

public class Logger {
    public final static boolean DEBUG_MODE = true; //BuildConfig.DEBUG;

    public static void print(String string, String className) {
        if (DEBUG_MODE)
            Log.d(string, className);
    }
}
