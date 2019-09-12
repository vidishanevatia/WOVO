package com.example.wovo;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;


import com.google.android.material.navigation.NavigationView;

public class SettingsActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener {

    AlertDialog.Builder builder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        this.setTitle("Settings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);



    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.my_info) {
            Intent intent = new Intent(SettingsActivity.this , InfoActivity.class);
            startActivity(intent);
        }

        else if (id == R.id.support) {
            Intent intent = new Intent(SettingsActivity.this , SupportActivity.class);
            startActivity(intent);
        }

        else if (id == R.id.terms)
        {
            Toast toast = Toast.makeText(SettingsActivity.this, "Coming Soon", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, -1000);
            toast.show();
        }

        else if (id == R.id.privacy_policy)
        {
            Toast toast = Toast.makeText(SettingsActivity.this, "Coming Soon", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, -1000);
            toast.show();
        }

        else if (id == R.id.about) {
            Intent intent = new Intent(SettingsActivity.this , AboutActivity.class);
            startActivity(intent);
        }

        else if (id == R.id.change_password) {
            Intent intent = new Intent(SettingsActivity.this , ChangePasswordActivity.class);
            startActivity(intent);
        }



        else if (id == R.id.sign_out) {

            builder = new AlertDialog.Builder(this);
            builder.setMessage("Do you want to sign out?"). setTitle("WOVO")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent(SettingsActivity.this,LoginActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            // Add new Flag to start new Activity
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //  Action for 'NO' Button
                            dialog.cancel();

                        }
                    });
            //Creating dialog box
            AlertDialog alert = builder.create();
            //Setting the title manually
            alert.setTitle("WOVO");
            alert.show();


        }

        else if(id == R.id.reset)
        {

            builder = new AlertDialog.Builder(this);
            builder.setMessage("Do you want to reset this application?")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            Intent mStartActivity = new Intent(SettingsActivity.this, SplashActivity.class);
                            int mPendingIntentId = 123456;
                            PendingIntent mPendingIntent = PendingIntent.getActivity(SettingsActivity.this, mPendingIntentId, mStartActivity,
                                    PendingIntent.FLAG_CANCEL_CURRENT);
                            AlarmManager mgr = (AlarmManager) SettingsActivity.this.getSystemService(Context.ALARM_SERVICE);
                            mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
                            System.exit(0);

                        }
                    })
                    .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            //Creating dialog box
            AlertDialog alert = builder.create();
            //Setting the title manually
            alert.setTitle("WOVO");
            alert.show();


        }



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }






}

