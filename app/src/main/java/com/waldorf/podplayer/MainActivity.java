package com.waldorf.podplayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.waldorf.podplayer.dummy.DummyContent;
import com.waldorf.podplayer.sections.LatestSection;
import com.waldorf.podplayer.sections.PopularSection;
import com.waldorf.podplayer.sections.SearchSection;
import com.waldorf.podplayer.sections.SubscribedSection;

public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks, ItemFragment.OnListFragmentInteractionListener {

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private Fragment mSelectedFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

//        LinearLayoutManager mLinearLayoutmanager = new LinearLayoutManager(this);
//        RecyclerView mDrawerList = (RecyclerView) findViewById(R.id.item_list);
//        mDrawerList.setLayoutManager(mLinearLayoutmanager);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        mSelectedFragment = getFragment(position);
        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().add(mSelectedFragment, null).commit();
        fragmentManager.beginTransaction()
                .replace(R.id.container, mSelectedFragment)
                .commit();
    }

    private Fragment getFragment(int position) {
        switch (position) {
            case 0:
                return new SearchSection.SearchFragment();
            case 1:
                return new SubscribedSection.SubscribedFragment();
            case 2:
                return new LatestSection.LatestFragment();
//            case 3:
//                return new PopularSection.PopularFragment();
            case 3:
                return new ItemFragment();
            default:
                throw new IllegalArgumentException("Invalid Section position: " + position);
        }
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
