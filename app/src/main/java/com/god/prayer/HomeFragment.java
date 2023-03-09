package com.god.prayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;



@SuppressWarnings("deprecation")
public class HomeFragment extends Fragment {

    ViewPager viewPager;
    TabLayout tabLayout;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = v.findViewById(R.id.viewpager);
        tabLayout = v.findViewById(R.id.tablayout);


        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {

        FragmentAdapter adapter = new FragmentAdapter(getChildFragmentManager());

        adapter.addFragment(new AllFragment(), "Home");
        adapter.addFragment(new CustomFragment(), "Custom");

//        adapter.addFragment(new AllFragment(), "सभी");
//        adapter.addFragment(new DeviFragment(), "देवी");
//        adapter.addFragment(new DevFragment(), "देव");
//        adapter.addFragment(new KashtdevFragment(), "कष्टदेव");
//        adapter.addFragment(new DivasFragment(), "दिवस");
//        adapter.addFragment(new HanumanFragment(), "हनुमान");
//        adapter.addFragment(new GaneshFragment(), "गणेश");
//        adapter.addFragment(new SaraswatiFragment(), "सरस्वती");
//        adapter.addFragment(new LaxmiFragment(), "लक्ष्मी");
//        adapter.addFragment(new SaturdayFragment(), "शनिदेव");
//        adapter.addFragment(new ShivFragment(), "शिव");
//        adapter.addFragment(new DurgaFragment(), "दुर्गा");
//        adapter.addFragment(new ParvatiFragment(), "पार्वती");
//        adapter.addFragment(new VishnuFragment(), "विष्णु");
//        adapter.addFragment(new RamFragment(), "राम");
//        adapter.addFragment(new KaliFragment(), "काली");
//        adapter.addFragment(new GayatriFragment(), "गायत्री");
//        adapter.addFragment(new KrishnaFragment(), "कृष्ण");
//        adapter.addFragment(new RahudevFragment(), "राहूदेव");
//        adapter.addFragment(new KetudevFragment(), "केतुदेव");


        viewPager.setAdapter(adapter);


    }
}