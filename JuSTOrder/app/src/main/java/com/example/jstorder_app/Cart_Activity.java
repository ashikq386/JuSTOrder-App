package com.example.jstorder_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Cart_Activity extends AppCompatActivity {
    CardView cola_cardView,coca_cardview,cola_cardView1;
    Button  confirm_your_order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.cart_layout);

        cola_cardView=(CardView)findViewById(R.id.cardview_cola);
        coca_cardview=(CardView)findViewById(R.id.card_view_coca);
        cola_cardView1=(CardView)findViewById(R.id.cardview_cola1);
        confirm_your_order=(Button)findViewById(R.id.btn_confirm_your_order);

        cola_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart_Activity.this,Refer_earn_Activity.class);
                startActivity(intent);
            }
        });
        coca_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart_Activity.this,Spin_Activity.class);
                startActivity(intent);
            }
        });
        cola_cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart_Activity.this, Contact_Us_Activity.class);
                startActivity(intent);
            }
        });
        confirm_your_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart_Activity.this, Payment_Gateway.class);
                startActivity(intent);
            }
        });
    }
}
