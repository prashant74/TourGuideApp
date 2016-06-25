package com.example.prashant.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.prashant.tourguideapp.fragments.CafeFragment;
import com.example.prashant.tourguideapp.fragments.LocalAttractionsFragment;
import com.example.prashant.tourguideapp.fragments.NearbyAttractionsFragment;
import com.example.prashant.tourguideapp.fragments.TechParkFragments;

/**
 * Created by prashant on 6/25/16.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
  private static final int NUM_PAGES = 4;
  Fragment[] viewPagerFragments;

  public ScreenSlidePagerAdapter(FragmentManager fm) {
    super(fm);
    viewPagerFragments = new Fragment[] {
        new LocalAttractionsFragment(), new CafeFragment(), new TechParkFragments(),
        new NearbyAttractionsFragment()
    };
  }

  @Override public Fragment getItem(int position) {
    return viewPagerFragments[position];
  }

  @Override public int getCount() {
    return NUM_PAGES;
  }

  @Override public CharSequence getPageTitle(int position) {
    return tabTitles[position];
  }

  private String tabTitles[] = new String[] {
      "Local Attractions", "Cafe", "Tech Parks", "Nearby"
  };
}

