package com.aalpha_lab.icc_t20_2016;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button button_groupsInfo;
    Button button_fixtures;
    Button button_watch_now;
    private TextView textView_TimerDay;
    private TextView textView_TimerHour;
    private TextView textView_TimerMinute;
    private TextView textView_TimerSecond;
    private TextView textView_TimerEndingText;
    private android.os.Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_groupsInfo = (Button) findViewById(R.id.button_groups_info);
        button_fixtures = (Button) findViewById(R.id.button_fixtures);
        button_watch_now = (Button) findViewById(R.id.button_watch_now);
        textView_TimerDay = (TextView) findViewById(R.id.textView_day);
        textView_TimerHour = (TextView) findViewById(R.id.textView_hours);
        textView_TimerMinute = (TextView) findViewById(R.id.textView_minutes);
        textView_TimerSecond = (TextView) findViewById(R.id.textView_seconds);
        textView_TimerEndingText = (TextView) findViewById(R.id.timerEndingText);

        countDownStart();

        // Opening 'GroupsInfo' Activity
        button_groupsInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GroupsInfo.class);
                startActivity(intent);
            }
        });

        // Opening 'Fixtures' Activity
        button_fixtures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), T20Groups.class);
                startActivity(intent);
            }
        });

        // Opening 'LiveScores' Activity
        button_watch_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LiveScores.class);
                startActivity(intent);
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.dev_info) {
//            Intent intent = new Intent(getApplicationContext(), DevelopersInfo.class);
//            startActivity(intent);
//            return true;
//        }
//
//        if (id == R.id.more_app) {
//            Toast.makeText(MainActivity.this,
//                    "More Apps", Toast.LENGTH_SHORT).show();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    // ICC T20 WorldCup Event Count Down Code
    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
// Please here set your event date//YYYY-MM-DD
                    Date futureDate = dateFormat.parse("2016-3-8");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        textView_TimerDay.setText("" + String.format("%02d", days));
                        textView_TimerHour.setText("" + String.format("%02d", hours));
                        textView_TimerMinute.setText(""
                                + String.format("%02d", minutes));
                        textView_TimerSecond.setText(""
                                + String.format("%02d", seconds));
                    } else {
                        textView_TimerEndingText.setVisibility(View.VISIBLE);
                        textView_TimerEndingText.setText("ICC T20 WorldCup-2016");
                        textViewGone();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    public void textViewGone() {
//        findViewById(R.id.LinearLayout10).setVisibility(View.GONE);
//        findViewById(R.id.LinearLayout11).setVisibility(View.GONE);
//        findViewById(R.id.LinearLayout12).setVisibility(View.GONE);
//        findViewById(R.id.LinearLayout13).setVisibility(View.GONE);
//        findViewById(R.id.textView1).setVisibility(View.GONE);
//        findViewById(R.id.textView2).setVisibility(View.GONE);
        findViewById(R.id.timer_layout).setVisibility(View.GONE);

    }


    // AlertDialog Java Code
    @Override
    public void onBackPressed() {
        // AlertDialog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                MainActivity.this);

        // set title
        alertDialogBuilder.setTitle("Exit");

        // set dialog message
        alertDialogBuilder
                .setMessage("Really want to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show alert dialog
        alertDialog.show();
    }


}


                            /*
                            Happy Coding! :)
                            -Isha Hammam
                            ihammam5@gmail.com
                            */