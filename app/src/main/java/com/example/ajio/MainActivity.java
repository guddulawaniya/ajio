package com.example.ajio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.ajio.Fragments.account_Fragment;
import com.example.ajio.Fragments.bag_Fragment;
import com.example.ajio.Fragments.brand_Fragment;
import com.example.ajio.Fragments.home_fragment;
import com.example.ajio.Fragments.wishlist_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setOnNavigationItemSelectedListener(this);


    }


    com.example.ajio.Fragments.home_fragment home_fragment = new home_fragment();
    brand_Fragment brand_fragment = new brand_Fragment();
    account_Fragment account_fragment = new account_Fragment();
    wishlist_Fragment wishlist_fragment = new wishlist_Fragment();
    bag_Fragment bag_fragment = new bag_Fragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home_fragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, home_fragment).commit();
                return true;
            case R.id.brand_Fragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, brand_fragment).commit();
                return true;
            case R.id.account_Fragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, account_fragment).commit();
                return true;
            case R.id.wishlist_Fragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, wishlist_fragment).commit();
                return true;
            case R.id.bag_Fragment:
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, bag_fragment).commit();
                return true;
        }
        return false;
    }
}