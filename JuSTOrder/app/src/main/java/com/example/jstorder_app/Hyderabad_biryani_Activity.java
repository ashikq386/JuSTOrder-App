package com.example.jstorder_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Hyderabad_biryani_Activity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    CardView biryani_cardView,chicken_curry_cardView,chicken_dry_cardview;
    Button btn_livetracking;
    ImageButton imgbtn_veg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.hyderabad_biryani_layout);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_navigation1) ;
        bottomNavigationView.setItemIconTintList(null);

        biryani_cardView=(CardView)findViewById(R.id.biryani_cardView);
        chicken_curry_cardView=(CardView)findViewById(R.id.chicken_curry_cardView);
        chicken_dry_cardview=(CardView)findViewById(R.id.chicken_dry_cardView);
        imgbtn_veg=(ImageButton)findViewById(R.id.imgbtn_veg);

        imgbtn_veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hyderabad_biryani_Activity.this, Biryani_Activity.class);
                startActivity(intent);
            }
        });
        btn_livetracking=(AppCompatButton)findViewById(R.id.btn_live_tracking1);

        btn_livetracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hyderabad_biryani_Activity.this, MapsActivity1.class);
                startActivity(intent);
            }
        });

        biryani_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hyderabad_biryani_Activity.this, Biryani_Activity.class);
                startActivity(intent);
            }
        });
        chicken_curry_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hyderabad_biryani_Activity.this, Wallet_Activity.class);
                startActivity(intent);
            }
        });
        chicken_dry_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hyderabad_biryani_Activity.this, MapsActivity1.class);
                startActivity(intent);
            }
        });
    }
}
