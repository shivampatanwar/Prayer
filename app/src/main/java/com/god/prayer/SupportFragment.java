package com.god.prayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class SupportFragment extends Fragment {

    public SupportFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_support, container, false);

        AdView adView = v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                adView.loadAd(adRequest);
            }

            @Override
            public void onAdClosed() {
                adView.loadAd(adRequest);
            }
        });

        TextView textView = v.findViewById(R.id.emails);
        TextView textView1 = v.findViewById(R.id.privacy);
        TextView textView2 = v.findViewById(R.id.pd);
        TextView textView4 = v.findViewById(R.id.fb);
        TextView textView5 = v.findViewById(R.id.insta);
        TextView textView6 = v.findViewById(R.id.twitter);
        TextView textView7 = v.findViewById(R.id.yt);

        textView.setOnClickListener(v1 -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto", "shivampatanwardeveloper@gmail.com", null));
            startActivity(Intent.createChooser(emailIntent, null));
        });
        textView1.setOnClickListener(v12 -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shivampatanwar.blogspot.com/p/privacy-policy-shivam-patanwar.html"));
            startActivity(intent);
        });
        textView2.setOnClickListener(v17 -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://professionaldeveloper.in"));
            startActivity(intent);
        });

        textView4.setOnClickListener(v14 -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/shivampatanwardeveloper/"));
            startActivity(intent);
        });
        textView5.setOnClickListener(v18 -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/shivampatanwardeveloper"));
            startActivity(intent);
        });
        textView6.setOnClickListener(v15 -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/shivampatanwar"));
            startActivity(intent);
        });
        textView7.setOnClickListener(v16 -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCDxB13_i4BBQnOTekzLDudw"));
            startActivity(intent);
        });

        return v;
    }




}