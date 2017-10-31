package com.rentcentric.mobileagent.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import com.rentcentric.mobileagent.R;


/**
 * Created by Chirag on 2/11/2016.
 */
public class InfoDialogs {


   public static void showInfoDialog(final Activity activity,String msg,String title) {
        AlertDialog.Builder alert = new AlertDialog.Builder(activity);
        alert.setTitle(title);
        alert.setMessage(msg);
        alert.setCancelable(false);
        alert.setPositiveButton(activity.getResources().getString(R.string.ok_lbl), null);
        alert.show();
    }

    public static void showInfoDialog(final Activity activity,String msg,String title,final Class className) {
        AlertDialog.Builder alert = new AlertDialog.Builder(activity);
        alert.setTitle(title);
        alert.setMessage(msg);
        alert.setCancelable(false);
        alert.setPositiveButton(activity.getResources().getString(R.string.ok_lbl), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.startActivity(new Intent(activity,className));
                activity.finish();
            }
        });
        alert.show();
    }
    public static void showInfoDialog(final Activity activity,String msg,String title,boolean finish) {
        AlertDialog.Builder alert = new AlertDialog.Builder(activity);
        alert.setTitle(title);
        alert.setMessage(msg);
        alert.setCancelable(false);
        alert.setPositiveButton(activity.getResources().getString(R.string.ok_lbl), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finish();
            }
        });
        alert.show();
    }

}
