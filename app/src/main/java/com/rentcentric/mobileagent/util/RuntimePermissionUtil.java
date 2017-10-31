package com.rentcentric.mobileagent.util;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * Created by Chirag on 3/28/2016.
 */
public class RuntimePermissionUtil {


    @TargetApi(Build.VERSION_CODES.M)
    public static void INTERNET_PERMISSION(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.INTERNET);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.INTERNET},
                        1);

            }
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    public static void ACCESS_NETWORK_STATE(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.ACCESS_NETWORK_STATE);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.ACCESS_NETWORK_STATE},
                        2);
            }
        }

    }

    @TargetApi(Build.VERSION_CODES.M)
    public static void CAMERA(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.CAMERA);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.CAMERA},
                        3);
            }
        }
    }




    @TargetApi(Build.VERSION_CODES.M)
    public static void READ_EXTERNAL_STORAGE(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.READ_EXTERNAL_STORAGE);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        4);
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.M)
    public static void WRITE_EXTERNAL_STORAGE(Activity activity){
        int permission = ContextCompat.checkSelfPermission(activity,Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if(permission!=PackageManager.PERMISSION_GRANTED){
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        5);
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    public static void ACCESS_WIFI_STATE(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.ACCESS_WIFI_STATE);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.ACCESS_WIFI_STATE},
                        6);
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.M)
    public static void GET_ACCOUNTS(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.GET_ACCOUNTS);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.GET_ACCOUNTS},
                        7);
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.M)
    public static void WAKE_LOCK(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.WAKE_LOCK);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.WAKE_LOCK},
                        8);
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.M)
    public static void VIBRATE(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.VIBRATE);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.VIBRATE},
                        9);
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.M)
    public static void SEND_SMS(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.SEND_SMS);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.SEND_SMS},
                        10);
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.M)
    public static void READ_CONTACTS(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.READ_CONTACTS);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.READ_CONTACTS},
                        11);
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.M)
    public static void ACCESS_FINE_LOCATION(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.ACCESS_FINE_LOCATION);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        12);
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.M)
    public static void ACCESS_COARSE_LOCATION(Activity activity) {
        int permission = ContextCompat.checkSelfPermission(activity,
                Manifest.permission.ACCESS_COARSE_LOCATION);
        if(permission!= PackageManager.PERMISSION_GRANTED)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                        13);
            }
        }
    }



}
