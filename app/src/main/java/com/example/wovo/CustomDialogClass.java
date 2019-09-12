package com.example.wovo;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class CustomDialogClass  extends Dialog implements View.OnClickListener {

    public Activity c;
    EditText et_ei;
    Button bt_es;
    Dialog dialog;

    public CustomDialogClass(Activity a) {
        super(a);
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_payslips);
        et_ei = findViewById(R.id.et_ei);
        bt_es= findViewById(R.id.bt_es);
        bt_es.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_es: {
                if (et_ei.getText().toString().trim().equalsIgnoreCase("")) {
                    et_ei.setError("This field cannot be blank");
                } else {
                    dismiss();
                    Intent intent = new Intent(c,PayslipsNext.class);
                    c.startActivity(intent);
                }
            }
            break;
            default: break;
        }
    }
}

