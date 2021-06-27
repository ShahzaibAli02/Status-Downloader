package com.cd.statussaver.activity.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.cd.statussaver.R;
import com.cd.statussaver.activity.FacebookActivity;
import com.cd.statussaver.activity.InstagramActivity;
import com.cd.statussaver.activity.TikTokActivity;
import com.cd.statussaver.activity.TwitterActivity;
import com.cd.statussaver.activity.WhatsappActivity;
import com.cd.statussaver.asciiFaces.AsciiFacesMainActivity;
import com.cd.statussaver.captionStatusShare.Captionitem;
import com.cd.statussaver.directChat.ChatDirect;
import com.cd.statussaver.fackChat.MainFackChat;
import com.cd.statussaver.util.AdsUtils;
import com.cd.statussaver.util.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeFragment extends Fragment {


    @BindView(R.id.btn_img_share)
    ImageView btnImgShare;
    @BindView(R.id.btn_img_rate)
    ImageView btnImgRate;
    @BindView(R.id.textview_more_tools)
    TextView textviewMoreTools;
    @BindView(R.id.btn_lyt_whatsapp)
    LinearLayout btnLytWhatsapp;
    @BindView(R.id.card_whatsapp)
    CardView cardWhatsapp;

    @BindView(R.id.btn_lyt_facebook)
    LinearLayout btnLytFacebook;
    @BindView(R.id.card_facebook)
    CardView cardFacebook;

    @BindView(R.id.btn_lyt_insta)
    LinearLayout btnLytInsta;
    @BindView(R.id.card_insta)
    CardView cardInsta;

    @BindView(R.id.btn_lyt_twitter)
    LinearLayout btnLytTwitter;
    @BindView(R.id.card_twitter)
    CardView cardTwitter;

    @BindView(R.id.btn_lyt_tiktok)
    LinearLayout btnLytTiktok;
    @BindView(R.id.card_tiktok)
    CardView cardTiktok;

    @BindView(R.id.btn_img_unsaved_number)
    ImageView btnImgUnsavedNumber;
    @BindView(R.id.lyt_message_to_unsaved_number)
    ConstraintLayout lytMessageToUnsavedNumber;
    @BindView(R.id.card_message_to_unsaved_number)
    CardView cardMessageToUnsavedNumber;

    @BindView(R.id.lyt_create_fake_whatsapp_chats)
    ConstraintLayout lytCreateFakeWhatsappChats;
    @BindView(R.id.card_create_fake_whatsapp_chats)
    CardView cardCreateFakeWhatsappChats;

    @BindView(R.id.lyt_whatsapp_text_status_story)
    ConstraintLayout lytWhatsappTextStatusStory;
    @BindView(R.id.card_whatsapp_text_status_story)
    CardView cardWhatsappTextStatusStory;

    @BindView(R.id.lyt_ready_text_emotions)
    ConstraintLayout lytReadyTextEmotions;
    @BindView(R.id.card_ready_text_emotions)
    CardView cardReadyTextEmotions;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, root);

        return root;
    }

    @OnClick({R.id.btn_img_share, R.id.btn_img_rate, R.id.btn_lyt_whatsapp, R.id.btn_lyt_facebook, R.id.btn_lyt_insta, R.id.btn_lyt_twitter, R.id.btn_lyt_tiktok, R.id.lyt_message_to_unsaved_number, R.id.lyt_create_fake_whatsapp_chats, R.id.lyt_whatsapp_text_status_story, R.id.lyt_ready_text_emotions})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_img_share:
                Utils.ShareApp(getActivity());
                break;
            case R.id.btn_img_rate:
                Utils.RateApp(getActivity());
                break;
            case R.id.btn_lyt_whatsapp:
                Intent i = new Intent(getActivity(), WhatsappActivity.class);
              //  startActivity(i);
                AdsUtils.showAd(getActivity(),i);
                break;
            case R.id.btn_lyt_facebook:
                i = new Intent(getActivity(), FacebookActivity.class);
                //  i.putExtra("CopyIntent", CopyValue);
                //startActivity(i);
                AdsUtils.showAd(getActivity(),i);
                break;
            case R.id.btn_lyt_insta:
                i = new Intent(getActivity(), InstagramActivity.class);
                //  i.putExtra("CopyIntent", CopyValue);
               // startActivity(i);
                AdsUtils.showAd(getActivity(),i);
                break;
            case R.id.btn_lyt_twitter:
                i = new Intent(getActivity(), TwitterActivity.class);
                // i.putExtra("CopyIntent", CopyValue);
               // startActivity(i);
                AdsUtils.showAd(getActivity(),i);
                break;
            case R.id.btn_lyt_tiktok:
                i = new Intent(getActivity(), TikTokActivity.class);
                //  i.putExtra("CopyIntent", CopyValue);
                //startActivity(i);
                AdsUtils.showAd(getActivity(),i);
                break;
            case R.id.lyt_message_to_unsaved_number:
               // getActivity().startActivity(new Intent(getActivity(), ChatDirect.class));
                AdsUtils.showAd(getActivity(),new Intent(getActivity(), ChatDirect.class));
                break;
            case R.id.lyt_create_fake_whatsapp_chats:
                //getActivity().startActivity(new Intent(getActivity(), MainFackChat.class));
                AdsUtils.showAd(getActivity(),new Intent(getActivity(), MainFackChat.class));
                break;
            case R.id.lyt_whatsapp_text_status_story:
               // getActivity().startActivity(new Intent(getActivity(), Captionitem.class));
                AdsUtils.showAd(getActivity(),new Intent(getActivity(), Captionitem.class));
                break;
            case R.id.lyt_ready_text_emotions:
                //getActivity().startActivity(new Intent(getActivity(), AsciiFacesMainActivity.class));
                AdsUtils.showAd(getActivity(),new Intent(getActivity(), AsciiFacesMainActivity.class));
                break;
        }
    }

   /* @OnClick({R.id.btn_img_share, R.id.btn_img_rate, R.id.card_whatsapp, R.id.btn_img_facebook, R.id.btn_img_insta, R.id.btn_img_twitter, R.id.btn_img_tiktok, R.id.btn_img_unsaved_number, R.id.lyt_message_to_unsaved_number, R.id.lyt_create_fake_whatsapp_chats, R.id.lyt_whatsapp_text_status_story, R.id.lyt_ready_text_emotions})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_img_share:
                Utils.ShareApp(getActivity());
                break;
            case R.id.btn_img_rate:
                Utils.RateApp(getActivity());
                break;
            case R.id.card_whatsapp:
                Intent i = new Intent(getActivity(), WhatsappActivity.class);
                startActivity(i);
                break;
            case R.id.btn_img_facebook:
                i = new Intent(getActivity(), FacebookActivity.class);
                //  i.putExtra("CopyIntent", CopyValue);
                startActivity(i);
                break;
            case R.id.btn_img_insta:
                i = new Intent(getActivity(), InstagramActivity.class);
                //  i.putExtra("CopyIntent", CopyValue);
                startActivity(i);
                break;
            case R.id.btn_img_twitter:
                i = new Intent(getActivity(), TwitterActivity.class);
                // i.putExtra("CopyIntent", CopyValue);
                startActivity(i);
                break;
            case R.id.btn_img_tiktok:
                i = new Intent(getActivity(), TikTokActivity.class);
                //  i.putExtra("CopyIntent", CopyValue);
                startActivity(i);
                break;
            case R.id.lyt_message_to_unsaved_number:
                getActivity().startActivity(new Intent(getActivity(), ChatDirect.class));

                break;
            case R.id.lyt_create_fake_whatsapp_chats:
                getActivity().startActivity(new Intent(getActivity(), MainFackChat.class));

                break;
            case R.id.lyt_whatsapp_text_status_story:
                getActivity().startActivity(new Intent(getActivity(), Captionitem.class));

                break;
            case R.id.lyt_ready_text_emotions:
                getActivity().startActivity(new Intent(getActivity(), AsciiFacesMainActivity.class));

                break;
        }
    }*/
}