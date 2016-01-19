package com.waldorf.podplayer.sections;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.waldorf.podplayer.R;

public class PopularSection {

    public static class PopularFragment extends Fragment {

        public PopularFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_latest, container, false);
            return rootView;
        }

    }

}
