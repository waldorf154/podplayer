package com.waldorf.podplayer.sections;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.waldorf.podplayer.MainActivity;
import com.waldorf.podplayer.R;

public class SearchSection {

    public static class SearchFragment extends Fragment {

        @Override
        public void onCreate(Bundle savedInstanceBundle) {
            setHasOptionsMenu(true);
            super.onCreate(savedInstanceBundle);
        }

        @Override
        public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.search, menu);
            MenuItem item = menu.findItem(R.id.action_search);
            SearchView sv = new SearchView(((MainActivity) getActivity()).getSupportActionBar().getThemedContext());
            MenuItemCompat.setActionView(item, sv);
            sv.setIconified(false);
            sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                @Override
                public boolean onQueryTextSubmit(String query) {
                    System.out.println("search query submit");
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    System.out.println("tap");
                    return false;
                }

            });
            super.onCreateOptionsMenu(menu, menuInflater);
        }

    }

    public static class OverviewFragment extends Fragment {

    }

    public static class EpisodesFragment extends Fragment {

    }

}
