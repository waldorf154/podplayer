package com.waldorf.podplayer.sections;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.waldorf.podplayer.R;

public class SubscribedSection {

    public static class SubscribedFragment extends Fragment {

        public SubscribedFragment() {
        }

        @Override
        public void onCreate(Bundle savedInstanceBundle) {
            setHasOptionsMenu(true);
            super.onCreate(savedInstanceBundle);
        }

        @Override
        public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.global, menu);
            super.onCreateOptionsMenu(menu, menuInflater);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_latest, container, false);
            return rootView;
        }

    }

}
