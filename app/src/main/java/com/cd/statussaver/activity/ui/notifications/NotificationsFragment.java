package com.cd.statussaver.activity.ui.notifications;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.cd.statussaver.R;
import com.cd.statussaver.util.Utils;


public class NotificationsFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       View root = inflater.inflate(R.layout.fragment_notifications, container, false);
       initViews(root);
        return root;
    }

    private void initViews(View root)
    {

        LinearLayout rvPrivacyPolicy=root.findViewById(R.id.rvPrivacyPolicy);
        rvPrivacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLink("https://rp-development.blogspot.com/2021/02/privacy-policy.html");
            }
        });


        RelativeLayout rvAbout=root.findViewById(R.id.rvAbout);
        rvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.RateApp(getActivity());
            }
        });


        RelativeLayout rvShareApp=root.findViewById(R.id.rvShareApp);
        rvShareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.ShareApp(getActivity());
            }
        });


        RelativeLayout rvRateApp=root.findViewById(R.id.rvRateApp);
        rvRateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Utils.RateApp(getActivity());
            }
        });

    }

    private void openLink(String link)
    {

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(link));
        startActivity(i);

    }
}