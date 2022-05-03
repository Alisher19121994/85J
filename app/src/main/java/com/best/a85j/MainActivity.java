package com.best.a85j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.ActionBar;
import android.os.Bundle;

import com.best.a85j.AdapterViewPager.AdapterViewPager;
import com.best.a85j.Fragments.FragmentUsers;
import com.best.a85j.Fragments.FragmentContact;
import com.best.a85j.Fragments.FragmentPosts;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    AdapterViewPager adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        tabLayout = findViewById(R.id.table_layoutId);
        viewPager = findViewById(R.id.viewpager_ID);
        adapterViewPager = new AdapterViewPager(getSupportFragmentManager());

        adapterViewPager.AddFragment(new FragmentContact(), "Contacts");
        adapterViewPager.AddFragment(new FragmentUsers(), "Users");
        adapterViewPager.AddFragment(new FragmentPosts(), "Posts");

        viewPager.setAdapter(adapterViewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.call_baseline_call_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_group_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_notes_24);

    }
    public void hideActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.hide();
    }
}