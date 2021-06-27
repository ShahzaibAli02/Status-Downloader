package com.cd.statussaver;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;



public class DialogHandler
{








    public static  void showRatingDialog(Context context)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View child = getactivity(context).getLayoutInflater().inflate(R.layout.rateus, null);
        builder.setView(child);
        builder.setCancelable(true);
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
         initRateViews(context,child,alertDialog);
        alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

    }




    private static void initRateViews(final Context context, View child, final AlertDialog alertDialog)
    {

        final RatingBar ratingBar=child.findViewById(R.id.RatingBar);

        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(context.getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);
        Button btnSubmit=child.findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                openPlayStore(context);
                alertDialog.dismiss();

            }
        });


    }



    public static void  openPlayStore(Context context)
    {

        try {
            Uri marketUri = Uri.parse("market://details?id=" +context.getPackageName());
            Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
            context.startActivity(marketIntent);
        }catch(ActivityNotFoundException e) {
            Uri marketUri = Uri.parse("https://play.google.com/store/apps/details?id="+context.getPackageName());
            Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
            context.startActivity(marketIntent);
        }
    }

    // CAST CONTEXT TO ACTIVITY
    private static Activity getactivity(Context context)
    {
        return (Activity) context;
    }

}
