package com.example.wovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotActivity extends AppCompatActivity {

    Button bt_submit;
    EditText et_cc,et_ee;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_activity);
        this.setTitle("Reset Password");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        et_cc=findViewById(R.id.et_cc);
        et_ee=findViewById(R.id.et_ee);

        bt_submit = findViewById(R.id.bt_submit);

        bt_submit.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (et_cc.getText().toString().trim().equalsIgnoreCase("")) {
                        et_cc.setError("This field cannot be blank");
                    }
                    if (et_ee.getText().toString().trim().equalsIgnoreCase("")) {
                        et_ee.setError("This field cannot be blank");
                    }

                    else {
                        Intent intent = new Intent(ForgotActivity.this, VerificationActivity.class);
                        startActivity(intent);
                    }
                }
                });
        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


}


