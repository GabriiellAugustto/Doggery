package com.example.doggery;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Menu1Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1_layout);

        bottomNavigationView= findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.mhome);

    }
    HomeFragment homeFragment= new HomeFragment();
    NotificacoesFragment notificacoesFragment=new NotificacoesFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mhome) {
            getSupportFragmentManager().
                    beginTransaction().replace(R.id.flFragment, homeFragment).commit();}
        else if (item.getItemId()==R.id.mnotificacoes) {
            getSupportFragmentManager().
                    beginTransaction().replace(R.id.flFragment,notificacoesFragment).commit();}
        else if (item.getItemId()==R.id.mperson) {
            getSupportFragmentManager().
                    beginTransaction().replace(R.id.flFragment,profileFragment).commit();

        }

        return false;
    }

    }

