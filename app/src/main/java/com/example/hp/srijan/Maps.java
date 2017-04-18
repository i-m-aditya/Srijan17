package com.example.hp.srijan;



        import android.content.res.Resources;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.design.widget.Snackbar;
        import android.support.v4.app.Fragment;
        import android.support.v4.content.ContextCompat;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.BitmapDescriptorFactory;
        import com.google.android.gms.maps.model.CameraPosition;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MapStyleOptions;
        import com.google.android.gms.maps.model.Marker;
        import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class Maps extends Fragment implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {


    private static final String TAG =Maps.class.getSimpleName() ;
    public  Marker[] events;
    View v,v1;
    String decider;

    public Maps() {
        // Required empty public constructor

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v1  = inflater.inflate(R.layout.fragment_maps, container, false);
        v = v1.findViewById(R.id.map);
        events = new Marker[8];
        decider = getArguments().getString("key");
        return v1 ;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment fragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {


        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            getContext(), R.raw.style_json));

            if (!success) {
                Log.e(TAG, "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Can't find style. Error: ", e);
        }
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(23.8144, 86.4412)));
        googleMap.animateCamera(CameraUpdateFactory.zoomIn());
        googleMap.setBuildingsEnabled(true);



            if(decider.equals("NLHC")) {

                CameraPosition cameraPosition1 = new CameraPosition.Builder().
                        target(new LatLng(23.816291, 86.439418)).
                        tilt(69).
                        zoom(18).
                        bearing(0).
                        build();
                events[0] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.816291, 86.439418))
                        .title("NLHC")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition1));



            }
            else if(decider.equals("OAT")) {
                CameraPosition cameraPosition2 = new CameraPosition.Builder().
                        target(new LatLng(23.814382, 86.441202)).
                        tilt(69).
                        zoom(18).
                        bearing(0).
                        build();
                events[1] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.814382, 86.441202))
                        .title("Open Air Theatre")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition2));


            }
         else if(decider.equals("Management Hall")) {

                CameraPosition cameraPosition2 = new CameraPosition.Builder().
                        target(new LatLng(23.811993,86.440696)).
                        tilt(69).
                        zoom(18).
                        bearing(0).
                        build();
                events[1] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.811993,86.440696))
                        .title("Management Hall")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition2));


            }
            else if(decider.equals("SAC(Badminton Court)")) {
                CameraPosition cameraPosition2 = new CameraPosition.Builder().
                        target(new LatLng(23.817335,86.437582)).
                        tilt(69).
                        zoom(18).
                        bearing(0).
                        build();
                events[1] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.817335,86.437582))
                        .title("Student Activity Centre")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition2));

            }
        else if(decider.equals("GJLT")) {

                CameraPosition cameraPosition2 = new CameraPosition.Builder().
                        target(new LatLng(23.813552,86.440267)).
                        tilt(69).
                        zoom(18).
                        bearing(0).
                        build();
                events[1] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.813552,86.440267))
                        .title("Golden Jubile Lecture Theatre")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition2));


            }
        else if(decider.equals("Penmen Auditorium")) {

                CameraPosition cameraPosition2 = new CameraPosition.Builder().
                        target(new LatLng(23.814838,86.441193)).
                        tilt(69).
                        zoom(18).
                        bearing(0).
                        build();
                events[1] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.814838,86.441193))
                        .title("Penmen Auditorium")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition2));


            }
        else if(decider.equals("Upper Ground")) {
                CameraPosition cameraPosition2 = new CameraPosition.Builder().
                        target(new LatLng(23.813022,86.441038)).
                        tilt(69).
                        zoom(18).
                        bearing(0).
                        build();

                events[1] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.813022,86.441038))
                        .title("Upper Ground")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition2));


            }
        else if (decider.equals("Lower Ground")) {
                CameraPosition cameraPosition2 = new CameraPosition.Builder().
                        target(new LatLng(23.812878,86.442593)).
                        tilt(69).
                        zoom(18).
                        bearing(0).
                        build();

                events[1] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.812878,86.442593))
                        .title("Lower Ground")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition2));

            }
        else if(decider.equals("all"))
            {
                CameraPosition cameraPosition = new CameraPosition.Builder().
                        target(new LatLng(23.8144, 86.4412)).
                        tilt(69).
                        zoom(16).
                        bearing(0).
                        build();


                events[0] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.816291, 86.439418))
                        .title("NLHC")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));


                events[1] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.814382, 86.441202))
                        .title("OLHC")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.event)));

                events[3] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.814372, 86.441202))
                        .title("OLHC")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.mensloo)));

                events[4] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.813712, 86.440346))
                        .title("Golden Jublie Lecture Hall")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.mensloo)));

                events[5] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.814382, 86.441202))
                        .title("Lower Ground")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.mensloo)));

                events[6] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.815041, 86.44158))
                        .title("Main Canteen")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.restraunts)));


                events[7] = googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(23.819055, 86.438635))
                        .title("Sriyam")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.restraunts)));
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));



            }














        googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {

     /*           if (marker.equals(events[0]))
                {
                    Log.i("clicked","Yes");
                    Snackbar snackbar=Snackbar.make(view,"New Lecture Hall Complex", Snackbar.LENGTH_LONG);
                    View v = snackbar.getView();
                    TextView textView  = (TextView) v.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.BLACK);
                    v.setBackgroundColor(ContextCompat.getColor(MapsActivity.this, R.color.snackbar));
                    snackbar.show();

                    //handle click here
                }
                else
                if(marker.equals(event2))
                {

                    Log.i("clicked","Yes");
                    Snackbar snackbar=Snackbar.make(view,"Old Lecture Hall Complex", Snackbar.LENGTH_LONG);
                    View v = snackbar.getView();
                    TextView textView  = (TextView) v.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.BLACK);
                    v.setBackgroundColor(ContextCompat.getColor(MapsActivity.this, R.color.snackbar));
                    snackbar.show();
                }
                else
                {
                    Snackbar snackbar=Snackbar.make(view,selectedTitle, Snackbar.LENGTH_LONG);
                    View v = snackbar.getView();
                    TextView textView  = (TextView) v.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.BLACK);
                    v.setBackgroundColor(ContextCompat.getColor(MapsActivity.this, R.color.snackbar));
                    snackbar.show();

                }*/


                    Snackbar snackbar=Snackbar.make(v,marker.getTitle(), Snackbar.LENGTH_LONG);
                    View v = snackbar.getView();
                    TextView textView  = (TextView) v.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.BLACK);
                    v.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.snackbar));
                    snackbar.show();

                return false;
            }
        });

        // Zoom out to zoom level 10, animating with a duration of 2 seconds.


    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }


}

