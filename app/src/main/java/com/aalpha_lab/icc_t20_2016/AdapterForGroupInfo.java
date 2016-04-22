package com.aalpha_lab.icc_t20_2016;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterForGroupInfo extends ArrayAdapter<String> {

    private Context c;
    private LayoutInflater inflater;
    private String[] countryName;
    private int[] countryFlag;

    public AdapterForGroupInfo(Context context, String[] countryName, int[] countryFlag) {
        super(context, R.layout.custom_row_activity_groups_info, countryName);
        this.c = context;
        this.countryName = countryName;
        this.countryFlag = countryFlag;
    }

    // 'ViewHolder' class
    public class ViewHolder {
        TextView textView_countryName;
        ImageView imageView_countryFlag;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_row_activity_groups_info, null);
        }

        // 'holder' object of 'ViewHolder' class
        ViewHolder holder = new ViewHolder();

        // initialize 'holder' object
        holder.textView_countryName = (TextView) convertView.findViewById(R.id.textView_country_name);
        holder.imageView_countryFlag = (ImageView) convertView.findViewById(R.id.imageView_country_flag);

        // assigning data to the 'holder' object
        holder.textView_countryName.setText(countryName[position]);
        holder.imageView_countryFlag.setImageResource(countryFlag[position]);

        return convertView;
    }

}
