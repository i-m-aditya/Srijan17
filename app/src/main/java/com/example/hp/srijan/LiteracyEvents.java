package com.example.hp.srijan;


import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class LiteracyEvents extends Fragment {

    private int request_id;
    private String event_name;
    private String about;
    private String rules;
    private String contacts;
    private String judgingCritria;
    private String prizes;
    private String location;
    private int day;
    private int hour;
    private int minute;

    int layout_ids[];
    String events[];

    InformationClass information;

    int here_id[]={2,12,14,15,16};
    SharedPreferences sharedPreferences;

    View framentView;
    public LiteracyEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        framentView=inflater.inflate(R.layout.fragment_literacy_events, container, false);
        return framentView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        information=new InformationClass();
        layout_ids=information.layout_ids;
        events=information.events;

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(getContext());
        start_color();
        layout_start();

    }



    private void start_color() {
        for(int i=0;i<here_id.length;i++)
            color_layout(events[here_id[i]],here_id[i]);
    }

    private void color_layout(String tag,int which_id){
        boolean ischecked=sharedPreferences.getBoolean(tag,false);
        LinearLayout layout=(LinearLayout) framentView.findViewById(layout_ids[which_id]);

        if(ischecked)
            layout.setBackgroundColor(Color.parseColor("#aa05a102"));
        else{
            layout.setBackgroundColor(Color.parseColor("#bb282424"));}

    }

    private void layout_start(){


        LinearLayout ism_mun=(LinearLayout) framentView.findViewById(R.id.ism_mun);
        ism_mun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id=2;//request to distinguish the different pending in notifiaction
                event_name = information.events[request_id];
                about =information.about_event[request_id];
                rules = information.rule_event[request_id];
                contacts = information.contacts_event[request_id];
                judgingCritria =information.judging_event[request_id];
                prizes = information.prize_event[request_id];
                location = information.location_event[request_id];
                day = information.day_event[request_id];
                hour = information.hour_event[request_id];
                minute = information.minute_event[request_id];

                DialogOFSingleEvent d=new DialogOFSingleEvent(getContext(),request_id,
                        event_name,about,rules,contacts,
                        judgingCritria,prizes,location,
                        day,hour,minute );
                d.show();
                d.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        color_layout(event_name, request_id);
                    }
                });
            }
        });

        LinearLayout kavyanjali=(LinearLayout) framentView.findViewById(R.id.kavyanjail);
        kavyanjali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 12;//request to distinguish the different pending in notifiaction
                event_name = information.events[request_id];
                about =information.about_event[request_id];
                rules = information.rule_event[request_id];
                contacts = information.contacts_event[request_id];
                judgingCritria =information.judging_event[request_id];
                prizes = information.prize_event[request_id];
                location = information.location_event[request_id];
                day = information.day_event[request_id];
                hour = information.hour_event[request_id];
                minute = information.minute_event[request_id];

                DialogOFSingleEvent d = new DialogOFSingleEvent(getContext(), request_id,
                        event_name, about, rules, contacts,
                        judgingCritria, prizes, location,
                        day, hour, minute);
                d.show();
                d.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        color_layout(event_name, request_id);
                    }
                });
            }
        });

        LinearLayout coffe_cup=(LinearLayout) framentView.findViewById(R.id.coffee_cup);
        coffe_cup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 14;//request to distinguish the different pending in notifiaction
                event_name = information.events[request_id];
                about =information.about_event[request_id];
                rules = information.rule_event[request_id];
                contacts = information.contacts_event[request_id];
                judgingCritria =information.judging_event[request_id];
                prizes = information.prize_event[request_id];
                location = information.location_event[request_id];
                day = information.day_event[request_id];
                hour = information.hour_event[request_id];
                minute = information.minute_event[request_id];

                DialogOFSingleEvent d = new DialogOFSingleEvent(getContext(), request_id,
                        event_name, about, rules, contacts,
                        judgingCritria, prizes, location,
                        day, hour, minute);
                d.show();
                d.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        color_layout(event_name, request_id);
                    }
                });
            }
        });



        LinearLayout debate=(LinearLayout) framentView.findViewById(R.id.one_on_one_debate);
        debate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 15;//request to distinguish the different pending in notifiaction
                event_name = information.events[request_id];
                about =information.about_event[request_id];
                rules = information.rule_event[request_id];
                contacts = information.contacts_event[request_id];
                judgingCritria =information.judging_event[request_id];
                prizes = information.prize_event[request_id];
                location = information.location_event[request_id];
                day = information.day_event[request_id];
                hour = information.hour_event[request_id];
                minute = information.minute_event[request_id];

                DialogOFSingleEvent d = new DialogOFSingleEvent(getContext(), request_id,
                        event_name, about, rules, contacts,
                        judgingCritria, prizes, location,
                        day, hour, minute);
                d.show();
                d.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        color_layout(event_name, request_id);
                    }
                });
            }
        });


        LinearLayout stand_up_comedy=(LinearLayout) framentView.findViewById(R.id.stand_up_comedy);
        stand_up_comedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 16;//request to distinguish the different pending in notifiaction
                event_name = information.events[request_id];
                about =information.about_event[request_id];
                rules = information.rule_event[request_id];
                contacts = information.contacts_event[request_id];
                judgingCritria =information.judging_event[request_id];
                prizes = information.prize_event[request_id];
                location = information.location_event[request_id];
                day = information.day_event[request_id];
                hour = information.hour_event[request_id];
                minute = information.minute_event[request_id];

                DialogOFSingleEvent d = new DialogOFSingleEvent(getContext(), request_id,
                        event_name, about, rules, contacts,
                        judgingCritria, prizes, location,
                        day, hour, minute);
                d.show();
                d.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        color_layout(event_name, request_id);
                    }
                });
            }
        });



    }
}
