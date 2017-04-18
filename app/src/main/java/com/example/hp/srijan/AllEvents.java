package com.example.hp.srijan;


import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllEvents extends Fragment {

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
    private boolean angle=true;//floating action keep track of opening and closing of floating button


    int layout_ids[];
    String events[];
    View fragmentView;
    InformationClass information;
    SharedPreferences sharedPreferences;

    public AllEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_all_events, container, false);

        return fragmentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        information=new InformationClass();
        layout_ids=information.layout_ids;
        events=information.events;

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(getContext());

        starting_color_layout();//for changing  the color of different layout according to notification set by user
        id_runs();//initization of onclick to differnet layout




    }




    private void starting_color_layout(){
        for(int i=0;i<=18;i++){
            color_layout(events[i],i);}
    }

    private void color_layout(String tag,int which_id){
        boolean ischecked=sharedPreferences.getBoolean(tag,false);
        LinearLayout layout=(LinearLayout) fragmentView.findViewById(layout_ids[which_id]);

        if(ischecked)
            layout.setBackgroundColor(Color.parseColor("#AA0234A1"));
        else{
            if(which_id%2==0)
                layout.setBackgroundColor(Color.parseColor("#bb282424"));
            else
                layout.setBackgroundColor(Color.parseColor("#bb282424"));
        }

    }

    @Override
    public void onResume() {
        super.onResume();
        starting_color_layout();
    }

    private void id_runs() {
        LinearLayout avalanche=(LinearLayout) fragmentView.findViewById(R.id.avalanche);
        avalanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 0;//request to distinguish the different pending in notifiaction
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
                        color_layout(event_name,request_id);
                    }
                });
            }
        });

        LinearLayout paridhaan=(LinearLayout) fragmentView.findViewById(R.id.paridhaan);
        paridhaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id=1;//request to distinguish the different pending in notifiaction
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


        LinearLayout ism_mun=(LinearLayout) fragmentView.findViewById(R.id.ism_mun);
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

        LinearLayout rangmanch=(LinearLayout) fragmentView.findViewById(R.id.rangmanch);
        rangmanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 3;//request to distinguish the different pending in notifiaction
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

        //starnit id 5

        LinearLayout hustleherd=(LinearLayout) fragmentView.findViewById(R.id.hustleherd);
        hustleherd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 4;//request to distinguish the different pending in notifiaction
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

        //encore id 7

        LinearLayout unplugged=(LinearLayout) fragmentView.findViewById(R.id.unplugged);
        unplugged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 5;//request to distinguish the different pending in notifiaction
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

        LinearLayout footloose=(LinearLayout) fragmentView.findViewById(R.id.footloose);
        footloose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 6;//request to distinguish the different pending in notifiaction
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

        //dj id 10

        LinearLayout aaroh=(LinearLayout) fragmentView.findViewById(R.id.aaroh);
        aaroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 7;//request to distinguish the different pending in notifiaction
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

        LinearLayout hallabol=(LinearLayout) fragmentView.findViewById(R.id.hallabol);
        hallabol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 8;//request to distinguish the different pending in notifiaction
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

        LinearLayout mr_and_ms_srijan=(LinearLayout) fragmentView.findViewById(R.id.mr_and_ms_srijan);
        mr_and_ms_srijan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 9;//request to distinguish the different pending in notifiaction
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

        LinearLayout khamoshi=(LinearLayout) fragmentView.findViewById(R.id.khamoshi);
        khamoshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 10;//request to distinguish the different pending in notifiaction
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

        LinearLayout streetbeats=(LinearLayout) fragmentView.findViewById(R.id.streetbeats);
        streetbeats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 11;//request to distinguish the different pending in notifiaction
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

        LinearLayout kavyanjali=(LinearLayout) fragmentView.findViewById(R.id.kavyanjail);
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
        LinearLayout reflection=(LinearLayout) fragmentView.findViewById(R.id.reflection);
        reflection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 13;//request to distinguish the different pending in notifiaction
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

        LinearLayout coffe_cup=(LinearLayout) fragmentView.findViewById(R.id.coffee_cup);
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

        LinearLayout debate=(LinearLayout) fragmentView.findViewById(R.id.one_on_one_debate);
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

        LinearLayout stand_up_comedy=(LinearLayout) fragmentView.findViewById(R.id.stand_up_comedy);
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

        LinearLayout rang=(LinearLayout) fragmentView.findViewById(R.id.rang);
        rang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 17;//request to distinguish the different pending in notifiaction
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

        LinearLayout hundred_seconds=(LinearLayout) fragmentView.findViewById(R.id.hundred_seconds);
        hundred_seconds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request_id = 18;//request to distinguish the different pending in notifiaction
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
