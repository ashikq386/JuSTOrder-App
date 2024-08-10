package com.example.jstorder_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Delivery_ui  extends AppCompatActivity {
Button  combo,cuisine;
CardView r1_details_cardview,r2_details_cardview,r3_details_cardview;
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.delivery_ui);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_navigation) ;
        bottomNavigationView.setItemIconTintList(null);
        viewPager.setAdapter(adapterView);

        combo=(Button)findViewById(R.id.btn_combo);
        cuisine=(Button)findViewById(R.id.btn_cuisine);
        r1_details_cardview=(CardView)findViewById(R.id.r1_details_cardview);
        r2_details_cardview=(CardView)findViewById(R.id.r2_details_cardview);
        r3_details_cardview=(CardView)findViewById(R.id.r3_details_cardview);
        combo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Delivery_ui.this, Combo_Activity.class);
                startActivity(intent);
            }
        });
        cuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Delivery_ui.this, NandanaPalace_Activity.class);
                startActivity(intent);
            }
        });
        r1_details_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Delivery_ui.this, Hyderabad_biryani_Activity.class);
                startActivity(intent);
            }
        });
        r2_details_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Delivery_ui.this, Treat_Activity.class);
                startActivity(intent);
            }
        });
        r3_details_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Delivery_ui.this, Order_History_Activity.class);
                startActivity(intent);
            }
        });



    }
}
