package com.example.wovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class LoginActivity extends AppCompatActivity {

    Button bt_login;
    EditText et_cc, et_ee, et_password;
    AppCompatTextView tv_register, tv_forgot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        this.setTitle("");
        getSupportActionBar().hide();

        bt_login=findViewById(R.id.bt_login);
        et_cc = findViewById(R.id.et_cc);
        et_ee= findViewById(R.id.et_ee);
        et_password= findViewById(R.id.et_password);
        tv_register=findViewById(R.id.tv_register);
        tv_forgot=findViewById(R.id.tv_forgot);

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        tv_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, ForgotActivity.class);
                startActivity(intent);
            }
        });


        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_cc.getText().toString().trim().equalsIgnoreCase("")) {
                    et_cc.setError("This field cannot be blank");
                }
                if (et_ee.getText().toString().trim().equalsIgnoreCase("")) {
                    et_ee.setError("This field cannot be blank");
                }

                if (et_password.getText().toString().trim().equalsIgnoreCase("")) {
                    et_password.setError("This field cannot be blank");
                }
                else
                {
                    Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                    startActivity(intent);
                    finish();
                }

            }

        });
    }
}

