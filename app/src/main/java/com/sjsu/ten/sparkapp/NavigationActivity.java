package com.sjsu.ten.sparkapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by Ben on 9/24/2016.
 */
public class NavigationActivity extends FragmentActivity {
    // When requested, this adapter returns a DemoObjectFragment,
    // representing an object in the collection.
    PagerAdapter mDemoCollectionPagerAdapter;
    ViewPager mViewPager;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_navigator);

        // ViewPager and its adapters use support library
        // fragments, so use getSupportFragmentManager.
        mDemoCollectionPagerAdapter =
                new PagerAdapter (getSupportFragmentManager(), 2);
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mDemoCollectionPagerAdapter);
    }
}
