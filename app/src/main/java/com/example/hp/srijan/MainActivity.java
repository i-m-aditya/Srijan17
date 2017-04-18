package com.example.hp.srijan;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.storage.OnPausedListener;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    CollapsingToolbarLayout mCollapsingToolbarLayout;
    ListView lv;
    String[] values = new String[] { "All Events","Dance","Music","Literary","Dramatics","LifeStyle","FineArts","Online","Informals","Pronites"};
    boolean what =true;
    View v;

    public static int total=0;
    com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton rightLowerButton;
    FloatingActionMenu rightLowerMenu;
    int count=0;

    public static android.support.v4.app.FragmentTransaction fragmentTransaction_1,fragmentTransaction_2,fragmentTransaction_3,fragmentTransaction_4,fragmentTransaction_5,fragmentTransaction_6,fragmentTransaction_7,fragmentTransaction_8,fragmentTransaction_9,fragmentTransaction_10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
        setContentView(R.layout.activity_main);
         final RelativeLayout blue = (RelativeLayout) findViewById(R.id.first_blue);
        final RelativeLayout blue2 = (RelativeLayout) findViewById(R.id.first_bluetwo);
        final RelativeLayout red = (RelativeLayout) findViewById(R.id.relativeLayout2);
        v = findViewById(R.id.nav_back);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //  mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        // lv = (ListView)findViewById(R.id.listview);
        //CustomAdapter customAdapter = new CustomAdapter(this,R.layout.list_layout,values);
        //lv.setAdapter(customAdapter);
        //setCollapsingToolbarLayoutTitle("Events");


        fragmentTransaction_1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_2 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_3 = getSupportFragmentManager().beginTransaction();

        fragmentTransaction_4 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_5 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_6 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_7 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_8 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_9 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_10 = getSupportFragmentManager().beginTransaction();


        //button = (Button) findViewById(R.id.button);

        // Create an icon
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_day,R.anim.slide_out_day);
                fragmentTransaction.add(R.id.frame_container,new Day_class1()).addToBackStack("fragback").commit();
                getSupportActionBar().setTitle("Day 1");

                rightLowerButton.setVisibility(View.INVISIBLE);
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_day2,R.anim.slide_out_day2);
                fragmentTransaction.add(R.id.frame_container,new Day_class2()).addToBackStack("fragback").commit();
                getSupportActionBar().setTitle("Day 2");

                rightLowerButton.setVisibility(View.INVISIBLE);
            }
        });
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in_day,R.anim.slide_out_day);
                fragmentTransaction.add(R.id.frame_container,new Day_class3()).addToBackStack("fragback").commit();
                getSupportActionBar().setTitle("Day 3");

                rightLowerButton.setVisibility(View.INVISIBLE);
            }
        });
        final ImageView fabIconNew = new ImageView(this);
        fabIconNew.setImageDrawable(getResources().getDrawable(R.drawable.fab));
        rightLowerButton = new com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton.Builder(this)
                .setContentView(fabIconNew)
                .setPosition(5)
                .build();
        TranslateAnimation anim = new TranslateAnimation(0, 0, 0, -575);
        anim.setDuration(1000);
        FrameLayout.LayoutParams param2 = (FrameLayout.LayoutParams) rightLowerButton.getLayoutParams();
        param2.width=250;
        param2.height=250;
        rightLowerButton.setLayoutParams(param2);


        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) rightLowerButton.getLayoutParams();
        params.bottomMargin = (Resources.getSystem().getDisplayMetrics().heightPixels)/2-165;
        params.leftMargin = 365;
        params.topMargin = 0;
        rightLowerButton.setLayoutParams(params);


        SubActionButton.Builder rLSubBuilder = new SubActionButton.Builder(this);
        ImageView rlIcon1 = new ImageView(this);
        ImageView rlIcon2 = new ImageView(this);
        ImageView rlIcon3 = new ImageView(this);
        ImageView rlIcon4 = new ImageView(this);
        ImageView rlIcon5 = new ImageView(this);
        ImageView rlIcon6 = new ImageView(this);
        ImageView rlIcon7 = new ImageView(this);
        ImageView rlIcon8 = new ImageView(this);
        rlIcon1.setImageBitmap(textAsBitmap("All Events", 30, Color.BLACK));
        rlIcon2.setImageBitmap(textAsBitmap("Music", 30, Color.BLACK));
        rlIcon3.setImageBitmap(textAsBitmap("Dance", 30, Color.BLACK));
        rlIcon4.setImageBitmap(textAsBitmap("lifestyle", 30, Color.BLACK));
        rlIcon5.setImageBitmap(textAsBitmap("literary", 30, Color.BLACK));
        rlIcon6.setImageBitmap(textAsBitmap("Online", 30, Color.BLACK));
        rlIcon7.setImageBitmap(textAsBitmap("Dramatics", 30, Color.BLACK));
        rlIcon8.setImageBitmap(textAsBitmap("FineArts", 30, Color.BLACK));

        // Build the menu with default options: light theme, 90 degrees, 72dp radius.
        // Set 4 default SubActionButtons
        View vall = rLSubBuilder.setContentView(rlIcon1).setLayoutParams(param2).build();
        View vmusic = rLSubBuilder.setContentView(rlIcon2).setLayoutParams(param2).build();
        View vDance = rLSubBuilder.setContentView(rlIcon3).setLayoutParams(param2).build();
        View vLifeStyle = rLSubBuilder.setContentView(rlIcon4).setLayoutParams(param2).build();
        View vLiteracy = rLSubBuilder.setContentView(rlIcon5).setLayoutParams(param2).build();
        View vOnline = rLSubBuilder.setContentView(rlIcon6).setLayoutParams(param2).build();
        rightLowerMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(vall)
                .addSubActionView(vmusic)
                .addSubActionView(vDance)
                .addSubActionView(vLifeStyle)
                .addSubActionView(vLiteracy)
                .addSubActionView(vOnline)
                .attachTo(rightLowerButton)
                .setRadius(500)
                .setStartAngle(90)
                .setEndAngle(270)
                .build();

        vall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_container,new AllEvents()).addToBackStack("fragback").commit();
                getSupportActionBar().setTitle("All Events");
                 rightLowerMenu.close(true);
                rightLowerButton.setVisibility(View.INVISIBLE);

            }
        });
        vmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_container,new MusicEvents()).addToBackStack("fragback").commit();
                getSupportActionBar().setTitle("Music");
                rightLowerMenu.close(true);

                rightLowerButton.setVisibility(View.INVISIBLE);

            }
        });
        vDance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_container,new DanceEvents()).addToBackStack("fragback").commit();

                getSupportActionBar().setTitle("Dance");
                rightLowerMenu.close(true);

                rightLowerButton.setVisibility(View.INVISIBLE);
            }
        });


        vLifeStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_container,new LifestyleEvents()).addToBackStack("fragback").commit();
                getSupportActionBar().setTitle("Lifestyle");

                rightLowerMenu.close(true);

                rightLowerButton.setVisibility(View.INVISIBLE);
            }
        });


        vLiteracy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_container,new LiteracyEvents()).addToBackStack("fragback").commit();
                getSupportActionBar().setTitle("Literary");
                rightLowerMenu.close(true);
                rightLowerButton.setVisibility(View.INVISIBLE);
            }
        });

        vOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_container,new OnlineEvents()).addToBackStack("fragback").commit();
                getSupportActionBar().setTitle("Online");
                rightLowerMenu.close(true);
                rightLowerButton.setVisibility(View.INVISIBLE);
            }
        });


        final TranslateAnimation anim1 = new TranslateAnimation(1000, 0, 0, 0);
        anim1.setDuration(500);
        final TranslateAnimation anim2 = new TranslateAnimation(0, 1000, 0, 0);
        anim2.setDuration(500);

        // Listen menu open and close events to animate the button content view
        rightLowerMenu.setStateChangeListener(new FloatingActionMenu.MenuStateChangeListener() {
            @Override
            public void onMenuOpened(FloatingActionMenu menu) {
                // Rotate the icon of rightLowerButton 45 degrees clockwise
                fabIconNew.setRotation(0);
                PropertyValuesHolder pvhR = PropertyValuesHolder.ofFloat(View.ROTATION, 180);
                ObjectAnimator animation = ObjectAnimator.ofPropertyValuesHolder(fabIconNew, pvhR);
                animation.start();
                TranslateAnimation anim3 = new TranslateAnimation(0, -1000, 0, 0);
                anim3.setDuration(500);
                red.startAnimation(anim3);
                blue.startAnimation(anim2);
                blue2.startAnimation(anim2);
                blue.setVisibility(View.INVISIBLE);
                blue2.setVisibility(View.INVISIBLE);
                red.setVisibility(View.INVISIBLE);
                v.setAlpha(0.9f);
            }

            @Override
            public void onMenuClosed(FloatingActionMenu menu) {
                // Rotate the icon of rightLowerButton 45 degrees counter-clockwise
                fabIconNew.setRotation(45);
                PropertyValuesHolder pvhR = PropertyValuesHolder.ofFloat(View.ROTATION, 0);
                ObjectAnimator animation = ObjectAnimator.ofPropertyValuesHolder(fabIconNew, pvhR);
                animation.start();
                TranslateAnimation anim3 = new TranslateAnimation(-1000, 0, 0, 0);
                anim3.setDuration(500);
                red.startAnimation(anim3);
                blue.startAnimation(anim1);
                blue2.startAnimation(anim1);
                blue.setVisibility(View.VISIBLE);
                blue2.setVisibility(View.VISIBLE);
                red.setVisibility(View.VISIBLE);
                v.setAlpha(1);
            }
        });








        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close){
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                rightLowerButton.setVisibility(View.VISIBLE);

            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                rightLowerButton.setVisibility(View.GONE);
                if(rightLowerMenu.isOpen())
                {
                    rightLowerMenu.close(true);
                }

            }

        };
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }
    int nav_count;

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        getSupportActionBar().setTitle("Srijan");
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        if (getSupportFragmentManager().getBackStackEntryCount() ==0) {

            getSupportFragmentManager().popBackStack();



        } else if(getSupportFragmentManager().getBackStackEntryCount()==1)
        {
            getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStack();

        }
        else if(getSupportFragmentManager().getBackStackEntryCount()==2)
        {
            getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStack();

            getSupportFragmentManager().popBackStack();

        }else if(getSupportFragmentManager().getBackStackEntryCount()==3)
        {
            getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStack();

            getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStack();

        }else if(getSupportFragmentManager().getBackStackEntryCount()>3)
        {
            getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStack();

            getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStack();

        }
        else
        {
            this.finish();
        }
        rightLowerButton.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Maps maps = new Maps();
        Bundle bundle = new Bundle();
        bundle.putString("key", "all");
        maps.setArguments(bundle);

        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();


            if (id == R.id.nav_notification)
            {
                fragmentTransaction.add(R.id.frame_container,new Notification_class()).addToBackStack("fragback").commit();

                rightLowerButton.setVisibility(View.INVISIBLE);

            }
            else if(id==R.id.nav_map)
            {
                fragmentTransaction.add(R.id.frame_container,maps).addToBackStack("fragback").commit();

                rightLowerButton.setVisibility(View.INVISIBLE);

            }
        else if (id == R.id.nav_register)
            {

                fragmentTransaction.add(R.id.frame_container,new Register()).addToBackStack("fragback").commit();

                rightLowerButton.setVisibility(View.INVISIBLE);

            }
        else if(id == R.id.nav_contacts)
            {
                fragmentTransaction.add(R.id.frame_container,new Contact_us()).addToBackStack("fragback").commit();

                rightLowerButton.setVisibility(View.INVISIBLE);
            }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public static Bitmap textAsBitmap(String text, float textSize, int textColor) {
        Paint paint = new Paint(ANTI_ALIAS_FLAG);
        paint.setTextSize(textSize);
        paint.setColor(textColor);
        paint.setTextAlign(Paint.Align.LEFT);
        float baseline = -paint.ascent(); // ascent() is negative
        int width = (int) (paint.measureText(text) + 0.0f); // round
        int height = (int) (baseline + paint.descent() + 0.0f);
        Bitmap image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);


        Canvas canvas = new Canvas(image);
        canvas.drawText(text, 0, baseline, paint);
        return image;
    }



}
