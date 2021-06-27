package com.cd.statussaver.captionStatusShare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cd.statussaver.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CaptionStatusFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CaptionStatusFragment extends Fragment {


    String name;
    String[] items;
    ListView listViews;
    int position;


    public CaptionStatusFragment() {
        // Required empty public constructor
    }


    public static CaptionStatusFragment newInstance(int position) {
        CaptionStatusFragment fragment = new CaptionStatusFragment();
        Bundle args = new Bundle();
        args.putInt("POS", position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt("POS");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_caption_status, container, false);


        if (this.position == 0) {
            this.items = getResources().getStringArray(R.array.s_best);
        } else if (this.position == 1) {
            this.items = getResources().getStringArray(R.array.s_clever);
        } else if (this.position == 2) {
            this.items = getResources().getStringArray(R.array.s_cool);
        } else if (this.position == 3) {
            this.items = getResources().getStringArray(R.array.s_cute);
        } else if (this.position == 4) {
            this.items = getResources().getStringArray(R.array.s_fitness);
        } else if (this.position == 5) {
            this.items = getResources().getStringArray(R.array.s_funny);
        } else if (this.position == 6) {
            this.items = getResources().getStringArray(R.array.s_life);
        } else if (this.position == 7) {
            this.items = getResources().getStringArray(R.array.s_love);
        } else if (this.position == 8) {
            this.items = getResources().getStringArray(R.array.s_motivation);
        } else if (this.position == 9) {
            this.items = getResources().getStringArray(R.array.s_sad);
        } else if (this.position == 10) {
            this.items = getResources().getStringArray(R.array.s_savage);
        } else if (this.position == 11) {
            this.items = getResources().getStringArray(R.array.s_selfie);
        } else if (this.position == 12) {
            this.items = getResources().getStringArray(R.array.s_song);
        }

        this.listViews = view.findViewById(R.id.simpleListView);
        this.listViews.setAdapter(new CustomAdapter1(getActivity(), this.items));

        return view;
    }
}