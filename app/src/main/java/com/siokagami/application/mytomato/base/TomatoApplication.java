package com.siokagami.application.mytomato.base;

import android.app.Application;

/**
 * Created by siokagami on 16/10/27.
 */

public class TomatoApplication extends Application {
    public static TomatoApplication instance;
    public static boolean IS_LOGIN = false;
    public static String USER_UID;

//    public TomatoApplication() {
//        if (instance == null) {
//            instance = new TomatoApplication();
//        }
//
//    }
}
