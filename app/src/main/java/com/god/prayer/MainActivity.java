package com.god.prayer;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.annotation.SuppressLint;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView = findViewById(R.id.navigationView);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));

        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();
            item.setChecked(true);
            drawerLayout.closeDrawer(GravityCompat.START);

            switch(id)
            {
                case R.id.home :
                    replaceFragment(new HomeFragment());
                    break;

                case R.id.calendar :
                    replaceFragment(new CalendarFragment());
                    break;

                case R.id.festival :
                    replaceFragment(new FestivalFragment());
                    break;

                case R.id.temple :
                    replaceFragment(new TempleFragment());
                    break;

                case R.id.audio:
                    replaceFragment(new AudioFragment());
                    break;

                case R.id.setting:
                    replaceFragment(new AudioFragment());
                    break;

                case R.id.support:
                    replaceFragment(new SupportFragment());
                    break;

                case R.id.email:
                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                            "mailto", "shivampatanwardeveloper@gmail.com", null));
                    startActivity(Intent.createChooser(emailIntent, null));
                    break;

                case R.id.privacyy:

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shivampatanwar.blogspot.com/p/privacy-policy-shivam-patanwar.html"));
                    startActivity(intent);
                    break;


                default :
                    return true;
            }
            return true;

        });


        bottomNavigationView = findViewById(R.id.bottomNavigation);

        replaceFragment(new HomeFragment());
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id) {
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;

                case R.id.festival:
                    replaceFragment(new FestivalFragment());
                    break;

                case R.id.calendar:
                    replaceFragment(new CalendarFragment());
                    break;

                case R.id.temple:
                    replaceFragment(new TempleFragment());
                    break;

                case R.id.support:
                    replaceFragment(new SupportFragment());
                    break;

                default:
                    return true;
            }
            return true;

        });
    }


    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();


    }


    @Override
    public void onBackPressed() {
        replaceFragment(new HomeFragment());
    }


    @Override
    protected void onResume() {super.onResume();}


    public void gan(View view) {replaceFragment(new GaneshFragment());}
    public void han(View view) {replaceFragment(new HanumanFragment());}
    public void vis(View view) {replaceFragment(new VishnuFragment());}

    public void sar(View view) {replaceFragment(new SaraswatiFragment());}
    public void lax(View view) {replaceFragment(new LaxmiFragment());}
    public void dur(View view) {replaceFragment(new DurgaFragment());}

    public void sha(View view) {replaceFragment(new ShanidevFragment());}
    public void rah(View view) {replaceFragment(new RahudevFragment());}
    public void ket(View view) {replaceFragment(new KetudevFragment());}


    public void par(View view) {replaceFragment(new ParvatiFragment());}
    public void kal(View view) {replaceFragment(new KaliFragment());}
    public void gay(View view) {replaceFragment(new GayatriFragment());}

    public void kri(View view) {replaceFragment(new KrishnaFragment());}
    public void ram(View view) {replaceFragment(new RamFragment());}
    public void shiv(View view) {replaceFragment(new ShivFragment());}

    public void sup(View view) {replaceFragment(new SupportFragment());}



}