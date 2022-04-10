package com.example.japanese_idol_female_team;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private  String[] text;
    private  int[] imageId;


    public MainAdapter(Context context, String[] text, int[] imageId) {
        this.context = context;
        this.text = text;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.row_item, null);
        } else {
            v = (View) convertView;
        }
        if (v != null) {//必免圖片重複出現
            TextView textView = v.findViewById(R.id.text_view);
            textView.setText(text[position]);
            ImageView imageView = v.findViewById(R.id.image_view);
            imageView.setImageResource(imageId[position]);
            //notifyDataSetChanged();
        }
        return v;
    }
}
