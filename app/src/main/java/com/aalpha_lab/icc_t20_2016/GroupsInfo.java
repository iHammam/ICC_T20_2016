package com.aalpha_lab.icc_t20_2016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class GroupsInfo extends AppCompatActivity {

    ListView listView_groupA;
    ListView listView_groupB;
    ListView listView_group1;
    ListView listView_group2;

    private String[] groupA = {
            "Bangladesh",
            "Ireland",
            "Netherlands",
            "Oman"
    };

    private int[] flag_groupA = {
            R.drawable.flag_bangladesh,
            R.drawable.flag_ireland,
            R.drawable.flag_netherlands,
            R.drawable.flag_oman
    };

    private String[] groupB = {
            "Zimbabwe",
            "Scotland",
            "Afghanistan",
            "Hong Kong"
    };

    private int[] flag_groupB = {
            R.drawable.flag_zimbabwe,
            R.drawable.flag_scotland,
            R.drawable.flag_afganistan,
            R.drawable.flag_hong_kong
    };

    private String[] group1 = {
            "India",
            "Pakistan",
            "Australia",
            "New Zealand",
            "Qualified Team B"
    };

    private int[] flag_group1 = {
            R.drawable.flag_india,
            R.drawable.flag_pakistan,
            R.drawable.flag_australia,
            R.drawable.flag_newzealand,
            R.drawable.flag_b1
    };

    private String[] group2 = {
            "South Africa",
            "Sri Lanka",
            "West Indies",
            "England",
            "Qualified Team A"
    };

    private int[] flag_group2 = {
            R.drawable.flag_south_africa,
            R.drawable.flag_srilanka,
            R.drawable.flag_westindies,
            R.drawable.flag_england,
            R.drawable.flag_a1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_info);

        listView_groupA = (ListView) findViewById(R.id.listView_groupA);
        listView_groupB = (ListView) findViewById(R.id.listView_groupB);
        listView_group1 = (ListView) findViewById(R.id.listView_group1);
        listView_group2 = (ListView) findViewById(R.id.listView_group2);

        // groupA added here
        AdapterForGroupInfo adapterGroupA = new AdapterForGroupInfo(this, groupA, flag_groupA);
        listView_groupA.setAdapter(adapterGroupA);
        Utility.setListViewHeightBasedOnChildren(listView_groupA);

        // groupB added here
        AdapterForGroupInfo adapterGroupB = new AdapterForGroupInfo(this, groupB, flag_groupB);
        listView_groupB.setAdapter(adapterGroupB);
        Utility.setListViewHeightBasedOnChildren(listView_groupB);

        // group1 added here
        AdapterForGroupInfo adapterGroup1 = new AdapterForGroupInfo(this, group1, flag_group1);
        listView_group1.setAdapter(adapterGroup1);
        Utility.setListViewHeightBasedOnChildren(listView_group1);

        // group2 added here
        AdapterForGroupInfo adapterGroup2 = new AdapterForGroupInfo(this, group2, flag_group2);
        listView_group2.setAdapter(adapterGroup2);
        Utility.setListViewHeightBasedOnChildren(listView_group2);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_groups_info, menu);
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
//            Toast.makeText(GroupsInfo.this,
//                    "More Apps", Toast.LENGTH_SHORT).show();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

}
