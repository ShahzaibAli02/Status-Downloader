package com.cd.statussaver.captionStatusShare;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.cd.statussaver.R;
import com.cd.statussaver.util.AppLangSessionManager;
import com.google.android.gms.ads.AdView;
import com.google.android.material.tabs.TabLayout;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Captionitem extends AppCompatActivity {
    GridView simpleGrid;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.RLTab)
    RelativeLayout RLTab;

    @BindView(R.id.adView)
    AdView adView;


    AppLangSessionManager appLangSessionManager;


    @BindView(R.id.english)
    RadioButton rbEnglish;


    @BindView(R.id.arabic)
    RadioButton rbarabict;
    /*@BindView(R.id.rb_best)
    RadioButton rbBest;
    @BindView(R.id.rb_clever)
    RadioButton rbClever;
    @BindView(R.id.rb_cool)
    RadioButton rbCool;
    @BindView(R.id.rb_cute)
    RadioButton rbCute;
    @BindView(R.id.rb_fitness)
    RadioButton rbFitness;
    @BindView(R.id.rb_funny)
    RadioButton rbFunny;
    @BindView(R.id.rb_life)
    RadioButton rbLife;
    @BindView(R.id.rb_love)
    RadioButton rbLove;
    @BindView(R.id.rb_motivation)
    RadioButton rbMotivation;
    @BindView(R.id.rb_sad)
    RadioButton rbSad;
    @BindView(R.id.rb_savage)
    RadioButton rbSavage;
    @BindView(R.id.rb_selfie)
    RadioButton rbSelfie;
    @BindView(R.id.rb_song)
    RadioButton rbSong;

     */

    @BindView(R.id.radio_group)
    RadioGroup radioGroup;
    @BindView(R.id.simpleListView)


    ListView simpleListView;


    String[] items;

    //It's called While click on gridview
    private class simpleGridListner implements OnItemClickListener {
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Intent intent = new Intent(Captionitem.this, Captionstatus.class);
            //   intent.putExtra("image", Captionitem.this.logos[position]);
            intent.putExtra("P", position);
            Captionitem.this.startActivity(intent);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captionitem);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      /*  if (!Internetconnection.checkConnection(this)) {
            Banner banner = findViewById(R.id.startAppBanner);
            banner.hideBanner();
        }
        this.simpleGrid = findViewById(R.id.simpleGridView);
        this.simpleGrid.setAdapter(new CustomAdapter(getApplicationContext(), this.logos));
        this.simpleGrid.setOnItemClickListener(new simpleGridListner());
*/

        rbEnglish.setChecked(true);
        items = getResources().getStringArray(R.array.s_english_text_stories);
        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {

                    case R.id.english:
                        items = getResources().getStringArray(R.array.s_english_text_stories);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.arabic:
                        items = getResources().getStringArray(R.array.s_حالات_عربي_نصية);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    /*case R.id.rb_best:
                        items = getResources().getStringArray(R.array.s_best);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_clever:
                        items = getResources().getStringArray(R.array.s_clever);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_cool:
                        items = getResources().getStringArray(R.array.s_cool);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_cute:
                        items = getResources().getStringArray(R.array.s_cute);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_fitness:
                        items = getResources().getStringArray(R.array.s_fitness);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_funny:
                        items = getResources().getStringArray(R.array.s_funny);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_life:
                        items = getResources().getStringArray(R.array.s_life);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_love:
                        items = getResources().getStringArray(R.array.s_love);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_motivation:
                        items = getResources().getStringArray(R.array.s_motivation);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_sad:
                        items = getResources().getStringArray(R.array.s_sad);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_savage:
                        items = getResources().getStringArray(R.array.s_savage);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_selfie:
                        items = getResources().getStringArray(R.array.s_selfie);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;
                    case R.id.rb_song:
                        items = getResources().getStringArray(R.array.s_song);
                        simpleListView.setAdapter(new CustomAdapter1(Captionitem.this, items));
                        break;

                     */

                }
            }
        });

        appLangSessionManager = new AppLangSessionManager(this);

        setLocale(appLangSessionManager.getLanguage());
        // AdsUtils.showGoogleBannerAd(Captionitem.this, adView);


    }


    //Option menu button click
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }


    //Back press method
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


  /*  public void initViews() {
        setupViewPager(viewpager);
        tabs.setupWithViewPager(viewpager);


        for (int i = 0; i < tabs.getTabCount(); i++) {
            TextView tv = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
            tabs.getTabAt(i).setCustomView(tv);
        }

        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        createFileFolder();
    }

    private void setupViewPager(ViewPager viewPager) {
        String[] logos = new String[]{"Best", "Clever", "Cool", "Cute", "Fitness", "Funny", "Life", "Love", "Motivation", "Sad", "Savage", "Selfie", "Song"};

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(CaptionStatusFragment.newInstance(0), "Best");
        adapter.addFragment(CaptionStatusFragment.newInstance(1), "Clever");
        adapter.addFragment(CaptionStatusFragment.newInstance(2), "Cool");
        adapter.addFragment(CaptionStatusFragment.newInstance(3), "Cute");
        adapter.addFragment(CaptionStatusFragment.newInstance(4), "Fitness");
        adapter.addFragment(CaptionStatusFragment.newInstance(5), "Funny");
        adapter.addFragment(CaptionStatusFragment.newInstance(6), "Life");
        adapter.addFragment(CaptionStatusFragment.newInstance(7), "Love");
//        adapter.addFragment(CaptionStatusFragment.newInstance(8), "Motivation");
//        adapter.addFragment(CaptionStatusFragment.newInstance(9), "Sad");
//        adapter.addFragment(CaptionStatusFragment.newInstance(10), "Savage");
//        adapter.addFragment(CaptionStatusFragment.newInstance(11), "Selfie");
//        adapter.addFragment(CaptionStatusFragment.newInstance(12), "Song");

        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(12);

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }*/


    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
    }


}
