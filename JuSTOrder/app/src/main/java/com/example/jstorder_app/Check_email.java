package com.example.jstorder_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Check_email extends AppCompatActivity {
   Button openemailapp;
   ImageButton ibtnemailback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.check_email_layout);
        openemailapp=(Button)findViewById(R.id.btn_open_email_app);
        ibtnemailback=(ImageButton) findViewById(R.id.ibtn_email_back);
        ibtnemailback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Check_email.this,Sign_up.class);
                startActivity(intent);
            }
        });
        openemailapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Check_email.this, Login_with_otp.class);
                startActivity(intent);
            }
        });
    }
}
