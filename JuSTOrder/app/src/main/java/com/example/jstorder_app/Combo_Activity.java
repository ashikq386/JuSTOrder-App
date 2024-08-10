package com.example.jstorder_app;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Combo_Activity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.combo_layout);
        bottomNavigationView1=(BottomNavigationView)findViewById(R.id.bottom_navigation1) ;
        bottomNavigationView1.setItemIconTintList(null);
    }
}
