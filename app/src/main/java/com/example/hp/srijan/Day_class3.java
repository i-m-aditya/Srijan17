package com.example.hp.srijan;


import android.content.Context;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;


/**
 * A simple {@link Fragment} subclass.
 */
public class Day_class3 extends Fragment {


    public Day_class3() {
        // Required empty public constructor
    }
    InformationClass information;
    ListView day_list;
    int day_ids[];
    String events_main_heading[];
    String events_sub_heading[];
    String tags[];
    boolean color[];

    SharedPreferences sharedPreferences;
    View fragmentView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView= inflater.inflate(R.layout.day_list_layout, container, false);
        return fragmentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(getContext());

        information=new InformationClass();
        day_ids=information.day_3;
        tags=information.events;

        events_main_heading=starting_an_array(1);
        events_sub_heading=starting_an_array(2);
        color=send_color();

        day_list=(ListView) fragmentView.findViewById(R.id.listView_of_day);
        DayListAdapter customAdapter=new DayListAdapter(getContext(),R.layout.single_layout_of_days_activity,R.id.events_main_headings,events_main_heading);
        day_list.setAdapter(customAdapter);

        day_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int  request_id = day_ids[position];//request to distinguish the different pending in notifiaction
                String  event_name = information.events[request_id];
                String  about =information.about_event[request_id];
                String rules = information.rule_event[request_id];
                String  contacts = information.contacts_event[request_id];
                String judgingCritria =information.judging_event[request_id];
                String prizes = information.prize_event[request_id];
                String location = information.location_event[request_id];
                int day = information.day_event[request_id];
                int  hour = information.hour_event[request_id];
                int minute = information.minute_event[request_id];

                DialogOFSingleEvent d = new DialogOFSingleEvent(getContext(), request_id,
                        event_name, about, rules, contacts,
                        judgingCritria, prizes, location,
                        day, hour, minute);
                d.show();
                d.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        color=send_color();
                        DayListAdapter customAdapter=new DayListAdapter(getContext(),R.layout.single_layout_of_days_activity,R.id.events_main_headings,events_main_heading);
                        day_list.setAdapter(customAdapter);
                    }
                });

            }
        });

    }


    public String[] starting_an_array(int which){
        String x[]=new String[day_ids.length];
        switch(which){
            case 1:
                String temp[]=information.events_names;

                for(int i=0;i<day_ids.length;i++)
                    x[i]=temp[day_ids[i]];

                break;
            case 2:

                String temp2[]=information.events_subheadings;
                for(int i=0;i<day_ids.length;i++)
                    x[i]=temp2[day_ids[i]];

                break;
        }
        return x;
    }

    public boolean[] send_color(){
        boolean check[]=new boolean[day_ids.length];

        for(int i=0;i<day_ids.length;i++)
            check[i]=sharedPreferences.getBoolean(tags[day_ids[i]],false);

        return check;
    }

    public class DayListAdapter extends ArrayAdapter<String> {
        Context context;
        public DayListAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
            super(context, resource, textViewResourceId, objects);
            this.context=context;}


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View row=View.inflate(context, R.layout.single_layout_of_days_activity, null);

            LinearLayout main_layout=(LinearLayout) row.findViewById(R.id.color_change);

            TextView main_heading=(TextView) row.findViewById(R.id.events_main_headings);
            TextView sub_heading=(TextView) row.findViewById(R.id.events_subheading);

            main_heading.setText(events_main_heading[position]);
            sub_heading.setText(events_sub_heading[position]);

            if(color[position]){
                main_layout.setBackgroundColor(Color.parseColor("#AADEC10A"));
                sub_heading.setTextColor(Color.parseColor("#000000"));}

            else{main_layout.setBackgroundColor(Color.parseColor("#bb282424"));
                sub_heading.setTextColor(Color.parseColor("#ebfff606"));}

            return row;
        }




    }
}
