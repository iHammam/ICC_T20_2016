package com.aalpha_lab.icc_t20_2016;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterForKnockOut extends ArrayAdapter<String> {

    private Context c;
    private LayoutInflater inflater;
    private String[] heading;
    private String[] matchNo;
    private String[] date;
    private String[] venue;
    private String[] team1;
    private String[] team2;
    private int[] flag_team1;
    private int[] flag_team2;

    public AdapterForKnockOut(Context context, String[] heading, String[] matchNo, String[] date, String[] venue, String[] team1, String[] team2, int[] flag_team1, int[] flag_team2) {
        super(context, R.layout.custom_row_knock_out, matchNo);
        this.c = context;
        this.heading = heading;
        this.matchNo = matchNo;
        this.date = date;
        this.venue = venue;
        this.team1 = team1;
        this.team2 = team2;
        this.flag_team1 = flag_team1;
        this.flag_team2 = flag_team2;
    }

    // 'ViewHolder' class
    public class ViewHolder {
        TextView textView_heading;
        TextView textView_matchNo;
        TextView textView_date;
        TextView textView_venue;
        TextView textView_team1;
        TextView textView_team2;
        ImageView imageView_flagTeam1;
        ImageView imageView_flagTeam2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_row_knock_out, null);
        }

        // 'holder' object of 'ViewHolder' class
        ViewHolder holder = new ViewHolder();

        // initialize 'holder' object
        holder.textView_heading = (TextView) convertView.findViewById(R.id.heading);
        holder.textView_matchNo = (TextView) convertView.findViewById(R.id.match_no);
        holder.textView_date = (TextView) convertView.findViewById(R.id.date);
        holder.textView_venue = (TextView) convertView.findViewById(R.id.venue);
        holder.textView_team1 = (TextView) convertView.findViewById(R.id.team1);
        holder.textView_team2 = (TextView) convertView.findViewById(R.id.team2);
        holder.imageView_flagTeam1 = (ImageView) convertView.findViewById(R.id.flag_team1);
        holder.imageView_flagTeam2 = (ImageView) convertView.findViewById(R.id.flag_team2);

        // assigning data to the 'holder' object
        holder.textView_heading.setText(heading[position]);
        holder.textView_matchNo.setText(matchNo[position]);
        holder.textView_date.setText(date[position]);
        holder.textView_venue.setText(venue[position]);
        holder.textView_team1.setText(team1[position]);
        holder.textView_team2.setText(team2[position]);
        holder.imageView_flagTeam1.setImageResource(flag_team1[position]);
        holder.imageView_flagTeam2.setImageResource(flag_team2[position]);

        return convertView;
    }

}
