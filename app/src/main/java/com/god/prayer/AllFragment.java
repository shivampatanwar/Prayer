package com.god.prayer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.text.DateFormat;
import java.time.Month;
import java.util.Calendar;

public class AllFragment extends Fragment {

    public AllFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_all, container, false);

        MobileAds.initialize(getActivity(), initializationStatus -> {
        });
        AdView adView = v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                adView.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdClosed() {
                adView.loadAd(new AdRequest.Builder().build());
            }
        });


        AdView adView1 = v.findViewById(R.id.adView1);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        adView1.loadAd(adRequest);

        adView1.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                adView1.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdClosed() {
                adView1.loadAd(new AdRequest.Builder().build());
            }
        });


        Calendar calendar = Calendar.getInstance();
        String currentdate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView textViewDate = v.findViewById(R.id.textviewdate);
        textViewDate.setText(currentdate);




        return v;

    }





}