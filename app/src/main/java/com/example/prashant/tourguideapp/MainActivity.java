package com.example.prashant.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  private ViewPager mPager;
  private PagerAdapter mPagerAdapter;
  TabLayout tabLayout;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mPager = (ViewPager) findViewById(R.id.pager);
    mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
    mPager.setAdapter(mPagerAdapter);
    tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
    tabLayout.postDelayed(new Runnable() {
      @Override
      public void run() {
        tabLayout.setupWithViewPager(mPager);
      }
    },250);
  }

  @Override public void onBackPressed() {
    if (mPager.getCurrentItem() == 0) {
      super.onBackPressed();
    } else {
      mPager.setCurrentItem(mPager.getCurrentItem() - 1);
    }
  }
}
