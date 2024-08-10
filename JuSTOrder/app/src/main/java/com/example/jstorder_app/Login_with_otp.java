package com.example.jstorder_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Login_with_otp extends AppCompatActivity {
    Button login,resend_verification_email;
    ImageButton ibtnloginotpback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.login_with_otp);
        login=(Button)findViewById(R.id.btn_login);
        resend_verification_email=(Button)findViewById(R.id.btn_resend_verification_email);
        ibtnloginotpback=(ImageButton)findViewById(R.id.ibtn_loginotp_back);

        ibtnloginotpback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_with_otp.this, Check_email.class);
                startActivity(intent);
            }
        });
        resend_verification_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_with_otp.this, Check_email.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_with_otp.this, Delivery_ui.class);
                startActivity(intent);
            }
        });

    }
}
