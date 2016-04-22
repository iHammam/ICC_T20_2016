package com.aalpha_lab.icc_t20_2016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class KnockOut extends AppCompatActivity {

    ListView listView3;

    private String[] heading = {
            "Semi Final 1",
            "Semi Final 2",
            "Final"
    };

    private String[] date = {
            "30 March",
            "31 March",
            "03 April"
    };

    private String[] matchNo = {
            "Match 21",
            "Match 22",
            "Match 23"
    };

    private String[] venue = {
            "New Delhi",
            "Mumbai",
            "Kolkata"
    };

    private String[] team1 = {
            "G1-B",
            "G1-A",
            "F1"
    };

    private String[] team2 = {
            "G2-A",
            "G2-B",
            "F2"
    };

    private int[] flag_team1 = {
            R.drawable.flag_b1,
            R.drawable.flag_a1,
            R.drawable.flag_f1
    };

    private int[] flag_team2 = {
            R.drawable.flag_a2,
            R.drawable.flag_b2,
            R.drawable.flag_f2
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knock_out);

        listView3 = (ListView) findViewById(R.id.listView3);

        // our 'AdapterForKnockOut' object
        AdapterForKnockOut adapterForKnockOut = new AdapterForKnockOut(this, heading,
                matchNo, date, venue, team1, team2, flag_team1, flag_team2);
        listView3.setAdapter(adapterForKnockOut);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_knock_out, menu);
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
//            Toast.makeText(KnockOut.this,
//                    "More Apps", Toast.LENGTH_SHORT).show();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


}
