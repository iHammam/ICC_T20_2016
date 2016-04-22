package com.aalpha_lab.icc_t20_2016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class SuperTen extends AppCompatActivity {

    ListView listView2;

    private String[] date = {
            "15 March",
            "16 March",
            "16 March",
            "17 March",
            "18 March",
            "18 March",
            "19 March",
            "20 March",
            "20 March",
            "21 March",
            "22 March",
            "23 March",
            "23 March",
            "25 March",
            "25 March",
            "26 March",
            "26 March",
            "27 March",
            "27 March",
            "28 March"
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
            "Match 12",
            "Match 13",
            "Match 14",
            "Match 15",
            "Match 16",
            "Match 17",
            "Match 18",
            "Match 19",
            "Match 20"
    };

    private String[] venue = {
            "Nagpur",
            "Mumbai",
            "Kolkata",
            "Kolkata",
            "Dharamsala",
            "Mumbai",
            "Dharamsala",
            "Mumbai",
            "Bangaluru",
            "Bangaluru",
            "Mohali",
            "New Delhi",
            "Bangaluru",
            "Mohali",
            "Nagpur",
            "Kolkata",
            "New Delhi",
            "Mohali",
            "Nagpur",
            "New Delhi"
    };

    private String[] team1 = {
            "New Zealand",
            "West Indies",
            "Pakistan",
            "Sri Lanka",
            "Australia",
            "South Africa",
            "India",
            "South Africa",
            "Sri Lanka",
            "Australia",
            "New Zealand",
            "England",
            "India",
            "Pakistan",
            "South Africa",
            "New Zealand",
            "England",
            "India",
            "West Indies",
            "South Africa"
    };

    private String[] team2 = {
            "India",
            "England",
            "Q1-A",
            "Q1-B",
            "New Zealand",
            "England",
            "Pakistan",
            "Q1-B",
            "West Indies",
            "Q1-A",
            "Pakistan",
            "Q1-B",
            "Q1-A",
            "Australia",
            "West Indies",
            "Q1-A",
            "Sri Lanka",
            "Australia",
            "Q1-B",
            "Sri Lanka"
    };

    private int[] flag_team1 = {
            R.drawable.flag_newzealand,
            R.drawable.flag_westindies,
            R.drawable.flag_pakistan,
            R.drawable.flag_srilanka,
            R.drawable.flag_australia,
            R.drawable.flag_south_africa,
            R.drawable.flag_india,
            R.drawable.flag_south_africa,
            R.drawable.flag_srilanka,
            R.drawable.flag_australia,
            R.drawable.flag_newzealand,
            R.drawable.flag_england,
            R.drawable.flag_india,
            R.drawable.flag_pakistan,
            R.drawable.flag_south_africa,
            R.drawable.flag_newzealand,
            R.drawable.flag_england,
            R.drawable.flag_india,
            R.drawable.flag_westindies,
            R.drawable.flag_south_africa
    };

    private int[] flag_team2 = {
            R.drawable.flag_india,
            R.drawable.flag_england,
            R.drawable.flag_q1_a,
            R.drawable.flag_q1_b,
            R.drawable.flag_newzealand,
            R.drawable.flag_england,
            R.drawable.flag_pakistan,
            R.drawable.flag_q1_b,
            R.drawable.flag_westindies,
            R.drawable.flag_q1_a,
            R.drawable.flag_pakistan,
            R.drawable.flag_q1_b,
            R.drawable.flag_q1_a,
            R.drawable.flag_australia,
            R.drawable.flag_westindies,
            R.drawable.flag_q1_a,
            R.drawable.flag_srilanka,
            R.drawable.flag_australia,
            R.drawable.flag_q1_b,
            R.drawable.flag_srilanka
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_ten);

        listView2 = (ListView) findViewById(R.id.listView2);

        // our 'AdapterForMatchInfo' object
        AdapterForMatchInfo adapterForMatchInfo = new AdapterForMatchInfo(this,
                matchNo, date, venue, team1, team2, flag_team1, flag_team2);
        listView2.setAdapter(adapterForMatchInfo);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_super_ten, menu);
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
//            Toast.makeText(SuperTen.this,
//                    "More Apps", Toast.LENGTH_SHORT).show();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

}
