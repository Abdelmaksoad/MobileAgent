package com.rentcentric.mobileagent.permissions;

import android.app.Activity;

import com.rentcentric.mobileagent.util.RuntimePermissionUtil;


/**
 * Created by Chirag on 3/28/2016.
 */
public class MarshMallowPermissions {

Activity activity;
    public MarshMallowPermissions(Activity activity){
        this.activity = activity;
    }

    public void checkPermission(){
        RuntimePermissionUtil.INTERNET_PERMISSION(activity);
        RuntimePermissionUtil.ACCESS_NETWORK_STATE(activity);
        RuntimePermissionUtil.CAMERA(activity);

        RuntimePermissionUtil.READ_EXTERNAL_STORAGE(activity);
        RuntimePermissionUtil.WRITE_EXTERNAL_STORAGE(activity);
        RuntimePermissionUtil.ACCESS_WIFI_STATE(activity);
        RuntimePermissionUtil.ACCESS_FINE_LOCATION(activity);
        RuntimePermissionUtil.ACCESS_COARSE_LOCATION(activity);


    }
}
