package com.example.wovo;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PayslipsActivity  extends AppCompatActivity  implements PayslipAdapter.OnClickPayslips {


   RecyclerView rv_payslips;
   PayslipAdapter payslipAdapter;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payslips_activity);
        this.setTitle("Payslips");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        List<PayslipData> list = getData();
        rv_payslips = findViewById(R.id.rv_payslips);
        payslipAdapter = new PayslipAdapter(list, getApplication(),this);
        rv_payslips.setLayoutManager(new LinearLayoutManager(PayslipsActivity.this));
        rv_payslips.setAdapter(payslipAdapter);


    }

    private List<PayslipData> getData() {
        List<PayslipData> list = new ArrayList<>();
        list.add(new PayslipData("December Payslips", "December", "Read"));
        list.add(new PayslipData("December Payslips", "December", "Read"));
        list.add(new PayslipData("December Payslips", "December", "Read"));
        list.add(new PayslipData("December Payslips", "December", "Read"));
        list.add(new PayslipData("December Payslips", "December", "Read"));
        return list;
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

    public void OnClick() {
        CustomDialogClass cdd=new CustomDialogClass(PayslipsActivity.this);
        cdd.show();

    }





}
