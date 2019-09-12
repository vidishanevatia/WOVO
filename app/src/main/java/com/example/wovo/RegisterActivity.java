package com.example.wovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class RegisterActivity extends AppCompatActivity {

    Button bt_register;
    AppCompatTextView tv_login,tv_tos,tv_pp;
    EditText et_cc,et_ee,et_pn,et_password,et_confirm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        this.setTitle("");
        getSupportActionBar().hide();

        bt_register=findViewById(R.id.bt_register);
        tv_login=findViewById(R.id.tv_login);
        tv_tos=findViewById(R.id.tv_tos);
        tv_pp=findViewById(R.id.tv_pp);
        et_cc=findViewById(R.id.et_cc);
        et_ee=findViewById(R.id.et_ee);
        et_pn=findViewById(R.id.et_pn);
        et_password=findViewById(R.id.et_password);
        et_confirm=findViewById(R.id.et_confirm);


        tv_tos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(RegisterActivity.this, "Coming Soon", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, -1000);
                toast.show();
            }
        });

        tv_pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(RegisterActivity.this, "Coming Soon", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, -1000);
                toast.show();
            }
        });

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

       bt_register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (et_cc.getText().toString().trim().equalsIgnoreCase("")) {
                   et_cc.setError("This field cannot be blank");
               }
                if (et_ee.getText().toString().trim().equalsIgnoreCase("")) {
                   et_ee.setError("This field cannot be blank");
               }
               if (et_pn.getText().toString().trim().equalsIgnoreCase("")) {
                   et_pn.setError("This field cannot be blank");
               }
               if (et_password.getText().toString().trim().equalsIgnoreCase("")) {
                   et_password.setError("This field cannot be blank");
               }
               if (et_confirm.getText().toString().trim().equalsIgnoreCase("")) {
                   et_confirm.setError("This field cannot be blank");
               }
               else
               {
                   Intent intent = new Intent(RegisterActivity.this, VerificationActivity.class);
                   startActivity(intent);
               }

           }
       });
    }
}
