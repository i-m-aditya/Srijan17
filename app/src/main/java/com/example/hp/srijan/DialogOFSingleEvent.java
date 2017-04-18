package com.example.hp.srijan;

import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Created by mayank on 27-02-2017.
 */
public class DialogOFSingleEvent extends Dialog {

    Context context;

    private String Event;
    private String about_details;
    private String rule_details;
    private String judge_details;
    private String prize_details;
    private String contact_details;
    private int day;
    private int hour;
    private int minute;
    private int request_code;
    private String location;

    //private static String Database="Storage of boolean";//name of our database
    boolean checked;


    SharedPreferences sharedPreferences;
    AlarmManager alarmManager ;
    Intent alarmBroadcast ;
    PendingIntent pendingIntent;


    public DialogOFSingleEvent(Context context, int temp_requestCode, String heading, String temp_about, String temp_rule, String temp_contact,
                               String temp_judge, String temp_prize, String temp_location,
                               int temp_date, int temp_hour, int temp_minute) {
        super(context);
        this.context=context;
        Event=heading;
        about_details=temp_about;
        rule_details=temp_rule;
        judge_details=temp_judge;
        prize_details=temp_prize;
        contact_details=temp_contact;

        day=temp_date;
        hour=temp_hour;
        minute=temp_minute;
        request_code=temp_requestCode;

        location=temp_location;
        checked=false;
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(context);

        alarmBroadcast = new Intent(context, OnAlarmReceiver.class);
        alarmBroadcast.putExtra("Event_Name", Event);
        alarmBroadcast.putExtra("Day",Integer.toString(day));
        alarmBroadcast.putExtra("Hour",hour);
        alarmBroadcast.putExtra("Minute",minute);
        alarmBroadcast.putExtra("Location",location);
        alarmBroadcast.putExtra("Request_id",request_code);



        pendingIntent=PendingIntent.getBroadcast(context, request_code, alarmBroadcast, 0);

    }
    //               about   rules     contact  judge   prize
    boolean what[] ={true,    true,    true,    true,   true};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_two);


        Switch notificationSwitch = (Switch) findViewById(R.id.notification_switch);
        checked=sharedPreferences.getBoolean(Event,false);
        notificationSwitch.setChecked(checked);




      alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);


        //-----------Linear layout---------------------------------------------
        final LinearLayout parentLayout=(LinearLayout) findViewById(R.id.dialog_parent);
        final LinearLayout about=(LinearLayout) findViewById(R.id.about_layout);
        final LinearLayout rule=(LinearLayout) findViewById(R.id.rule_layout);
        final LinearLayout judge=(LinearLayout) findViewById(R.id.judge_layout);
        final LinearLayout prize=(LinearLayout) findViewById(R.id.prize_layout);
        final LinearLayout contact=(LinearLayout) findViewById(R.id.contact_layout);
        //--------------------------------------------------------------------------

        final RelativeLayout Rabout=(RelativeLayout) findViewById(R.id.re_about_layout);
        final RelativeLayout Rrule=(RelativeLayout) findViewById(R.id.re_rule_layout);
        final RelativeLayout Rjudge=(RelativeLayout) findViewById(R.id.re_judge_layout);
        final RelativeLayout Rprize=(RelativeLayout) findViewById(R.id.re_prize_layout);
        final RelativeLayout Rcontact=(RelativeLayout) findViewById(R.id.re_contact_layout);
        final RelativeLayout locationLayout=(RelativeLayout) findViewById(R.id.location);
        final RelativeLayout notification=(RelativeLayout) findViewById(R.id.set_notification);


        final TextView aboutText=(TextView) findViewById(R.id.about_text);
        final TextView ruleText=(TextView) findViewById(R.id.rule_text_box);
        final TextView judgeText=(TextView) findViewById(R.id.judge_text_box);
        final TextView prizeText=(TextView) findViewById(R.id.prize_text_box);
        final TextView contactText=(TextView) findViewById(R.id.contact_text_box);
        final   TextView Heading=(TextView) findViewById(R.id.dialog_heading);

        //----------------setting the variable--------------------------------
        Heading.setText(Event);
        aboutText.setText(about_details);
        ruleText.setText(rule_details);
        judgeText.setText(judge_details);
        prizeText.setText(prize_details);
        contactText.setText(contact_details);

        //--------------------------------------------------------------------


        //------ initialy the text box will be hiden-------------
        about.removeViewAt(1);
        rule.removeViewAt(1);
        judge.removeViewAt(1);
        prize.removeViewAt(1);
        contact.removeViewAt(1);
        //--------------------------------------------------------


      final  ImageView arrow=(ImageView) findViewById(R.id.about_arrow);
       final ImageView arrowRule=(ImageView) findViewById(R.id.rule_arrow);
        final ImageView arrowjudge=(ImageView) findViewById(R.id.judge_arrow);
        final ImageView arrowprize=(ImageView) findViewById(R.id.prize_arrow);
       final ImageView contactArrow=(ImageView) findViewById(R.id.contact_arrow);
       final  ImageView calendra=(ImageView) findViewById(R.id.calendra_icon);


        //------------to control the drop down list----------------------------------
        Rcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(what[0]==false){
                    about.removeViewAt(1);what[0]=true;arrow.setImageResource(R.drawable.right_arrow);
                }

                if(what[1]==false){
                    rule.removeViewAt(1);what[1]=true;arrowRule.setImageResource(R.drawable.right_arrow);
                }

                if(what[2]){
                    contact.addView(contactText,1);what[2]=false;contactArrow.setImageResource(R.drawable.up_arrow);}

                else{
                    contact.removeViewAt(1);what[2]=true;contactArrow.setImageResource(R.drawable.right_arrow);}

                if(what[3]==false){
                    judge.removeViewAt(1);what[3]=true;arrowjudge.setImageResource(R.drawable.right_arrow);
                }

                if(what[4]==false){
                    prize.removeViewAt(1);what[4]=true;arrowprize.setImageResource(R.drawable.right_arrow);
                }
            }
        });

        Rrule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(what[0]==false){
                    about.removeViewAt(1);what[0]=true; arrow.setImageResource(R.drawable.right_arrow);
                }

                if(what[1]){
                    rule.addView(ruleText,1);what[1]=false; arrowRule.setImageResource(R.drawable.up_arrow);}
                else{
                    rule.removeViewAt(1);what[1]=true; arrowRule.setImageResource(R.drawable.right_arrow);
                }

                if(what[2]==false){
                    contact.removeViewAt(1);what[2]=true; contactArrow.setImageResource(R.drawable.right_arrow);
                }

                if(what[3]==false){
                    judge.removeViewAt(1);what[3]=true;arrowjudge.setImageResource(R.drawable.right_arrow);
                }

                if(what[4]==false){
                    prize.removeViewAt(1);what[4]=true;arrowprize.setImageResource(R.drawable.right_arrow);
                }
            }
        });

        Rabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (what[0]) {
                    about.addView(aboutText, 1);
                    what[0] = false;
                    arrow.setImageResource(R.drawable.up_arrow);
                } else {
                    about.removeViewAt(1);
                    what[0] = true;
                    arrow.setImageResource(R.drawable.right_arrow);
                }

                if (what[1] == false) {
                    rule.removeViewAt(1);
                    what[1] = true;
                    arrowRule.setImageResource(R.drawable.right_arrow);
                }

                if (what[2] == false) {
                    contact.removeViewAt(1);
                    what[2] = true;
                    contactArrow.setImageResource(R.drawable.right_arrow);
                }

                if(what[3]==false){
                    judge.removeViewAt(1);what[3]=true;arrowjudge.setImageResource(R.drawable.right_arrow);
                }

                if(what[4]==false){
                    prize.removeViewAt(1);what[4]=true;arrowprize.setImageResource(R.drawable.right_arrow);
                }
            }
        });

        Rprize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(what[0]==false){
                    about.removeViewAt(1);what[0]=true; arrow.setImageResource(R.drawable.right_arrow);
                }

                if(what[1]==false){
                    rule.removeViewAt(1);what[1]=true;arrowRule.setImageResource(R.drawable.right_arrow);
                }

                if(what[2]==false){
                    contact.removeViewAt(1);what[2]=true; contactArrow.setImageResource(R.drawable.right_arrow);
                }

                if(what[3]==false){
                    judge.removeViewAt(1);what[3]=true;arrowjudge.setImageResource(R.drawable.right_arrow);
                }


                if(!what[4]){
                    prize.removeViewAt(1);what[4]=true;arrowprize.setImageResource(R.drawable.right_arrow);
                }

                else{  prize.addView(prizeText, 1);what[4]=false; arrowprize.setImageResource(R.drawable.up_arrow);}

            }
        });

        Rjudge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(what[0]==false){
                    about.removeViewAt(1);what[0]=true; arrow.setImageResource(R.drawable.right_arrow);
                }

                if(what[1]==false){
                    rule.removeViewAt(1);what[1]=true;arrowRule.setImageResource(R.drawable.right_arrow);
                }

                if(what[2]==false){
                    contact.removeViewAt(1);what[2]=true; contactArrow.setImageResource(R.drawable.right_arrow);
                }

                if(what[3]){
                    judge.addView(judgeText,1);what[3]=false; arrowjudge.setImageResource(R.drawable.up_arrow);}
                else{
                    judge.removeViewAt(1);what[3]=true; arrowjudge.setImageResource(R.drawable.right_arrow);
                }

                if(what[4]==false){
                    prize.removeViewAt(1);what[4]=true;arrowprize.setImageResource(R.drawable.right_arrow);
                }
            }
        });

        //------------------------------------------------------------------------------------------------

        int temp_hour=hour+1;
        String sm="AM";

        if(temp_hour>12) {
            temp_hour = temp_hour % 12;
            sm="PM";
        }
        final String temp_hour2=Integer.toString(temp_hour);
        final String temp_sm=sm;
        //-----------------------to show timing-------------------
         calendra.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Snackbar.make(parentLayout, day + "/" + "03/2017" + "\n" + temp_hour2 + ":00 "+temp_sm , Snackbar.LENGTH_SHORT)
                        /* .setAction("CLOSE", new View.OnClickListener() {
                             @Override
                             public void onClick(View view) {

                             }
                         })*/.show();
             }
         });
        //----------------------------------------------------------


       //-----------------to show location to user---------------------
        locationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(parentLayout, location, Snackbar.LENGTH_LONG)
                        .setAction("Open in Map", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                //---to open the google maps------
                                Maps maps = new Maps();
                                Bundle bundle = new Bundle();
                                bundle.putString("key", location);
                                maps.setArguments(bundle);

                                if(MainActivity.total==0)
                                    MainActivity.fragmentTransaction_1.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==1)
                                    MainActivity.fragmentTransaction_2.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==2)
                                    MainActivity.fragmentTransaction_3.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==3)
                                    MainActivity.fragmentTransaction_4.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==4)
                                    MainActivity.fragmentTransaction_5.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==5)
                                    MainActivity.fragmentTransaction_6.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==6)
                                    MainActivity.fragmentTransaction_7.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==7)
                                    MainActivity.fragmentTransaction_8.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==8)
                                    MainActivity.fragmentTransaction_9.add(R.id.frame_container,maps).addToBackStack("fragback").commit();
                                else if(MainActivity.total==9)
                                    MainActivity.fragmentTransaction_10.add(R.id.frame_container,maps).addToBackStack("fragback").commit();

                                MainActivity.total++;

                                dismiss();




                            }
                        }).setActionTextColor(Color.YELLOW).show();
            }
        });
        //-------------------------------------------------------------------

        //-----------------to show location to user---------------------
        notificationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                sharedPreferences.edit().putBoolean(Event, isChecked).commit();//saving the information of notification


                if(isChecked){
             //set the current time and date for this calendar
                Calendar cal = new GregorianCalendar();
                    cal.set(Calendar.DAY_OF_MONTH, day);
                cal.set(Calendar.HOUR_OF_DAY, hour);
                cal.set(Calendar.MINUTE, minute);


                    System.out.println(Calendar.HOUR_OF_DAY + " " + hour + " " + minute + " " + day);
                System.out.println(cal.getTimeInMillis()+" ");
                alarmManager.setExact(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingIntent);
                Toast.makeText(context,"Notification is set",Toast.LENGTH_SHORT).show();
                }

                else{
                    alarmManager.cancel(pendingIntent);
                    pendingIntent.cancel();
                    Toast.makeText(context,"Notification is disable",Toast.LENGTH_SHORT).show();
                    System.out.println("alarm is off");
                }

            }



        });
        //-------------------------------------------------------------------
    }
}
