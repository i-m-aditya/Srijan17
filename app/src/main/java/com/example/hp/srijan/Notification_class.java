package com.example.hp.srijan;


import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;


/**
 * A simple {@link Fragment} subclass.
 */
public class Notification_class extends Fragment {

    SharedPreferences sharedPreferences;
    InformationClass information;
    String tags[];
    String eventNames[];
    String  notification_events[];

    int x[];
    ListView notification_list;

    public Notification_class() {
        // Required empty public constructor
    }

    View fragmentView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView =  inflater.inflate(R.layout.fragment_notification_class, container, false);
        return fragmentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        information=new InformationClass();

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(getContext());

        tags=information.events;
        eventNames=information.events_names;

        notification_events=send_position();


        notification_list=(ListView) fragmentView.findViewById(R.id.listView_of_notification);
        final NotificationAdapter noti=new NotificationAdapter(getContext(),R.layout.single_row_layout,R.id.event_notification,notification_events);
        notification_list.setAdapter(noti);

        notification_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Notification_Dialog_box box = new Notification_Dialog_box(getContext(), x[position]);
                box.show();
                box.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        After_click();
                    }


                });

            }
        });






    }
   /* @Override
    private void onResume() {
        super.onResume();
        After_click();
    }*/

    private void After_click(){
        notification_events = send_position();
        final NotificationAdapter noti=new NotificationAdapter(getContext(),R.layout.single_row_layout,R.id.event_notification,notification_events);
        notification_list.setAdapter(noti);
    }

    private String[] send_position(){

        int count=0;
        for(int i=0;i<tags.length;i++){
            boolean check=sharedPreferences.getBoolean(tags[i],false);
            if(check)
                count++;
        }
        int position[]=new int[count];
        // System.out.print("hey there---------------------- "+count);
        for(int i=0,j=0;i<tags.length;i++){
            boolean check=sharedPreferences.getBoolean(tags[i],false);
            if(check){
                position[j]=i;j++;}
        }

        String Names[]=new String[position.length];
        for(int i=0;i<position.length;i++){
            Names[i]=eventNames[position[i]];
        }
        x=position;
        return Names;
    }

    public class NotificationAdapter extends ArrayAdapter<String> {
        Context context;
        String EVENTS_NAMSE[];
        public NotificationAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
            super(context, resource, textViewResourceId, objects);
            this.context=context;
            EVENTS_NAMSE=objects;
        }


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View row=View.inflate(context, R.layout.single_row_layout, null);

            TextView textView=(TextView) row.findViewById(R.id.event_notification);
            textView.setText(EVENTS_NAMSE[position]);
            return row;
        }




    }
}
