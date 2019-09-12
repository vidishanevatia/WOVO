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

public class ChangePasswordActivity extends AppCompatActivity {

    Button bt_submitPassword;
    EditText et_old,et_new1,et_new2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_password);
        bt_submitPassword= findViewById(R.id.bt_submitPassword);
        et_old= findViewById(R.id.et_old);
        et_new1= findViewById(R.id.et_new1);
        et_new2 = findViewById(R.id.et_new2);
        this.setTitle("Change password");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        bt_submitPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_old.getText().toString().trim().equalsIgnoreCase("")) {
                    et_old.setError("This field cannot be blank");
                }
                if (et_new1.getText().toString().trim().equalsIgnoreCase("")) {
                    et_new1.setError("This field cannot be blank");
                }
                if (et_new2.getText().toString().trim().equalsIgnoreCase("")) {
                    et_new2.setError("This field cannot be blank");
                }
                else if (!et_new1.getText().toString().trim().equals(et_new2.getText().toString())) {
                    et_new1.setError("Passwords don't match");
                    et_new2.setError("Passwords don't match");
                }
                else
                {
                    Intent intent = new Intent(ChangePasswordActivity.this, SettingsActivity.class);
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
