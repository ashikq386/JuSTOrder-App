package com.example.jstorder_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Login_with_phone_otp extends AppCompatActivity {
    ImageButton ibtngetcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.login_with_phone_otp);
        ibtngetcall=(ImageButton) findViewById(R.id.ibtn_getcall);
        ibtngetcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_with_phone_otp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
