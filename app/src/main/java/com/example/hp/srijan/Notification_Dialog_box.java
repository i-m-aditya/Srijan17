package com.example.hp.srijan;

import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mayank on 04-03-2017.
 */
public class Notification_Dialog_box extends Dialog {

    SharedPreferences sharedPreferences;
    int id;
    Context context;
    public Notification_Dialog_box(Context context,int id) {
        super(context);
        this.id=id;
        this.context=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_dialog);
        TextView textView=(TextView) findViewById(R.id.dialog_info);
        InformationClass informationClass=new InformationClass();
        textView.setText("Do you want to disable the Notification for the Event: "+informationClass.events_names[id]);

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(context);

        Button cancel=(Button) findViewById(R.id.dialog_cancel);
        Button agree=(Button) findViewById(R.id.dialog_ok);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InformationClass information = new InformationClass();

                sharedPreferences.edit().putBoolean(information.events[id], false).commit();


                Intent alarmBroadcast = new Intent(context, OnAlarmReceiver.class);
                alarmBroadcast.putExtra("Event_Name", information.events[id]);
                alarmBroadcast.putExtra("Day", information.day_event[id]);
                alarmBroadcast.putExtra("Time", Integer.toString(information.hour_event[id]) + ":" + Integer.toString(information.minute_event[id]));
                alarmBroadcast.putExtra("Location", information.location_event[id]);
                alarmBroadcast.putExtra("Request_id", id);


                PendingIntent pendingIntent = PendingIntent.getBroadcast(context, id, alarmBroadcast, 0);
                AlarmManager alarmManager;
                alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

                alarmManager.cancel(pendingIntent);
                pendingIntent.cancel();
                System.out.print("successfull " + id + " " + information.events[id] + "\n");
                Toast.makeText(context, "Notification is successfully disable", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

    }
}
