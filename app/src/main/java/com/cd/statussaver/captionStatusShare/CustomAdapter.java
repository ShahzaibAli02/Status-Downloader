package com.cd.statussaver.captionStatusShare;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cd.statussaver.R;


class CustomAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] logos;

    CustomAdapter(Context applicationContext, String[] logos) {
        this.context = applicationContext;
        this.logos = logos;
        this.inflater = LayoutInflater.from(applicationContext);
    }

    public int getCount() {
        return this.logos.length;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = this.inflater.inflate(R.layout.custom_tab1, null);
        ((TextView) view.findViewById(R.id.text1)).setText(this.logos[i]);
        return view;
    }
}
