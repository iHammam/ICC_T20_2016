package com.aalpha_lab.icc_t20_2016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class QualifyingGroup extends AppCompatActivity {

    ListView listView1;

    private String[] date = {
            "8 March pm",
            "8 March eve",
            "9 March pm",
            "9 March eve",
            "10 March pm",
            "10 March eve",
            "11 March pm",
            "11 March eve",
            "12 March pm",
            "12 March eve",
            "13 March pm",
            "13 March eve"
    };

    private String[] matchNo = {
            "Match 1",
            "Match 2",
            "Match 3",
            "Match 4",
            "Match 5",
            "Match 6",
            "Match 7",
            "Match 8",
            "Match 9",
            "Match 10",
            "Match 11",
            "Match 12"
    };

    private String[] venue = {
            "Nagpur",
            "Nagpur",
            "Dharamsala",
            "Dharamsala",
            "Nagpur",
            "Nagpur",
            "Dharamsala",
            "Dharamsala",
            "Nagpur",
            "Nagpur",
            "Dharamsala",
            "Dharamsala"
    };

    private String[] team1 = {
            "Zimbabwe",
            "Scotland",
            "Bangladesh",
            "Ireland",
            "Scotland",
            "Hong Kong",
            "Netherlands",
            "Bangladesh",
            "Zimbabwe",
            "Scotland",
            "Netherlands",
            "Bangladesh"
    };

    private String[] team2 = {
            "Hong Kong",
            "Afghanistan",
            "Netherlands",
            "Oman",
            "Zimbabwe",
            "Afghanistan",
            "Oman",
            "Ireland",
            "Afghanistan",
            "Hong Kong",
            "Ireland",
            "Oman",
    };

    private int[] flag_team1 = {
            R.drawable.flag_zimbabwe,
            R.drawable.flag_scotland,
            R.drawable.flag_bangladesh,
            R.drawable.flag_ireland,
            R.drawable.flag_scotland,
            R.drawable.flag_hong_kong,
            R.drawable.flag_netherlands,
            R.drawable.flag_bangladesh,
            R.drawable.flag_zimbabwe,
            R.drawable.flag_scotland,
            R.drawable.flag_netherlands,
            R.drawable.flag_bangladesh
    };

    private int[] flag_team2 = {
            R.drawable.flag_hong_kong,
            R.drawable.flag_afganistan,
            R.drawable.flag_netherlands,
            R.drawable.flag_oman,
            R.drawable.flag_zimbabwe,
            R.drawable.flag_afganistan,
            R.drawable.flag_oman,
            R.drawable.flag_ireland,
            R.drawable.flag_afganistan,
            R.drawable.flag_hong_kong,
            R.drawable.flag_ireland,
            R.drawable.flag_oman
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualifying_group);

        listView1 = (ListView) findViewById(R.id.listView1);

        // our 'AdapterForMatchInfo' object
        AdapterForMatchInfo adapterForMatchInfo = new AdapterForMatchInfo(this,
                matchNo, date, venue, team1, team2, flag_team1, flag_team2);
        listView1.setAdapter(adapterForMatchInfo);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_qualifying_group, menu);
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
//            Toast.makeText(QualifyingGroup.this,
//                    "More Apps", Toast.LENGTH_SHORT).show();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

}
