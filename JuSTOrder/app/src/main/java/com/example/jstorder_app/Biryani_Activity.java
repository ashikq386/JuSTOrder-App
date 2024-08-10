package com.example.jstorder_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Biryani_Activity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    CardView chicken_biryani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.biryani_layout);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_navigation) ;
        bottomNavigationView.setItemIconTintList(null);

        chicken_biryani=(CardView)findViewById(R.id.card_chicken_biryani);
        chicken_biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Biryani_Activity.this,Cart_Activity.class);
                startActivity(intent);
            }
        });
    }
}
