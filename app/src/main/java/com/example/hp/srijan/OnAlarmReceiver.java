package com.example.hp.srijan;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by mayank on 27-02-2017.
 */
public class OnAlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle details=intent.getExtras();

        int hour=details.getInt("Hour")+1;
        String sm="AM";

        if(hour>12) {
            hour = hour % 12;
            sm="PM";
        }



        System.out.println("notification is set");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
                .setContentTitle(details.getString("Event_Name"))
                .setContentText("Day: "+details.getString("Day")+" March"+","+"  Time: "+hour+":"+"00 "+sm+",  Location: "+details.getString("Location"))
                .setSmallIcon(R.mipmap.ic_launcher)
                .setOngoing(false)
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_SOUND);


        NotificationManager notificationManager=(NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(details.getInt("Request_id"),builder.build());


    }
}
